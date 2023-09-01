package main

import (
	"Server2/environment"
	"Server2/interfaces"
	"Server2/parser"
	"bytes"
	"encoding/json"
	"fmt"
	"io"
	"net/http"

	//"os"
	"strings"

	"github.com/antlr4-go/antlr/v4"
	"github.com/gofiber/fiber/v2"
	"github.com/gofiber/fiber/v2/middleware/cors"
)

type TreeShapeListener struct {
	*parser.BaseSwiftGrammarListener
	Code []interface{}
}

type Resp struct {
	Output   string
	Flag     bool
	Message  string
	Tabla    string
	TablaErr string
	CstImage string
}

type Message struct {
	Content string `json:"content"`
}

type MessageCST struct {
	Content string `json:"result"`
}

func handleInterpreter(c *fiber.Ctx) error {

	var message Message
	if err := c.BodyParser(&message); err != nil {
		return err
	}

	//Entrada
	code := message.Content
	//Leyendo entrada
	input := antlr.NewInputStream(code)
	lexer := parser.NewSwiftLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	contenido := CreateCST(code)

	//creacion de parser
	p := parser.NewSwiftGrammarParser(tokens)
	p.BuildParseTrees = true
	tree := p.S()
	//listener
	var listener *TreeShapeListener = NewTreeShapeListener()
	antlr.ParseTreeWalkerDefault.Walk(listener, tree)
	Code := listener.Code
	//create ast
	var Ast environment.AST
	//create env
	var globalEnv environment.Environment = environment.NewEnvironment(nil, "GLOBAL")

	//ejecución
	for _, inst := range Code {
		inst.(interfaces.Instruction).Ejecutar(&Ast, globalEnv)
	}
	var ConsoleOut = ""
	if Ast.GetErrors() == "" {
		ConsoleOut = Ast.GetPrint()
	} else {
		ConsoleOut = Ast.GetErrors()
	}
	tableHTML, err := globalEnv.PrintVariablesToFile()
	if err != nil {
		fmt.Println("Error al imprimir tabla de variables")
	}
	tableErr, err := Ast.PrintErrorsToFile()
	if err != nil {
		fmt.Println(tableErr)
	}
	response := Resp{
		Output:   ConsoleOut,
		Flag:     true,
		Message:  "<3 Ejecución realizada con éxito <3",
		Tabla:    tableHTML,
		TablaErr: tableErr,
		CstImage: contenido,
	}
	return c.Status(fiber.StatusOK).JSON(response)
}

func main() {
	app := fiber.New()
	app.Use(cors.New())
	app.Post("/Interpreter", handleInterpreter)
	app.Listen(":3002")
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitS(ctx *parser.SContext) {
	this.Code = ctx.GetCode()
}

func CreateCST(input string) string {
	input = strings.ReplaceAll(input, "\"", "\\\"")
	url := "http://lab.antlr.org/parse/"
	payload := []byte(`{"grammar":"grammar SwiftGrammar; \r\n// import SwiftLexer; \r\n\r\noptions {\r\n  tokenVocab = SwiftLexer;\r\n}\r\n\r\n@header {\r\n    import \"Server2/interfaces\"\r\n    import \"Server2/environment\"\r\n    import \"Server2/expressions\"\r\n    import \"Server2/instructions\"\r\n    import \"strings\"\r\n}\r\n\r\n\r\ns returns [[]interface{} code]\r\n: block EOF\r\n    {   \r\n        $code = $block.blk\r\n    }\r\n;\r\n\r\nblock returns [[]interface{} blk]\r\n@init{\r\n    $blk = []interface{}{}\r\n    var listInt []IInstructionContext\r\n  }\r\n: ins+=instruction+\r\n    {\r\n        listInt = localctx.(*BlockContext).GetIns()\r\n        for _, e := range listInt {\r\n            $blk = append($blk, e.GetInst())\r\n        }\r\n    }\r\n;\r\n\r\n\r\ninstruction returns [interfaces.Instruction inst]\r\n: printstmt { $inst = $printstmt.prnt}\r\n| ifstmt { $inst = $ifstmt.ifinst }\r\n| declarationstmt { $inst = $declarationstmt.dec }\r\n| whilestmt { $inst = $whilestmt.whl }\r\n| assignstmt { $inst = $assignstmt.asg }\r\n| forstmt { $inst = $forstmt.fr }\r\n| guardstmt { $inst = $guardstmt.grd }\r\n| breakstmt { $inst = $breakstmt.brk }\r\n| continuestmt { $inst = $continuestmt.cnt }\r\n| fnArray { $inst = $fnArray.p }\r\n//| switchstmt { $inst = $switchstmt.swt }\r\n// | returnstmt { $inst = $returnstmt.ret }\r\n;\r\n\r\nprintstmt returns [interfaces.Instruction prnt]\r\n: PRINT PARIZQ expr PARDER { $prnt = instructions.NewPrint($PRINT.line,$PRINT.pos,$expr.e)}\r\n| PRINT PARIZQ exprComa PARDER { $prnt = instructions.NewPrint($PRINT.line,$PRINT.pos,$exprComa.t)}\r\n;\r\n\r\nifstmt returns [interfaces.Instruction ifinst]\r\n    : IF expr LLAVEIZQ block LLAVEDER { $ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $block.blk, nil) }\r\n    | IF expr LLAVEIZQ e1=block LLAVEDER ELSE LLAVEIZQ e2=block LLAVEDER { $ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $e1.blk, $e2.blk) }\r\n    | IF expr LLAVEIZQ block LLAVEDER ELSE ifstmt { $ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $block.blk, []interface{}{$ifstmt.ifinst}) }\r\n;\r\n\r\nwhilestmt returns [interfaces.Instruction whl]\r\n    : WHILE expr LLAVEIZQ block LLAVEDER { $whl = instructions.NewWhile($WHILE.line, $WHILE.pos, $expr.e, $block.blk) }\r\n;\r\n\r\ndeclarationstmt returns [interfaces.Instruction dec]\r\n: VAR ID D_PTS types IG expr  { $dec = instructions.NewDeclaration($VAR.line, $VAR.pos, $ID.text, $types.ty, $expr.e, true) }\r\n| VAR ID op=IG types PARIZQ expr PARDER { $dec = instructions.NewCastDeclaration($VAR.line, $VAR.pos, $ID.text, $types.ty, $expr.e) }\r\n| VAR ID D_PTS types  { $dec = instructions.NewDeclaration($VAR.line, $VAR.pos, $ID.text, $types.ty, nil, true) }\r\n| LET ID D_PTS types IG expr  { $dec = instructions.NewDeclaration($LET.line, $LET.pos, $ID.text, $types.ty, $expr.e, false) }\r\n| LET ID D_PTS types  { $dec = instructions.NewDeclaration($LET.line, $LET.pos, $ID.text, $types.ty, nil, false) }\r\n;\r\n\r\nassignstmt returns [interfaces.Instruction asg]\r\n: ID op=IG expr { $asg = instructions.NewAssign($ID.line, $ID.pos, $ID.text, $expr.e) }\r\n| ID op=(SUB_IG | SUM_IG) expr { $asg = instructions.NewImplicitAssignment($ID.line, $ID.pos, $ID.text, $op.text, $expr.e); }\r\n;\r\n\r\nforstmt returns [interfaces.Instruction fr]\r\n: FOR ID IN exp1=expr PUNTO PUNTO PUNTO exp2=expr LLAVEIZQ block LLAVEDER { $fr = instructions.NewForIn($FOR.line, $FOR.pos, $ID.text, $exp1.e, $exp2.e, $block.blk); }\r\n| FOR ID IN expr LLAVEIZQ block LLAVEDER { $fr = instructions.NewFor($FOR.line, $FOR.pos, $ID.text, $expr.e, $block.blk); }\r\n;\r\n\r\nguardstmt returns [interfaces.Instruction grd]\r\n: GUARD expr ELSE LLAVEIZQ block LLAVEDER { $grd = instructions.NewGuard($GUARD.line, $GUARD.pos, $expr.e, $block.blk) }\r\n;\r\n\r\n// switchstmt returns [interfaces.Instruction swt]\r\n// : SWITCH expr LLAVEIZQ cases LLAVEDER { $swt = instructions.NewSwitch($SWITCH.line, $SWITCH.pos, $expr.e, $cases.cases) }\r\n// ;\r\n\r\n// cases returns [interfaces.Cases cases]\r\n// : case+=case+\r\n//     {\r\n//         var arr []interfaces.Case\r\n//         for _, e := range $case {\r\n//             arr = append(arr, e.c)\r\n//         }\r\n//         $cases = instructions.NewCases(arr)\r\n//     }\r\n// ;\r\n\r\n// case returns [interfaces.Case c]\r\n// : CASE expr D_PTS block { $c = instructions.NewCase($CASE.line, $CASE.pos, $expr.e, $block.blk) }\r\n// | RETURN expr D_PTS block { $c = instructions.NewCase($RETURN.line, $RETURN.pos, $expr.e, $block.blk) }\r\n// ;\r\n\r\nbreakstmt returns [interfaces.Instruction brk]\r\n: BREAK { $brk = instructions.NewBreak($BREAK.line, $BREAK.pos) }\r\n;\r\n\r\ncontinuestmt returns [interfaces.Instruction cnt]\r\n: CONTINUE { $cnt = instructions.NewContinue($CONTINUE.line, $CONTINUE.pos) }\r\n;\r\n\r\nreturnstmt returns [interfaces.Instruction ret]\r\n: RETURN expr { $ret = instructions.NewReturn($RETURN.line, $RETURN.pos, $expr.e) }\r\n| RETURN { $ret = instructions.NewReturn($RETURN.line, $RETURN.pos, nil) }\r\n;\r\n\r\nfnArray returns[interfaces.Instruction p]\r\n: ID PUNTO APPEND PARIZQ expr PARDER { $p = instructions.NewAppend($ID.line, $ID.pos, $ID.text, $expr.e) }\r\n| ID PUNTO REMOVE PARIZQ AT D_PTS expr PARDER { $p = instructions.NewRemoveAt($ID.line, $ID.pos, $ID.text, $expr.e) }\r\n| ID PUNTO REMOVELAST PARIZQ PARDER { $p = instructions.NewRemoveLast($ID.line, $ID.pos, $ID.text) }\r\n;\r\n\r\n// fnstmt returns[interfaces.Instruction fn]\r\n// : FUNC ID PARIZQ listParams PARDER FLECHA types LLAVEIZQ block LLAVEDER { $fn = instructions.NewFunction($FUNC.line, $FUNC.pos, $ID.text, $listParams.l, $types.ty, $block.blk) }\r\n// | FUNC ID PARIZQ listParams PARDER LLAVEIZQ block LLAVEDER { $fn = instructions.NewFunction($FUNC.line, $FUNC.pos, $ID.text, $listParams.l, nil, $block.blk) }\r\n// ; \r\n\r\ntypes returns[environment.TipoExpresion ty]\r\n: INT { $ty = environment.INTEGER }\r\n| FLOAT { $ty = environment.FLOAT }\r\n| STR { $ty = environment.STRING }\r\n| BOOL { $ty = environment.BOOLEAN }\r\n| CORIZQ types CORDER { $ty = environment.ARRAY }\r\n| COMILLA STR COMILLA { $ty = environment.STR }\r\n| NIL { $ty = environment.NIL }\r\n;\r\n\r\nexpr returns [interfaces.Expression e]\r\n: SUB opDe=expr {$e = expressions.NewOperation($SUB.line,$SUB.pos,$opDe.e,\"NEGACION\",nil)}\r\n| types PARIZQ expr PARDER { $e = expressions.NewCast($types.start.GetLine(), $types.start.GetColumn(), $types.ty, $expr.e) }\r\n| left=expr op=(SUB_IG|SUM_IG) expr { $e = expressions.NewOperation($op.line, $op.pos, nil, $op.text, $expr.e) }\r\n| left=expr op=(MUL|DIV|MOD) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }\r\n| left=expr op=(ADD|SUB) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }\r\n| left=expr op=(MAY_IG|MAYOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }\r\n| left=expr op=(MEN_IG|MENOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }\r\n| left=expr op=(IG_IG|DIF) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }\r\n| left=expr op=AND right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }\r\n| left=expr op=OR right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }\r\n| PARIZQ expr PARDER { $e = $expr.e }\r\n| CORIZQ CORDER { $e = expressions.NewArray($CORIZQ.line, $CORIZQ.pos, nil) }\r\n| list=listArray { $e = $list.p}\r\n| CORIZQ listParams CORDER { $e = expressions.NewArray($CORIZQ.line, $CORIZQ.pos, $listParams.l) }\r\n| NUMBER\r\n    {\r\n        if (strings.Contains($NUMBER.text,\".\")){\r\n            num,err := strconv.ParseFloat($NUMBER.text, 64);\r\n            if err!= nil{\r\n                fmt.Println(err)\r\n            }\r\n            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num,environment.FLOAT)\r\n        }else{\r\n            num,err := strconv.Atoi($NUMBER.text)\r\n            if err!= nil{\r\n                fmt.Println(err)\r\n            }\r\n            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num,environment.INTEGER)\r\n        }\r\n    }\r\n| STRING\r\n    {\r\n        str := $STRING.text\r\n        $e = expressions.NewPrimitive($STRING.line, $STRING.pos, str[1:len(str)-1],environment.STRING)\r\n    }\r\n| TRU { $e = expressions.NewPrimitive($TRU.line, $TRU.pos, true, environment.BOOLEAN) }\r\n| FAL { $e = expressions.NewPrimitive($FAL.line, $FAL.pos, false, environment.BOOLEAN) }\r\n| ID PUNTO COUNT { $e = expressions.NewCount($ID.line, $ID.pos, $ID.text) }\r\n| ID PUNTO ISEMPTY { $e = expressions.NewIsEmpty($ID.line, $ID.pos, $ID.text) }\r\n| NIL { $e = expressions.NewPrimitive($NIL.line, $NIL.pos, nil, environment.NIL) }\r\n;\r\n\r\n\r\nlistParams returns[[]interface{} l]\r\n: list=listParams COMA expr {\r\n                                var arr []interface{}\r\n                                arr = append($list.l, $expr.e)\r\n                                $l = arr\r\n                            }   \r\n| expr {\r\n            $l = []interface{}{}\r\n            $l = append($l, $expr.e)\r\n        }\r\n;\r\n\r\nlistArray returns[interfaces.Expression p]\r\n: list = listArray types IG CORIZQ expr CORDER { $p = expressions.NewArrayAccess($list.start.GetLine(), $list.start.GetColumn(), $list.p, $expr.e) }\r\n| ID { $p = expressions.NewCallVar($ID.line, $ID.pos, $ID.text)}\r\n;\r\n\r\nexprComa returns[interfaces.Expression t]\r\n: left=expr op=COMA right=expr { $t = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }\r\n;","lexgrammar":"lexer grammar SwiftLexer;\r\n\r\n// --------------- Tokens\r\n// types\r\nINT: 'Int';\r\nFLOAT: 'Float';\r\nBOOL: 'Bool';\r\nSTR: 'String';\r\nCHAR: 'Character';\r\n\r\n\r\n\r\n// reserved words\r\nVAR: 'var';\r\nLET: 'let';\r\nVOID: 'void';\r\nTRU: 'true';\r\nFAL: 'false';\r\nPRINT: 'print';\r\nIF: 'if';\r\nELSE: 'else';\r\nWHILE: 'while';\r\nFOR: 'for';\r\nIN: 'in';\r\nSWITCH: 'switch';\r\nCASE: 'case';\r\nDEFAULT: 'default';\r\nBREAK: 'break';\r\nRETURN: 'return';\r\nCONTINUE: 'continue';\r\nGUARD: 'guard';\r\nFUNC: 'func';\r\nNIL: 'nil';\r\nSTRUCT: 'struct';\r\nMUTATING: 'mutating';\r\nSELF: 'self';\r\nINOUT: 'inout';\r\n\r\n\r\n//FUNCTIONS\r\nAPPEND: 'append';\r\nREMOVELAST: 'removeLast';\r\nREMOVE: 'remove';\r\nAT: 'at';\r\nISEMPTY: 'isEmpty';\r\nCOUNT: 'count';\r\n\r\n// primitives\r\nNUMBER : [0-9]+ ('.'[0-9]+)?;\r\nSTRING: '\"'~[\"]*'\"';\r\nID: ([a-zA-Z])[a-zA-Z0-9_]*;\r\n\r\n// symbols\r\n\r\nDIF:      '!=';\r\nIG_IG:          '==';\r\nNOT:            '!';\r\nOR:             '||';\r\nAND:            '&&';\r\nIG:          '=';\r\nMAY_IG:     '>=';\r\nMEN_IG:     '<=';\r\nSUM_IG:     '+=';\r\nSUB_IG:     '-=';\r\nMAYOR:          '>';\r\nMENOR:          '<';\r\nMUL:            '*';\r\nDIV:            '/';\r\nADD:            '+';\r\nSUB:            '-';\r\nMOD:            '%';\r\nPARIZQ:         '(';\r\nPARDER:         ')';\r\nLLAVEIZQ:       '{';\r\nLLAVEDER:       '}';\r\nD_PTS:          ':';\r\nCORIZQ:         '[';\r\nCORDER:         ']';\r\nCOMA:           ',';\r\nPUNTO:          '.';\r\nCOMILLA:        '\"';\r\nFLECHA:         '->';\r\n\r\n// skip\r\nWHITESPACE: [ \\\\\\r\\n\\t]+ -> skip;\r\nCOMMENT : '/*' .*? '*/' -> skip;\r\nLINE_COMMENT : '//' ~[\\r\\n]* -> skip;\r\n\r\nfragment\r\nESC_SEQ\r\n    :   '\\\\' ('\\\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ')\r\n    ;\r\n\r\n","input":"` + input + `","start":"s"}`)

	req, err := http.NewRequest("POST", url, bytes.NewBuffer(payload))

	if err != nil {
		fmt.Println("Error creating request:", err)
		return ""
	}
	req.Header.Set("Content-Type", "application/json")
	client := &http.Client{}
	resp, err := client.Do(req)
	if err != nil {
		fmt.Println("Error sending request:", err)
		return ""
	}
	defer resp.Body.Close()
	fmt.Println("Response Status:", resp.Status)

	body, err := io.ReadAll(resp.Body)
	if err != nil {
		fmt.Println("Error reading body:", err)
		return ""
	}

	var data map[string]interface{}
	err = json.Unmarshal(body, &data)
	if err != nil {
		fmt.Println("Error unmarshalling json:", err)
		return ""
	}

	result := data["result"].(map[string]interface{})
	// err = os.WriteFile("cst.svg", []byte(result["svgtree"].(string)), 0644)
	// if err != nil {
	// 	fmt.Println("Error creating file:", err)
	// 	return ""
	// }

	return result["svgtree"].(string)

}

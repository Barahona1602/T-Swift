grammar SwiftGrammar; 
// import SwiftLexer; 

options {
  tokenVocab = SwiftLexer;
}

@header {
    import "Server2/interfaces"
    import "Server2/environment"
    import "Server2/expressions"
    import "Server2/instructions"
    import "strings"
}


s returns [[]interface{} code]
: block EOF
    {   
        $code = $block.blk
    }
;

block returns [[]interface{} blk]
@init{
    $blk = []interface{}{}
    var listInt []IInstructionContext
  }
: ins+=instruction+
    {
        listInt = localctx.(*BlockContext).GetIns()
        for _, e := range listInt {
            $blk = append($blk, e.GetInst())
        }
    }
;


instruction returns [interfaces.Instruction inst]
: printstmt { $inst = $printstmt.prnt}
| ifstmt { $inst = $ifstmt.ifinst }
| declarationstmt { $inst = $declarationstmt.dec }
| whilestmt { $inst = $whilestmt.whl }
| assignstmt { $inst = $assignstmt.asg }
| forstmt { $inst = $forstmt.fr }
| guardstmt { $inst = $guardstmt.grd }
| breakstmt { $inst = $breakstmt.brk }
| continuestmt { $inst = $continuestmt.cnt }
| fnArray { $inst = $fnArray.p }
//| switchstmt { $inst = $switchstmt.swt }
// | returnstmt { $inst = $returnstmt.ret }
;

printstmt returns [interfaces.Instruction prnt]
: PRINT PARIZQ expr PARDER { $prnt = instructions.NewPrint($PRINT.line,$PRINT.pos,$expr.e)}
;

ifstmt returns [interfaces.Instruction ifinst]
    : IF expr LLAVEIZQ block LLAVEDER { $ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $block.blk, nil) }
    | IF expr LLAVEIZQ e1=block LLAVEDER ELSE LLAVEIZQ e2=block LLAVEDER { $ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $e1.blk, $e2.blk) }
    | IF expr LLAVEIZQ block LLAVEDER ELSE ifstmt { $ifinst = instructions.NewIf($IF.line, $IF.pos, $expr.e, $block.blk, []interface{}{$ifstmt.ifinst}) }
;

whilestmt returns [interfaces.Instruction whl]
    : WHILE expr LLAVEIZQ block LLAVEDER { $whl = instructions.NewWhile($WHILE.line, $WHILE.pos, $expr.e, $block.blk) }
;

declarationstmt returns [interfaces.Instruction dec]
: VAR ID D_PTS types IG expr  { $dec = instructions.NewDeclaration($VAR.line, $VAR.pos, $ID.text, $types.ty, $expr.e) }
| LET ID D_PTS types IG expr  { $dec = instructions.NewDeclaration($LET.line, $LET.pos, $ID.text, $types.ty, $expr.e) }
;

assignstmt returns [interfaces.Instruction asg]
: ID op=IG expr { $asg = instructions.NewAssign($ID.line, $ID.pos, $ID.text, $expr.e) }
| ID op=(SUB_IG | SUM_IG) expr { $asg = instructions.NewImplicitAssignment($ID.line, $ID.pos, $ID.text, $op.text, $expr.e); }
;

forstmt returns [interfaces.Instruction fr]
: FOR ID IN exp1=expr PUNTO PUNTO PUNTO exp2=expr LLAVEIZQ block LLAVEDER { $fr = instructions.NewForIn($FOR.line, $FOR.pos, $ID.text, $exp1.e, $exp2.e, $block.blk); }
| FOR ID IN expr LLAVEIZQ block LLAVEDER { $fr = instructions.NewFor($FOR.line, $FOR.pos, $ID.text, $expr.e, $block.blk); }
;

guardstmt returns [interfaces.Instruction grd]
: GUARD expr ELSE LLAVEIZQ block LLAVEDER { $grd = instructions.NewGuard($GUARD.line, $GUARD.pos, $expr.e, $block.blk) }
;

// switchstmt returns [interfaces.Instruction swt]
// : SWITCH expr LLAVEIZQ cases LLAVEDER { $swt = instructions.NewSwitch($SWITCH.line, $SWITCH.pos, $expr.e, $cases.cases) }
// ;

// cases returns [interfaces.Cases cases]
// : case+=case+
//     {
//         var arr []interfaces.Case
//         for _, e := range $case {
//             arr = append(arr, e.c)
//         }
//         $cases = instructions.NewCases(arr)
//     }
// ;

// case returns [interfaces.Case c]
// : CASE expr D_PTS block { $c = instructions.NewCase($CASE.line, $CASE.pos, $expr.e, $block.blk) }
// | RETURN expr D_PTS block { $c = instructions.NewCase($RETURN.line, $RETURN.pos, $expr.e, $block.blk) }
// ;

breakstmt returns [interfaces.Instruction brk]
: BREAK { $brk = instructions.NewBreak($BREAK.line, $BREAK.pos) }
;

continuestmt returns [interfaces.Instruction cnt]
: CONTINUE { $cnt = instructions.NewContinue($CONTINUE.line, $CONTINUE.pos) }
;

// returnstmt returns [interfaces.Instruction ret]
// : RETURN expr { $ret = instructions.NewReturn($RETURN.line, $RETURN.pos, $expr.e) }
// | RETURN { $ret = instructions.NewReturn($RETURN.line, $RETURN.pos, nil) }
// ;

fnArray returns[interfaces.Instruction p]
: ID PUNTO APPEND PARIZQ expr PARDER { $p = instructions.NewAppend($ID.line, $ID.pos, $ID.text, $expr.e) }
| ID PUNTO REMOVE PARIZQ AT D_PTS expr PARDER { $p = instructions.NewRemoveAt($ID.line, $ID.pos, $ID.text, $expr.e) }
| ID PUNTO REMOVELAST PARIZQ PARDER { $p = instructions.NewRemoveLast($ID.line, $ID.pos, $ID.text) }
;

types returns[environment.TipoExpresion ty]
: INT { $ty = environment.INTEGER }
| FLOAT { $ty = environment.FLOAT }
| STR { $ty = environment.STRING }
| BOOL { $ty = environment.BOOLEAN }
| CORIZQ types CORDER { $ty = environment.ARRAY }
| COMILLA STR COMILLA { $ty = environment.STR }
;

expr returns [interfaces.Expression e]
: SUB opDe=expr {$e = expressions.NewOperation($SUB.line,$SUB.pos,$opDe.e,"NEGACION",nil)}
| left=expr op=(SUB_IG|SUM_IG) expr { $e = expressions.NewOperation($op.line, $op.pos, nil, $op.text, $expr.e) }
| left=expr op=(MUL|DIV|MOD) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(ADD|SUB) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MAY_IG|MAYOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MEN_IG|MENOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(IG_IG|DIF) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=AND right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=OR right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| PARIZQ expr PARDER { $e = $expr.e }
| CORIZQ CORDER { $e = expressions.NewArray($CORIZQ.line, $CORIZQ.pos, nil) }
| list=listArray { $e = $list.p}
| CORIZQ listParams CORDER { $e = expressions.NewArray($CORIZQ.line, $CORIZQ.pos, $listParams.l) }
| NUMBER
    {
        if (strings.Contains($NUMBER.text,".")){
            num,err := strconv.ParseFloat($NUMBER.text, 64);
            if err!= nil{
                fmt.Println(err)
            }
            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num,environment.FLOAT)
        }else{
            num,err := strconv.Atoi($NUMBER.text)
            if err!= nil{
                fmt.Println(err)
            }
            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num,environment.INTEGER)
        }
    }
| STRING
    {
        str := $STRING.text
        $e = expressions.NewPrimitive($STRING.line, $STRING.pos, str[1:len(str)-1],environment.STRING)
    }
| TRU { $e = expressions.NewPrimitive($TRU.line, $TRU.pos, true, environment.BOOLEAN) }
| FAL { $e = expressions.NewPrimitive($FAL.line, $FAL.pos, false, environment.BOOLEAN) }
| ID PUNTO COUNT { $e = expressions.NewCount($ID.line, $ID.pos, $ID.text) }
| ID PUNTO ISEMPTY { $e = expressions.NewIsEmpty($ID.line, $ID.pos, $ID.text) }
;


listParams returns[[]interface{} l]
: list=listParams COMA expr {
                                var arr []interface{}
                                arr = append($list.l, $expr.e)
                                $l = arr
                            }   
| expr {
            $l = []interface{}{}
            $l = append($l, $expr.e)
        }
;

listArray returns[interfaces.Expression p]
: list = listArray types CORIZQ expr CORDER { $p = expressions.NewArrayAccess($list.start.GetLine(), $list.start.GetColumn(), $list.p, $expr.e) }
| ID { $p = expressions.NewCallVar($ID.line, $ID.pos, $ID.text)}
;


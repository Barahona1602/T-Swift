package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
	"fmt"
)

type Return struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
}

func NewReturn(lin int, col int, exp interfaces.Expression) Return {
	breakInstr := Return{lin, col, exp}
	return breakInstr
}

func (p Return) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var result environment.Symbol
	//validar que esté dentro de funcion
	if env.(environment.Environment).FuncValidation() {
		if p.Expresion == nil { //RETURN SIN VALOR
			result = environment.Symbol{
				Lin:        p.Lin,
				Col:        p.Col,
				Id:         "",
				Tipo:       environment.NIL,
				Valor:      nil,
				Mutable:    true,
				ReturnFlag: true,
			}
			return result
		} else { //RETURN CON VALOR
			tmpVal := p.Expresion.Ejecutar(ast, env)
			result = environment.Symbol{
				Lin:        p.Lin,
				Col:        p.Col,
				Id:         tmpVal.Id,
				Tipo:       tmpVal.Tipo,
				Valor:      tmpVal.Valor,
				Mutable:    true,
				ReturnFlag: true,
			}
		}
	} else {
		fmt.Println("Error sentencia return")
	}
	return result
}

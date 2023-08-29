package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
)

type Return struct {
	Lin        int
	Col        int
	Expression interfaces.Expression
}

func NewReturn(lin int, col int, expr interfaces.Expression) Return {
	return Return{Lin: lin, Col: col, Expression: expr}
}

func (p Return) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	if p.Expression != nil {
		returnValue := p.Expression.Ejecutar(ast, env)
		return environment.Symbol{
			Lin:   p.Lin,
			Col:   p.Col,
			Id:    "",
			Tipo:  returnValue.Tipo,
			Valor: returnValue.Valor,
		}
	}

	return environment.Symbol{
		Lin:        p.Lin,
		Col:        p.Col,
		Id:         "",
		Tipo:       environment.NIL,
		Valor:      nil,
		Mutable:    true,
		ReturnFlag: true,
	}
}

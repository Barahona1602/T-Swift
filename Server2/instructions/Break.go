package instructions

import (
	"Server2/environment"
)

type Break struct {
	Lin int
	Col int
}

func NewBreak(lin int, col int) Break {
	breakInstr := Break{lin, col}
	return breakInstr
}

func (p Break) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	result := environment.Symbol{
		Lin:       p.Lin,
		Col:       p.Col,
		Id:        "",
		Tipo:      environment.NIL,
		Valor:     nil,
		Mutable:   true,
		BreakFlag: true,
	}

	return result
}

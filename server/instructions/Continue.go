package instructions

import (
	"Server2/environment"
)

type Continue struct {
	Lin int
	Col int
}

func NewContinue(lin int, col int) Continue {
	continueInstr := Continue{Lin: lin, Col: col}
	return continueInstr
}

func (c Continue) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	result := environment.Symbol{
		Lin:          c.Lin,
		Col:          c.Col,
		Id:           "",
		Tipo:         environment.NIL,
		Valor:        nil,
		Mutable:      true,
		ContinueFlag: true,
	}
	return result
}

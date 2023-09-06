package instructions

import (
	"Server2/environment"
)

type ParamsDeclaration struct {
	Lin     int
	Col     int
	Id      string
	Externo string
	Tipo    environment.TipoExpresion
	Inout   bool
}

func NewParams(lin int, col int, id string, ex string, tip environment.TipoExpresion, ino bool) ParamsDeclaration {
	instr := ParamsDeclaration{lin, col, id, ex, tip, ino}
	return instr
}

func (p ParamsDeclaration) Ejecutar(ast *environment.AST, env interface{}) interface{} {

	var result environment.Symbol

	result = environment.Symbol{
		Lin:     p.Lin,
		Col:     p.Col,
		Id:      p.Id,
		Tipo:    p.Tipo,
		Externo: p.Externo,
		Inout:   p.Inout,
		Valor:   0,
	}

	env.(environment.Environment).SaveVariable(p.Id, result)

	return result
}

package expressions

import (
	"Server2/environment"
)

type IsEmpty struct {
	Lin    int
	Col    int
	ListID string
}

func NewIsEmpty(lin int, col int, listID string) IsEmpty {
	return IsEmpty{Lin: lin, Col: col, ListID: listID}
}

func (p IsEmpty) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	listSymbol := env.(environment.Environment).GetVariable(p.ListID)
	listValue, isList := listSymbol.Valor.([]interface{})
	if !isList {
		ast.SetError("'" + p.ListID + "' no es una lista")
	}

	isEmpty := len(listValue) == 0

	return environment.Symbol{
		Lin:   p.Lin,
		Col:   p.Col,
		Tipo:  environment.BOOLEAN,
		Valor: isEmpty,
	}
}

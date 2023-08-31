package expressions

import (
	"Server2/environment"
)

type Count struct {
	Lin    int
	Col    int
	ListID string
}

func NewCount(lin int, col int, listID string) Count {
	return Count{Lin: lin, Col: col, ListID: listID}
}

func (p Count) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	listSymbol := env.(environment.Environment).GetVariable(p.ListID)
	listValue, isList := listSymbol.Valor.([]interface{})
	if !isList {
		ast.SetError("'"+p.ListID+"' no es una lista", p.Lin, p.Col)
	}

	count := len(listValue)

	return environment.Symbol{
		Lin:   p.Lin,
		Col:   p.Col,
		Tipo:  environment.INTEGER,
		Valor: count,
	}
}

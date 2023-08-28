package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
)

type Append struct {
	Lin        int
	Col        int
	ListID     string
	Expression interfaces.Expression
}

func NewAppend(lin int, col int, listID string, expr interfaces.Expression) Append {
	return Append{Lin: lin, Col: col, ListID: listID, Expression: expr}
}

func (p Append) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	listSymbol := env.(environment.Environment).GetVariable(p.ListID)
	listValue, isList := listSymbol.Valor.([]interface{})
	if !isList {
		ast.SetError("'" + p.ListID + "' no es una lista")
		return nil
	}

	elementValue := p.Expression.Ejecutar(ast, env)
	// Aquí puedes realizar verificaciones adicionales del tipo de elemento, si es necesario

	// Crear una nueva lista actualizada y agregar el elemento a ella
	updatedListValue := append(listValue, elementValue)

	// Actualizar la variable en el entorno con la nueva lista
	env.(environment.Environment).SetVariable(p.ListID, environment.Symbol{
		Lin:   p.Lin,
		Col:   p.Col,
		Tipo:  environment.ARRAY,
		Valor: updatedListValue,
	})

	return nil
}

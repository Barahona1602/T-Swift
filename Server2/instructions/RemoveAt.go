package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
)

type RemoveAt struct {
	Lin      int
	Col      int
	ListID   string
	Position interfaces.Expression
}

func NewRemoveAt(lin int, col int, listID string, position interfaces.Expression) RemoveAt {
	return RemoveAt{Lin: lin, Col: col, ListID: listID, Position: position}
}

func (p RemoveAt) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	listSymbol := env.(environment.Environment).GetVariable(p.ListID)
	listValue, isList := listSymbol.Valor.([]interface{})
	if !isList {
		ast.SetError("'" + p.ListID + "' no es una lista")
		return nil
	}

	positionValue := p.Position.Ejecutar(ast, env)
	if positionValue.Tipo != environment.INTEGER {
		ast.SetError("La posición debe ser un valor entero")
		return nil
	}

	positionIndex := positionValue.Valor.(int)
	if positionIndex < 0 || positionIndex >= len(listValue) {
		ast.SetError("La posición está fuera de los límites de la lista")
		return nil
	}

	// Crear una nueva lista sin el elemento en la posición dada
	updatedListValue := append(listValue[:positionIndex], listValue[positionIndex+1:]...)

	// Actualizar la variable en el entorno con la nueva lista
	env.(environment.Environment).SetVariable(p.ListID, environment.Symbol{
		Lin:   p.Lin,
		Col:   p.Col,
		Tipo:  environment.ARRAY,
		Valor: updatedListValue,
	})

	return nil
}

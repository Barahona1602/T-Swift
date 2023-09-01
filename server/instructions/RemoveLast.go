package instructions

import (
	"Server2/environment"
)

type RemoveLast struct {
	Lin    int
	Col    int
	ListID string
}

func NewRemoveLast(lin int, col int, listID string) RemoveLast {
	return RemoveLast{Lin: lin, Col: col, ListID: listID}
}

func (p RemoveLast) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	listSymbol := env.(environment.Environment).GetVariable(p.ListID)
	listValue, isList := listSymbol.Valor.([]interface{})
	if !isList {
		ast.SetError("'"+p.ListID+"' no es una lista", p.Lin, p.Col)
		return nil
	}

	// Verificar si la lista está vacía antes de eliminar el último elemento
	if len(listValue) == 0 {
		ast.SetError("La lista '"+p.ListID+"' está vacía, no se puede eliminar el último elemento", p.Lin, p.Col)
		return nil
	}

	// Crear una nueva lista con el último elemento removido
	updatedListValue := listValue[:len(listValue)-1]

	// Actualizar la variable en el entorno con la nueva lista
	env.(environment.Environment).SetVariable(p.ListID, environment.Symbol{
		Lin:   p.Lin,
		Col:   p.Col,
		Tipo:  environment.ARRAY,
		Valor: updatedListValue,
	})

	return nil
}

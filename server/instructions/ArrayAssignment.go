package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
	"fmt"
)

type ArrayAssign struct {
	Lin     int
	Col     int
	Id      string
	ListExp []interface{}
	Exp     interfaces.Expression
}

func NewArrayAssign(lin int, col int, iden string, list []interface{}, expr interfaces.Expression) ArrayAssign {
	instr := ArrayAssign{Lin: lin, Col: col, Id: iden, ListExp: list, Exp: expr}
	return instr
}

func (p ArrayAssign) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var result, newVal environment.Symbol
	var expList []interface{}

	newVal = p.Exp.Ejecutar(ast, env)
	result = env.(environment.Environment).GetVariable(p.Id) // Obtener array
	expList = make([]interface{}, len(p.ListExp))
	for i, exp := range p.ListExp {
		tempIndex := exp.(interfaces.Expression).Ejecutar(ast, env)
		if tempIndex.Tipo != environment.INTEGER {
			fmt.Println("Error indice incorrecto")
			return result
		}
		expList[i] = tempIndex.Valor // Agregar valores a lista
	}

	result = p.ReplaceArray(result, expList, newVal)        // Asignar nuevo valor a index
	env.(environment.Environment).SetVariable(p.Id, result) // Setear arreglo final
	return result
}

func (p ArrayAssign) ReplaceArray(array environment.Symbol, indexList []interface{}, newVal environment.Symbol) environment.Symbol {
	var result environment.Symbol
	var tempList []interface{}
	cloneIndex := make([]interface{}, len(indexList)) // Clonando lista
	copy(cloneIndex, indexList)
	index := indexList[0]                             // Extrayendo indice
	contIndex := 0                                    // Contador
	for _, val := range array.Valor.([]interface{}) { // Recorrer el array de simbolos
		if contIndex == index.(int) { // Comparando indices
			if (val.(environment.Symbol).Tipo == environment.ARRAY) && (len(cloneIndex) > 1) { // ¿Es array? ¿Y hay más indices?
				cloneIndex = cloneIndex[1:]                                                               // Eliminando indice matcheado
				tempList = append(tempList, p.ReplaceArray(val.(environment.Symbol), cloneIndex, newVal)) // Recursividad
			} else {
				if val.(environment.Symbol).Tipo == newVal.Tipo {
					tempList = append(tempList, newVal) // Hace match con no lista y lo reemplaza
				} else {
					fmt.Println("Error los tipos no coinciden") // Error
					tempList = append(tempList, val)
				}
			}
		} else {
			tempList = append(tempList, val) // No hace match y agrega
		}
		contIndex++ // Suma contador indice
	}
	result = environment.Symbol{Lin: array.Lin, Col: array.Col, Id: array.Id, Tipo: array.Tipo, Valor: tempList, Mutable: array.Mutable}
	return result
}

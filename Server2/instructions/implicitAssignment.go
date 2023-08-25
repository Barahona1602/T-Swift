package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
	"fmt"
)

type ImplicitAssignment struct {
	Lin       int
	Col       int
	Id        string
	Operator  string
	Expresion interfaces.Expression
}

func NewImplicitAssignment(lin int, col int, id string, operator string, val interfaces.Expression) ImplicitAssignment {
	instr := ImplicitAssignment{lin, col, id, operator, val}
	return instr
}

func (ia ImplicitAssignment) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var result environment.Symbol

	// Get the current value of the variable
	currentValue := env.(environment.Environment).GetVariable(ia.Id)

	// Execute the expression on the right-hand side
	rightValue := ia.Expresion.Ejecutar(ast, env)

	// Perform the assignment based on the operator
	switch ia.Operator {
	case "+=":
		result = performAddition(currentValue, rightValue)
	case "-=":
		result = performSubtraction(currentValue, rightValue)
	default:
		ast.SetError("ERROR: Invalid implicit assignment operator")
		return nil
	}

	// Update the variable in the environment
	env.(environment.Environment).SetVariable(ia.Id, result)

	return result
}

func performAddition(left environment.Symbol, right environment.Symbol) environment.Symbol {
	// Check if the data types are compatible for addition
	if left.Tipo == environment.INTEGER && right.Tipo == environment.INTEGER {
		resultValue := left.Valor.(int) + right.Valor.(int)
		return environment.Symbol{Tipo: environment.INTEGER, Valor: resultValue}
	} else if left.Tipo == environment.FLOAT && right.Tipo == environment.FLOAT {
		resultValue := left.Valor.(float64) + right.Valor.(float64)
		return environment.Symbol{Tipo: environment.FLOAT, Valor: resultValue}
	} else if left.Tipo == environment.STRING && right.Tipo == environment.STRING {
		resultValue := fmt.Sprintf("%v%v", left.Valor, right.Valor)
		return environment.Symbol{Tipo: environment.STRING, Valor: resultValue}
	} else {
		// Handle incompatible types for addition
		panic("ERROR: Incompatible types for addition")
	}
}

func performSubtraction(left environment.Symbol, right environment.Symbol) environment.Symbol {
	// Check if the data types are compatible for subtraction
	if left.Tipo == environment.INTEGER && right.Tipo == environment.INTEGER {
		resultValue := left.Valor.(int) - right.Valor.(int)
		return environment.Symbol{Tipo: environment.INTEGER, Valor: resultValue}
	} else if left.Tipo == environment.FLOAT && right.Tipo == environment.FLOAT {
		resultValue := left.Valor.(float64) - right.Valor.(float64)
		return environment.Symbol{Tipo: environment.FLOAT, Valor: resultValue}
	} else {
		// Handle incompatible types for subtraction
		panic("ERROR: Incompatible types for subtraction")
	}
}

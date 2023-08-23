package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
)

type If struct {
	Lin        int
	Col        int
	Expresion  interfaces.Expression
	Bloque     []interface{}
	ElseBloque []interface{} // Agregamos un campo para el bloque "else"
}

func NewIf(lin int, col int, condition interfaces.Expression, bloque, elseBloque []interface{}) If {
	ifInstr := If{lin, col, condition, bloque, elseBloque}
	return ifInstr
}

func (p If) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var condicion environment.Symbol
	condicion = p.Expresion.Ejecutar(ast, env)
	// Validando tipo
	if condicion.Tipo != environment.BOOLEAN {
		ast.SetError("El tipo de variable es incorrecto para un If")
		return nil
	}
	// Ejecutando if
	if condicion.Valor == true {
		var ifEnv environment.Environment
		ifEnv = environment.NewEnvironment(env.(environment.Environment), "IF")
		// Ejecución
		for _, inst := range p.Bloque {
			inst.(interfaces.Instruction).Ejecutar(ast, ifEnv)
		}
	} else {
		// Ejecución para el bloque "else"
		if p.ElseBloque != nil {
			var elseEnv environment.Environment
			elseEnv = environment.NewEnvironment(env.(environment.Environment), "ELSE")
			for _, inst := range p.ElseBloque {
				inst.(interfaces.Instruction).Ejecutar(ast, elseEnv)
			}
		}
	}
	return nil
}

package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
)

var error = true

type Guard struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	Bloque    []interface{}
}

func NewGuard(lin int, col int, condition interfaces.Expression, bloque []interface{}) Guard {
	guardInstr := Guard{lin, col, condition, bloque}
	return guardInstr
}

func (p Guard) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	condicion := p.Expresion.Ejecutar(ast, env)

	if condicion.Tipo != environment.BOOLEAN {
		ast.SetError("El tipo de variable es incorrecto para un Guard")
		return nil
	}

	if condicion.Valor == true {
		return nil
	}

	// Ejecutar el bloque en el guard solo si la condición es falsa
	guardEnv := environment.NewEnvironment(env.(environment.Environment), "GUARD")
	for _, inst := range p.Bloque {
		result := inst.(interfaces.Instruction).Ejecutar(ast, guardEnv)
		if sym, isSymbol := result.(environment.Symbol); isSymbol {
			if sym.BreakFlag || sym.ContinueFlag {
				error = false
				return sym
			}
		}

	}
	return nil
}

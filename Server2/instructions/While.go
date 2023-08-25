package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
)

type While struct {
	Lin       int
	Col       int
	Expresion interfaces.Expression
	Bloque    []interface{}
}

func NewWhile(lin int, col int, condition interfaces.Expression, bloque []interface{}) While {
	whileInstr := While{lin, col, condition, bloque}
	return whileInstr
}

func (p While) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	for {
		condicion := p.Expresion.Ejecutar(ast, env)

		if condicion.Tipo != environment.BOOLEAN {
			ast.SetError("El tipo de variable es incorrecto para un While")
			return nil
		}

		if condicion.Valor == true {
			whileEnv := environment.NewEnvironment(env.(environment.Environment), "WHILE")

			for _, inst := range p.Bloque {
				inst.(interfaces.Instruction).Ejecutar(ast, whileEnv)
			}
		} else {
			break
		}
	}

	return nil
}


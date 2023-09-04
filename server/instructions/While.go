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
	whileInstr := While{Lin: lin, Col: col, Expresion: condition, Bloque: bloque}
	return whileInstr
}

func (p While) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	for {
		condicion := p.Expresion.Ejecutar(ast, env)

		if condicion.Tipo != environment.BOOLEAN {
			ast.SetError("El tipo de variable es incorrecto para un While", p.Lin, p.Col)
			return nil
		}

		if condicion.Valor.(bool) { // Cambiamos a condicion.Valor.(bool)
			whileEnv := environment.NewEnvironment(env.(environment.Environment), "WHILE")
			breakFlag := false
			continueFlag := false

			for _, inst := range p.Bloque {
				if instruction, isInstruction := inst.(interfaces.Instruction); isInstruction {
					result := instruction.Ejecutar(ast, whileEnv)
					if sym, isSymbol := result.(environment.Symbol); isSymbol {
						if sym.BreakFlag {
							breakFlag = true
							break
						} else if sym.ContinueFlag {
							continueFlag = true
							break
						} else if sym.ReturnFlag {
							return sym
						}
					}
				}
			}

			if breakFlag {
				break
			}

			if continueFlag {
				// No hacemos nada aquí para continuar con la próxima iteración del bucle
			}
		} else {
			break
		}
	}

	return nil
}

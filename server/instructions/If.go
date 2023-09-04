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
	ElseBloque []interface{}
}

func NewIf(lin int, col int, condition interfaces.Expression, bloque, elseBloque []interface{}) If {
	ifInstr := If{Lin: lin, Col: col, Expresion: condition, Bloque: bloque, ElseBloque: elseBloque}
	return ifInstr
}

func (p If) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	condicion := p.Expresion.Ejecutar(ast, env)

	if condicion.Tipo != environment.BOOLEAN {
		ast.SetError("El tipo de variable es incorrecto para un If", p.Lin, p.Col)
		return nil
	}

	if condicion.Valor == true {
		ifEnv := environment.NewEnvironment(env.(environment.Environment), "IF")

		for _, inst := range p.Bloque {
			if instruction, isInstruction := inst.(interfaces.Instruction); isInstruction {
				result := instruction.Ejecutar(ast, ifEnv)
				if sym, isSymbol := result.(environment.Symbol); isSymbol {
					if sym.BreakFlag {
						return sym
					} else if sym.ContinueFlag {
						return sym
					} else if sym.ReturnFlag {
						return sym
					}
				}
			}
		}

	} else {
		if p.ElseBloque != nil {
			elseEnv := environment.NewEnvironment(env.(environment.Environment), "ELSE")
			for _, inst := range p.ElseBloque {
				if instruction, isInstruction := inst.(interfaces.Instruction); isInstruction {
					result := instruction.Ejecutar(ast, elseEnv)
					if sym, isSymbol := result.(environment.Symbol); isSymbol {
						if sym.ReturnFlag {
							return sym // Manejar la declaración de retorno
						} else if sym.BreakFlag || sym.ContinueFlag {
							return sym
						}
					}
				}
			}
		}
	}
	return nil
}

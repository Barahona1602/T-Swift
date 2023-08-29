package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
)

type ForIn struct {
	Lin        int
	Col        int
	Identifier string
	Expresion1 interfaces.Expression
	Expresion2 interfaces.Expression
	String     string // Agregar el campo para la cadena
	Bloque     []interface{}
}

func NewForIn(lin int, col int, id string, exp1, exp2 interfaces.Expression, bloque []interface{}) ForIn {
	return ForIn{Lin: lin, Col: col, Identifier: id, Expresion1: exp1, Expresion2: exp2, Bloque: bloque}
}

func (p ForIn) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	if p.String != "" { // Verificar si es una cadena
		for _, char := range p.String {
			// Crear un nuevo entorno para el bloque del for
			forEnv := environment.NewEnvironment(env.(environment.Environment), "FOR")

			// Asignar el valor actual del caracter a la variable c en el entorno forEnv
			forEnv.SaveVariable(p.Identifier, environment.Symbol{
				Lin:   p.Lin,
				Col:   p.Col,
				Tipo:  environment.STRING,
				Valor: string(char),
			})

			// Ejecutar las instrucciones en el bloque del for
			if p.executeForInLoop(ast, forEnv) {
				return nil // Handle the return statement
			}
		}
	} else { // Si no es una cadena, asumir que es un rango numérico
		rangeExp := p.Expresion2.Ejecutar(ast, env)
		if rangeExp.Tipo != environment.INTEGER {
			ast.SetError("La expresión en el for...in debe ser un entero")
			return nil
		}

		rangeObj := rangeExp.Valor.(int)

		for i := p.Expresion1.Ejecutar(ast, env).Valor.(int); i <= rangeObj; i++ {
			// Crear un nuevo entorno para el bloque del for
			forEnv := environment.NewEnvironment(env.(environment.Environment), "FORIN")

			// Asignar el valor actual de i a la variable x en el entorno forEnv
			forEnv.SaveVariable(p.Identifier, environment.Symbol{
				Lin:   p.Lin,
				Col:   p.Col,
				Tipo:  environment.INTEGER,
				Valor: i,
			})

			// Ejecutar las instrucciones en el bloque del for
			if p.executeForInLoop(ast, forEnv) {
				return nil // Handle the return statement
			}
		}
	}

	return nil
}

func (p ForIn) executeForInLoop(ast *environment.AST, env environment.Environment) bool {
	for _, inst := range p.Bloque {
		result := inst.(interfaces.Instruction).Ejecutar(ast, env)
		if sym, isSymbol := result.(environment.Symbol); isSymbol {
			if sym.ReturnFlag {
				return true // Handle the return statement
			} else if sym.BreakFlag {
				return false // Handle the break statement
			} else if sym.ContinueFlag {
				// Handle the continue statement (not implemented here)
			}
		}
	}
	return false
}

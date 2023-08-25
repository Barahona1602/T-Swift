package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
)

type For struct {
	Lin        int
	Col        int
	Identifier string
	Expresion  interfaces.Expression
	Bloque     []interface{}
}

func NewFor(lin int, col int, id string, exp interfaces.Expression, bloque []interface{}) For {
	return For{Lin: lin, Col: col, Identifier: id, Expresion: exp, Bloque: bloque}
}

func (p For) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	rangeExp := p.Expresion.Ejecutar(ast, env)

	switch rangeExp.Tipo {
	case environment.STRING:
		strValue := rangeExp.Valor.(string)
		for _, char := range strValue {
			// Create a new environment for the loop block
			forEnv := environment.NewEnvironment(env.(environment.Environment), "FOR")

			// Assign the current character to the variable x in the forEnv environment
			forEnv.SaveVariable(p.Identifier, environment.Symbol{
				Lin:   p.Lin,
				Col:   p.Col,
				Tipo:  environment.STRING,
				Valor: string(char),
			})

			// Execute the instructions in the loop block
			for _, inst := range p.Bloque {
				inst.(interfaces.Instruction).Ejecutar(ast, forEnv)
			}
		}

	case environment.ARRAY:
		arrValue := rangeExp.Valor.([]environment.Symbol)
		for _, element := range arrValue {
			// Create a new environment for the loop block
			forEnv := environment.NewEnvironment(env.(environment.Environment), "FOR")

			// Assign the current element to the variable x in the forEnv environment
			forEnv.SaveVariable(p.Identifier, element)

			// Execute the instructions in the loop block
			for _, inst := range p.Bloque {
				inst.(interfaces.Instruction).Ejecutar(ast, forEnv)
			}
		}

	default:
		ast.SetError("La expresión en el for debe ser una cadena o un vector")
	}

	return nil
}

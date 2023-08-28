package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
)

type Switch struct {
	Lin         int
	Col         int
	Expresion   interfaces.Expression
	Cases       []Case
	DefaultCase []interface{}
}

type Case struct {
	Lin    int
	Col    int
	Valor  interface{}
	Bloque []interface{}
}

func NewSwitch(lin int, col int, expr interfaces.Expression, cases []Case, defaultCase []interface{}) Switch {
	return Switch{
		Lin:         lin,
		Col:         col,
		Expresion:   expr,
		Cases:       cases,
		DefaultCase: defaultCase,
	}
}

func (s Switch) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	switchExp := s.Expresion.Ejecutar(ast, env)

	// Verificar si hay un valor nulo en la expresión
	if switchExp.Valor == nil {
		ast.SetError("La expresión en el switch tiene un valor nulo")
		return nil
	}

	// Evaluar los casos
	for _, caseBlock := range s.Cases {
		caseValue := caseBlock.Valor
		// Comparar el valor del caso con la expresión del switch
		if caseValue == switchExp.Valor {
			// Crear un nuevo entorno para el bloque del caso
			caseEnv := environment.NewEnvironment(env.(environment.Environment), "CASE")
			// Ejecutar las instrucciones en el bloque del caso
			for _, inst := range caseBlock.Bloque {
				inst.(interfaces.Instruction).Ejecutar(ast, caseEnv)
			}
			return nil // Salir del switch después de ejecutar el primer caso que coincide
		}
	}

	// Si no se encuentra un caso que coincida, ejecutar el bloque por defecto si existe
	if len(s.DefaultCase) > 0 {
		defaultEnv := environment.NewEnvironment(env.(environment.Environment), "DEFAULT")
		for _, inst := range s.DefaultCase {
			inst.(interfaces.Instruction).Ejecutar(ast, defaultEnv)
		}
	}

	return nil
}

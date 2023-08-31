package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
)

type Declaration struct {
	Lin       int
	Col       int
	Id        string
	Tipo      environment.TipoExpresion
	Expresion interfaces.Expression
}

func NewDeclaration(lin int, col int, id string, tipo environment.TipoExpresion, val interfaces.Expression) Declaration {
	instr := Declaration{lin, col, id, tipo, val}
	return instr
}

func (p Declaration) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	if p.Expresion == nil {
		// Asignar el valor nil al símbolo en el entorno
		env.(environment.Environment).SaveVariable(p.Id, environment.Symbol{
			Lin:   p.Lin,
			Col:   p.Col,
			Tipo:  p.Tipo,
			Valor: nil,
		})
	} else {
		// Traer simbolo
		var result environment.Symbol
		result = p.Expresion.Ejecutar(ast, env)

		// Validar tipos
		if result.Tipo == environment.ARRAY {
			if p.ArrayValidation(result) {
				env.(environment.Environment).SaveVariable(p.Id, result)
			} else {
				ast.SetError("La estructura del array es incorrecta")
			}
		} else if result.Tipo == p.Tipo {
			env.(environment.Environment).SaveVariable(p.Id, result)
		} else {
			ast.SetError("Los tipos de datos son incorrectos")
		}
	}
	return nil
}

func (p Declaration) ArrayValidation(result environment.Symbol) bool {
	return true
}

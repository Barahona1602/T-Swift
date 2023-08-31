package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
	"fmt"
	"strconv"
)

type CastDeclaration struct {
	Lin       int
	Col       int
	Id        string
	Tipo      environment.TipoExpresion
	Expresion interfaces.Expression
}

func NewCastDeclaration(lin int, col int, id string, tipo environment.TipoExpresion, val interfaces.Expression) CastDeclaration {
	instr := CastDeclaration{lin, col, id, tipo, val}
	return instr
}

func (p CastDeclaration) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	if p.Expresion == nil {
		// Asignar el valor nil al símbolo en el entorno
		env.(environment.Environment).SaveVariable(p.Id, environment.Symbol{
			Lin:   p.Lin,
			Col:   p.Col,
			Tipo:  p.Tipo,
			Valor: nil,
		})
	} else {
		// Realizar casteo implícito según el tipo de la variable
		castedValue := performImplicitCast(p.Expresion.Ejecutar(ast, env), p.Tipo, ast)

		// Validar tipos
		if castedValue.Tipo == p.Tipo {
			env.(environment.Environment).SaveVariable(p.Id, castedValue)
		} else {
			ast.SetError("Los tipos de datos son incorrectos", p.Lin, p.Col)

		}
	}

	return nil
}

func performImplicitCast(value environment.Symbol, targetType environment.TipoExpresion, ast *environment.AST) environment.Symbol {
	switch targetType {
	case environment.FLOAT:
		switch value.Tipo {
		case environment.INTEGER:
			val := float64(value.Valor.(int))
			valWithZeros := fmt.Sprintf("%.4f", val)
			return environment.Symbol{Lin: value.Lin, Col: value.Col, Tipo: targetType, Valor: valWithZeros}
		case environment.STRING:
			val, err := strconv.ParseFloat(value.Valor.(string), 64)
			if err != nil {
				ast.SetError("No se puede castear a Float", value.Lin, value.Col)
			}
			valWithZeros := fmt.Sprintf("%.4f", val)
			return environment.Symbol{Lin: value.Lin, Col: value.Col, Tipo: targetType, Valor: valWithZeros}
		default:
			ast.SetError("No se pueden castear los tipos indicados", value.Lin, value.Col)
		}
	case environment.STRING:
		switch value.Tipo {
		case environment.INTEGER:
			return environment.Symbol{Lin: value.Lin, Col: value.Col, Tipo: targetType, Valor: strconv.Itoa(value.Valor.(int))}
		case environment.FLOAT:
			val := fmt.Sprintf("%.4f", value.Valor.(float64))
			return environment.Symbol{Lin: value.Lin, Col: value.Col, Tipo: targetType, Valor: val}
		default:
			ast.SetError("No se pueden castear los tipos indicados", value.Lin, value.Col)
		}
	case environment.INTEGER:
		switch value.Tipo {
		case environment.INTEGER:
			return environment.Symbol{Lin: value.Lin, Col: value.Col, Tipo: targetType, Valor: value.Valor.(int)}
		case environment.FLOAT:
			val := int(value.Valor.(float64))
			return environment.Symbol{Lin: value.Lin, Col: value.Col, Tipo: targetType, Valor: val}
		case environment.STRING:
			val, err := strconv.ParseFloat(value.Valor.(string), 64)
			if err != nil {
				ast.SetError("No se puede castear a Integer", value.Lin, value.Col)
			}
			return environment.Symbol{Lin: value.Lin, Col: value.Col, Tipo: targetType, Valor: int(val)}
		default:
			ast.SetError("No se pueden castear los tipos indicados", value.Lin, value.Col)
		}
	}

	ast.SetError("No se pueden castear los tipos indicados", value.Lin, value.Col)
	return environment.Symbol{}
}

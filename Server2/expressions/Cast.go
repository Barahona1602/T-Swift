package expressions

import (
	"Server2/environment"
	"Server2/interfaces"
	"fmt"
	"strconv"
)

type Cast struct {
	Lin       int
	Col       int
	Tipo      environment.TipoExpresion
	Expresion interface{}
}

func NewCast(lin int, col int, tipo environment.TipoExpresion, exp interface{}) Cast {
	return Cast{Lin: lin, Col: col, Tipo: tipo, Expresion: exp}
}

func (p Cast) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	tmpExp := p.Expresion.(interfaces.Expression).Ejecutar(ast, env)

	if p.Tipo == environment.FLOAT { // Casting a Float
		switch tmpExp.Tipo {
		case environment.INTEGER:
			val := float64(tmpExp.Valor.(int))
			valWithZeros := fmt.Sprintf("%.4f", val) // Agregar cuatro ceros decimales
			return environment.Symbol{Lin: p.Lin, Col: p.Col, Id: "", Tipo: p.Tipo, Valor: valWithZeros}
		case environment.STRING:
			val, err := strconv.ParseFloat(tmpExp.Valor.(string), 64)
			if err != nil {
				ast.SetError("No se puede castear a Float", p.Lin, p.Col)
			}
			valWithZeros := fmt.Sprintf("%.4f", val) // Agregar cuatro ceros decimales
			return environment.Symbol{Lin: p.Lin, Col: p.Col, Id: "", Tipo: p.Tipo, Valor: valWithZeros}
		default:
			ast.SetError("No se pueden castear los tipos indicados", p.Lin, p.Col)
		}
	} else if p.Tipo == environment.STRING { // Casting a String
		switch tmpExp.Tipo {
		case environment.INTEGER:
			return environment.Symbol{Lin: p.Lin, Col: p.Col, Id: "", Tipo: p.Tipo, Valor: strconv.Itoa(tmpExp.Valor.(int))}
		case environment.FLOAT:
			val := fmt.Sprintf("%.4f", tmpExp.Valor.(float64)) // Agregar cuatro ceros decimales
			return environment.Symbol{Lin: p.Lin, Col: p.Col, Id: "", Tipo: p.Tipo, Valor: val}
		default:
			ast.SetError("No se pueden castear los tipos indicados", p.Lin, p.Col)
		}
	} else if p.Tipo == environment.INTEGER { // Casting a Integer
		switch tmpExp.Tipo {
		case environment.INTEGER:
			return environment.Symbol{Lin: p.Lin, Col: p.Col, Id: "", Tipo: p.Tipo, Valor: tmpExp.Valor.(int)}
		case environment.FLOAT:
			val := int(tmpExp.Valor.(float64)) // Truncar la parte decimal
			return environment.Symbol{Lin: p.Lin, Col: p.Col, Id: "", Tipo: p.Tipo, Valor: val}
		case environment.STRING:
			val, err := strconv.ParseFloat(tmpExp.Valor.(string), 64)
			if err != nil {
				ast.SetError("No se puede castear a Integer", p.Lin, p.Col)
			}
			return environment.Symbol{Lin: p.Lin, Col: p.Col, Id: "", Tipo: p.Tipo, Valor: int(val)}
		default:
			ast.SetError("No se pueden castear los tipos indicados", p.Lin, p.Col)
		}
	}

	ast.SetError("No se pueden castear los tipos indicados", p.Lin, p.Col)
	return environment.Symbol{}
}

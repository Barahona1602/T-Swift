package expressions

import (
	"Server2/environment"
	"Server2/interfaces"
	"fmt"
	"strconv"
)

type Operation struct {
	Lin      int
	Col      int
	Op_izq   interfaces.Expression
	Operador string
	Op_der   interfaces.Expression
}

func NewOperation(lin int, col int, Op1 interfaces.Expression, Operador string, Op2 interfaces.Expression) Operation {
	exp := Operation{Lin: lin, Col: col, Op_izq: Op1, Operador: Operador, Op_der: Op2}
	return exp
}

func (o Operation) Ejecutar(ast *environment.AST, env interface{}) environment.Symbol {
	var dominante environment.TipoExpresion

	tabla_dominante := [5][5]environment.TipoExpresion{
		//		INTEGER			FLOAT				STRING				BOOLEAN				NIL
		{environment.INTEGER, environment.FLOAT, environment.STRING, environment.BOOLEAN, environment.NIL},
		//FLOAT
		{environment.FLOAT, environment.FLOAT, environment.STRING, environment.NIL, environment.NIL},
		//STRING
		{environment.STRING, environment.STRING, environment.STRING, environment.STRING, environment.NIL},
		//BOOLEAN
		{environment.BOOLEAN, environment.NIL, environment.STRING, environment.BOOLEAN, environment.NIL},
		//NIL
		{environment.NIL, environment.NIL, environment.NIL, environment.NIL, environment.NIL},
	}

	var op1, op2 environment.Symbol
	if o.Op_izq != nil {
		op1 = o.Op_izq.Ejecutar(ast, env)
	}
	if o.Op_der != nil {
		op2 = o.Op_der.Ejecutar(ast, env)
	}
	switch o.Operador {
	case "+":
		{
			//validar tipo dominante
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			//valida el tipo
			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: op1.Valor.(int) + op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: val1 + val2}
			} else if dominante == environment.STRING {
				r1 := fmt.Sprintf("%v", op1.Valor)
				r2 := fmt.Sprintf("%v", op2.Valor)
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: r1 + r2}
			} else {
				ast.SetError(" No es posible sumar", o.Lin, o.Col)
			}
		}
	case "-":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]

			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: op1.Valor.(int) - op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: val1 - val2}
			} else {
				ast.SetError(" No es posible restar", o.Lin, o.Col)
			}
		}
	case "*":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: op1.Valor.(int) * op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: val1 * val2}
			} else {
				ast.SetError(" No es posible Multiplicar", o.Lin, o.Col)
			}
		}
	case "/":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				if op2.Valor.(int) != 0 {
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: op1.Valor.(int) / op2.Valor.(int)}
				} else {
					ast.SetError(" No es posible dividir en cero", o.Lin, o.Col)
				}

			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				if val2 != 0 {
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: val1 / val2}
				} else {
					ast.SetError(" No es posible dividir en cero", o.Lin, o.Col)
				}
			} else {
				ast.SetError(" No es posible Dividir", o.Lin, o.Col)
			}

		}
	case "%":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				if op2.Valor.(int) != 0 {
					newValue := op1.Valor.(int) % op2.Valor.(int)
					return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: newValue}
				} else {
					ast.SetError(" No es posible realizar el módulo (%) con divisor cero", o.Lin, o.Col)
				}
			} else {
				ast.SetError(" No es posible realizar el módulo (%) con tipos no compatibles", o.Lin, o.Col)
			}
		}
	case "<":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(int) < op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: val1 < val2}
			} else {
				ast.SetError(" No es posible comparar <", o.Lin, o.Col)
			}
		}
	case ">":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(int) > op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: val1 > val2}
			} else {
				ast.SetError(" No es posible comparar >", o.Lin, o.Col)
			}
		}
	case "<=":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(int) <= op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: val1 <= val2}
			} else {
				ast.SetError(" No es posible comparar <=", o.Lin, o.Col)
			}
		}
	case ">=":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(int) >= op2.Valor.(int)}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: val1 >= val2}
			} else {
				ast.SetError(" No es posible comparar >=", o.Lin, o.Col)
			}
		}
	case "==":
		{
			if op1.Tipo == op2.Tipo {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor == op2.Valor}
			} else {
				ast.SetError(" No es posible comparar == ", o.Lin, o.Col)
			}
		}
	case "!=":
		{
			if op1.Tipo == op2.Tipo {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor != op2.Valor}
			} else {
				ast.SetError(" No es posible comparar !=", o.Lin, o.Col)
			}
		}
	case "&&":
		{
			if (op1.Tipo == environment.BOOLEAN) && (op2.Tipo == environment.BOOLEAN) {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(bool) && op2.Valor.(bool)}
			} else {
				ast.SetError(" tipo no compatible &&", o.Lin, o.Col)
			}
		}
	case "||":
		{
			if (op1.Tipo == environment.BOOLEAN) && (op2.Tipo == environment.BOOLEAN) {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.BOOLEAN, Valor: op1.Valor.(bool) || op2.Valor.(bool)}
			} else {
				ast.SetError(" tipo no compatible ||", o.Lin, o.Col)
			}
		}
	case "+=":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				newValue := op1.Valor.(int) + op2.Valor.(int)
				op1.Valor = newValue
				return op1
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				newValue := val1 + val2
				op1.Valor = newValue
				return op1
			} else if dominante == environment.STRING {
				r1 := fmt.Sprintf("%v", op1.Valor)
				r2 := fmt.Sprintf("%v", op2.Valor)
				newValue := r1 + r2
				op1.Valor = newValue
				return op1
			} else {
				ast.SetError(" No es posible realizar +=", o.Lin, o.Col)
			}
		}
	case "-=":
		{
			dominante = tabla_dominante[op1.Tipo][op2.Tipo]
			if dominante == environment.INTEGER {
				newValue := op1.Valor.(int) - op2.Valor.(int)
				op1.Valor = newValue
				return op1
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", op2.Valor), 64)
				newValue := val1 - val2
				op1.Valor = newValue
				return op1
			} else {
				ast.SetError(" No es posible realizar -=", o.Lin, o.Col)
			}
		}
	case "!":
		{
			if op1.Tipo == environment.BOOLEAN {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Id: "", Tipo: environment.BOOLEAN, Valor: !op1.Valor.(bool)}
			} else {
				ast.SetError(" No es posible realizar !", o.Lin, o.Col)
			}
		}
	case "NEGACION":
		{
			if op1.Tipo == environment.INTEGER {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: op1.Tipo, Valor: 0 - op1.Valor.(int)}
			} else if op1.Tipo == environment.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", op1.Valor), 64)
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: op1.Tipo, Valor: 0 - val1}
			} else {
				ast.SetError(" No es posible realizar la NEGACIÓN", o.Lin, o.Col)
			}
		}
	case ",":
		{
			// Validar tipo dominante
			dominante := tabla_dominante[op1.Tipo][op2.Tipo]

			// Convertir a STRING
			stringify := func(val interface{}) string {
				return fmt.Sprintf("%v", val)
			}

			if dominante == environment.INTEGER {
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: stringify(op1.Valor.(int)) + " " + stringify(op2.Valor.(int))}
			} else if dominante == environment.FLOAT {
				val1, _ := strconv.ParseFloat(stringify(op1.Valor), 64)
				val2, _ := strconv.ParseFloat(stringify(op2.Valor), 64)
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: val1 + val2}
			} else if dominante == environment.STRING {
				r1 := stringify(op1.Valor)
				r2 := stringify(op2.Valor)
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: r1 + " " + r2}
			} else if dominante == environment.NIL {
				r1 := stringify(op1.Valor)
				r2 := stringify(op2.Valor)
				return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: dominante, Valor: r1 + " " + r2}
			} else {
				ast.SetError(" No es posible concatenar", o.Lin, o.Col)
			}
		}
	}

	var result interface{}
	return environment.Symbol{Lin: o.Lin, Col: o.Col, Tipo: environment.NIL, Valor: result}
}

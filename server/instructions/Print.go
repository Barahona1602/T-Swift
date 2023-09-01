package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
	"fmt"
	"strings"
)

type Print struct {
	Lin   int
	Col   int
	Value interface{}
}

func NewPrint(lin int, col int, val interface{}) Print {
	return Print{lin, col, val}
}

func (p Print) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	valueToPrint := p.Value.(interfaces.Expression).Ejecutar(ast, env)

	// Convertir a STRING
	stringify := func(val interface{}) string {
		return fmt.Sprintf("%v", val)
	}

	consoleOut := stringify(valueToPrint.Valor)
	if strings.Contains(consoleOut, "\\n") {
		consoleOut = strings.ReplaceAll(consoleOut, "\\n", "\n")
	}
	ast.SetPrint(consoleOut + "\n")

	return nil
}

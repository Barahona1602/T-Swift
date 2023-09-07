package instructions

import (
	"Server2/environment"
	"Server2/interfaces"
)

type StructAssign struct {
	Lin        int
	Col        int
	ListStruct []interface{}
	Exp        interfaces.Expression
}

func NewStructAssign(lin int, col int, list []interface{}, expr interfaces.Expression) StructAssign {
	instr := StructAssign{lin, col, list, expr}
	return instr
}

func (p StructAssign) Ejecutar(ast *environment.AST, env interface{}) interface{} {
	var result environment.Symbol
	exp := p.Exp.Ejecutar(ast, env)
	result = env.(environment.Environment).SetStruct(p.ListStruct, exp)
	return result
}

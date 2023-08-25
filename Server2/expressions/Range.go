package expressions

import (
	"Server2/environment" // Asegúrate de que la ruta sea correcta
	"Server2/interfaces"  // Si es necesario
	// Si es necesario
)

type Range struct {
	Lin  int
	Col  int
	Exp1 interfaces.Expression
	Exp2 interfaces.Expression
	Tipo environment.TipoExpresion
}

func NewRange(lin int, col int, expuno interfaces.Expression, expdos interfaces.Expression) Range {
	exp := Range{lin, col, expuno, expdos, environment.INTEGER}
	return exp
}

type RangeIterator struct {
	Range   *Range
	Current int
}

func NewRangeIterator(r *Range) *RangeIterator {
	return &RangeIterator{
		Range:   r,
		Current: r.Exp1.Ejecutar(nil, nil).Valor.(int), // Evaluar la expresión de inicio
	}
}

func (ri *RangeIterator) HasNext() bool {
	// Verificar si el valor actual está dentro del rango
	return ri.Current <= ri.Range.Exp2.Ejecutar(nil, nil).Valor.(int) // Evaluar la expresión de fin
}

func (ri *RangeIterator) Next() environment.Symbol {
	// Obtener el valor actual del rango
	currentSymbol := environment.Symbol{
		Lin:   ri.Range.Lin,
		Col:   ri.Range.Col,
		Tipo:  ri.Range.Tipo,
		Valor: ri.Current,
	}

	// Incrementar el valor actual para el próximo ciclo
	ri.Current++

	return currentSymbol
}

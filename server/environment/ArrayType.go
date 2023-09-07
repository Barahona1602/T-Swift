package environment

type ArrayType struct {
	Tipo TipoExpresion
	Size interface{}
}

func NewArrayType(tipo TipoExpresion, size interface{}) ArrayType {
	exp := ArrayType{tipo, size}
	return exp
}

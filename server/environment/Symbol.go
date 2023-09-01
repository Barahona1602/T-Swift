package environment

type Symbol struct {
	Lin          int
	Col          int
	Id           string
	Tipo         TipoExpresion
	Valor        interface{}
	Mutable      bool
	Capacity     int
	TipoArr      TipoExpresion
	ExtraTipo    string
	Vectipo      TipoExpresion
	ReturnFlag   bool
	BreakFlag    bool
	ContinueFlag bool
}

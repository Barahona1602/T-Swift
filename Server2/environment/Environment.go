package environment

import (
	"fmt"
	"os"
)

type Environment struct {
	Anterior interface{}
	Tabla    map[string]Symbol
	Id       string
}

func NewEnvironment(ant interface{}, id string) Environment {
	return Environment{
		Anterior: ant,
		Tabla:    make(map[string]Symbol),
		Id:       id,
	}
}

func (env Environment) SaveVariable(id string, value Symbol) {
	if variable, ok := env.Tabla[id]; ok {
		fmt.Println("La variable "+id+" ya existe", variable)
		return
	}
	env.Tabla[id] = value
}

func (env Environment) GetVariable(id string) Symbol {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Tabla[id]; ok {
			return variable
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe")
	return Symbol{Lin: 0, Col: 0, Tipo: NIL, Valor: 0}
}

func (env Environment) SetVariable(id string, value Symbol) Symbol {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if variable, ok := tmpEnv.Tabla[id]; ok {
			if tmpEnv.Tabla[id].Tipo == value.Tipo {
				tmpEnv.Tabla[id] = value
				return variable
			} else {
				fmt.Println("El tipo de dato es incorrecto")
				return Symbol{Lin: 0, Col: 0, Tipo: NIL, Valor: 0}
			}
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("La variable ", id, " no existe")
	return Symbol{Lin: 0, Col: 0, Tipo: NIL, Valor: 0}
}

func (env Environment) LoopValidation() bool {
	var tmpEnv Environment
	tmpEnv = env
	for {
		if tmpEnv.Id == "WHILE" || tmpEnv.Id == "FOR" || tmpEnv.Id == "GUARD" {
			return true
		}
		if tmpEnv.Anterior == nil {
			break
		} else {
			tmpEnv = tmpEnv.Anterior.(Environment)
		}
	}
	fmt.Println("la sentencia tiene que estar dentro de un ciclo")
	return false
}

func (env Environment) PrintVariablesToFile() (string, error) {
	htmlContent := generateHTMLTable(env)
	fileName := "SymbolTable.html"

	file, err := os.Create(fileName)
	if err != nil {
		return htmlContent, err
	}
	defer file.Close()

	_, err = file.WriteString(htmlContent)
	if err != nil {
		return htmlContent, err
	}

	return htmlContent, nil
}

func GetTable(env Environment) map[string]Symbol {
	return env.Tabla
}

func generateHTMLTable(env Environment) string {
	html := `
		<style>
			body {
				font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', 'Roboto', 'Oxygen',
				'Ubuntu', 'Cantarell', 'Fira Sans', 'Droid Sans', 'Helvetica Neue',
				sans-serif;
			  -webkit-font-smoothing: antialiased;
			  -moz-osx-font-smoothing: grayscale;
				background-color: #282c34; /* Color de fondo personalizado */
				color: white; /* Color de texto blanco */
				font-size: calc(8px + 1vmin); /* Tamaño de fuente reducido */
			}
			h1 {
				text-align: center;
				margin-top: 20px;
			}
			table {
				width: 400px; /* Hacer la tabla más ancha */
				margin: auto;
				border-collapse: collapse;
				border: 1px solid white; /* Borde blanco */
				margin-top: 20px;
				font-size: calc(8px + 1vmin); /* Tamaño de fuente reducido */
			}
			th, td {
				padding: 12px; /* Mayor espacio alrededor de los elementos */
				text-align: left;
				font-size: calc(9px + 1vmin); /* Tamaño de fuente reducido */
			}
			tr:nth-child(even) {
				background-color: transparent; /* Celda transparente */
			}
			th {
				background-color: #00BFFF; /* Color celeste */
				color: white;
			}
		</style>
	<body>
		<table>
			<tr>
				<th>Variable</th>
				<th>Tipo</th>
				<th>Ámbito</th>
				<th>Línea</th>
				<th>Columna</th>
			</tr>
	`

	for id, symbol := range env.Tabla {
		html += fmt.Sprintf("<tr><td>%s</td><td>%s</td><td>%s</td><td>%d</td><td>%d</td></tr>", id, getTypeName(symbol.Tipo), env.Id, symbol.Lin, symbol.Col)
	}

	html += `
		</table>
	</body>
	`

	return html
}

func getTypeName(t TipoExpresion) string {
	switch t {
	case INTEGER:
		return "INTEGER"
	case FLOAT:
		return "FLOAT"
	case STRING:
		return "STRING"
	case BOOLEAN:
		return "BOOLEAN"
	case NIL:
		return "NIL"
	case ARRAY:
		return "ARRAY"
	case RANGE:
		return "RANGE"
	case STR:
		return "STR"
	default:
		return "UNKNOWN"
	}
}

// Code generated from SwiftLexer.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser

import (
	"fmt"
	"github.com/antlr4-go/antlr/v4"
	"sync"
	"unicode"
)

// Suppress unused import error
var _ = fmt.Printf
var _ = sync.Once{}
var _ = unicode.IsLetter

type SwiftLexer struct {
	*antlr.BaseLexer
	channelNames []string
	modeNames    []string
	// TODO: EOF string
}

var SwiftLexerLexerStaticData struct {
	once                   sync.Once
	serializedATN          []int32
	ChannelNames           []string
	ModeNames              []string
	LiteralNames           []string
	SymbolicNames          []string
	RuleNames              []string
	PredictionContextCache *antlr.PredictionContextCache
	atn                    *antlr.ATN
	decisionToDFA          []*antlr.DFA
}

func swiftlexerLexerInit() {
	staticData := &SwiftLexerLexerStaticData
	staticData.ChannelNames = []string{
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
	}
	staticData.ModeNames = []string{
		"DEFAULT_MODE",
	}
	staticData.LiteralNames = []string{
		"", "'Int'", "'Float'", "'Bool'", "'String'", "'Character'", "'var'",
		"'let'", "'void'", "'true'", "'false'", "'print'", "'if'", "'else'",
		"'while'", "'for'", "'in'", "'switch'", "'case'", "'default'", "'break'",
		"'return'", "'continue'", "'guard'", "'func'", "'nil'", "'struct'",
		"'mutating'", "'self'", "'inout'", "'append'", "'removeLast'", "'remove'",
		"'at'", "'isEmpty'", "'count'", "", "", "", "'!='", "'=='", "'!'", "'||'",
		"'&&'", "'='", "'>='", "'<='", "'+='", "'-='", "'>'", "'<'", "'*'",
		"'/'", "'+'", "'-'", "'%'", "'('", "')'", "'{'", "'}'", "':'", "'['",
		"']'", "','", "'.'",
	}
	staticData.SymbolicNames = []string{
		"", "INT", "FLOAT", "BOOL", "STR", "CHAR", "VAR", "LET", "VOID", "TRU",
		"FAL", "PRINT", "IF", "ELSE", "WHILE", "FOR", "IN", "SWITCH", "CASE",
		"DEFAULT", "BREAK", "RETURN", "CONTINUE", "GUARD", "FUNC", "NIL", "STRUCT",
		"MUTATING", "SELF", "INOUT", "APPEND", "REMOVELAST", "REMOVE", "AT",
		"ISEMPTY", "COUNT", "NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT",
		"OR", "AND", "IG", "MAY_IG", "MEN_IG", "SUM_IG", "SUB_IG", "MAYOR",
		"MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "PARIZQ", "PARDER", "LLAVEIZQ",
		"LLAVEDER", "D_PTS", "CORIZQ", "CORDER", "COMA", "PUNTO", "WHITESPACE",
		"COMMENT", "LINE_COMMENT",
	}
	staticData.RuleNames = []string{
		"INT", "FLOAT", "BOOL", "STR", "CHAR", "VAR", "LET", "VOID", "TRU",
		"FAL", "PRINT", "IF", "ELSE", "WHILE", "FOR", "IN", "SWITCH", "CASE",
		"DEFAULT", "BREAK", "RETURN", "CONTINUE", "GUARD", "FUNC", "NIL", "STRUCT",
		"MUTATING", "SELF", "INOUT", "APPEND", "REMOVELAST", "REMOVE", "AT",
		"ISEMPTY", "COUNT", "NUMBER", "STRING", "ID", "DIF", "IG_IG", "NOT",
		"OR", "AND", "IG", "MAY_IG", "MEN_IG", "SUM_IG", "SUB_IG", "MAYOR",
		"MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "PARIZQ", "PARDER", "LLAVEIZQ",
		"LLAVEDER", "D_PTS", "CORIZQ", "CORDER", "COMA", "PUNTO", "WHITESPACE",
		"COMMENT", "LINE_COMMENT", "ESC_SEQ",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 0, 67, 470, 6, -1, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2,
		4, 7, 4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 2, 9, 7, 9, 2,
		10, 7, 10, 2, 11, 7, 11, 2, 12, 7, 12, 2, 13, 7, 13, 2, 14, 7, 14, 2, 15,
		7, 15, 2, 16, 7, 16, 2, 17, 7, 17, 2, 18, 7, 18, 2, 19, 7, 19, 2, 20, 7,
		20, 2, 21, 7, 21, 2, 22, 7, 22, 2, 23, 7, 23, 2, 24, 7, 24, 2, 25, 7, 25,
		2, 26, 7, 26, 2, 27, 7, 27, 2, 28, 7, 28, 2, 29, 7, 29, 2, 30, 7, 30, 2,
		31, 7, 31, 2, 32, 7, 32, 2, 33, 7, 33, 2, 34, 7, 34, 2, 35, 7, 35, 2, 36,
		7, 36, 2, 37, 7, 37, 2, 38, 7, 38, 2, 39, 7, 39, 2, 40, 7, 40, 2, 41, 7,
		41, 2, 42, 7, 42, 2, 43, 7, 43, 2, 44, 7, 44, 2, 45, 7, 45, 2, 46, 7, 46,
		2, 47, 7, 47, 2, 48, 7, 48, 2, 49, 7, 49, 2, 50, 7, 50, 2, 51, 7, 51, 2,
		52, 7, 52, 2, 53, 7, 53, 2, 54, 7, 54, 2, 55, 7, 55, 2, 56, 7, 56, 2, 57,
		7, 57, 2, 58, 7, 58, 2, 59, 7, 59, 2, 60, 7, 60, 2, 61, 7, 61, 2, 62, 7,
		62, 2, 63, 7, 63, 2, 64, 7, 64, 2, 65, 7, 65, 2, 66, 7, 66, 2, 67, 7, 67,
		1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2,
		1, 2, 1, 2, 1, 2, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 4, 1, 4,
		1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 5, 1, 5, 1, 5, 1, 5,
		1, 6, 1, 6, 1, 6, 1, 6, 1, 7, 1, 7, 1, 7, 1, 7, 1, 7, 1, 8, 1, 8, 1, 8,
		1, 8, 1, 8, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 9, 1, 10, 1, 10, 1, 10, 1,
		10, 1, 10, 1, 10, 1, 11, 1, 11, 1, 11, 1, 12, 1, 12, 1, 12, 1, 12, 1, 12,
		1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 13, 1, 14, 1, 14, 1, 14, 1, 14, 1,
		15, 1, 15, 1, 15, 1, 16, 1, 16, 1, 16, 1, 16, 1, 16, 1, 16, 1, 16, 1, 17,
		1, 17, 1, 17, 1, 17, 1, 17, 1, 18, 1, 18, 1, 18, 1, 18, 1, 18, 1, 18, 1,
		18, 1, 18, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 20, 1, 20, 1, 20,
		1, 20, 1, 20, 1, 20, 1, 20, 1, 21, 1, 21, 1, 21, 1, 21, 1, 21, 1, 21, 1,
		21, 1, 21, 1, 21, 1, 22, 1, 22, 1, 22, 1, 22, 1, 22, 1, 22, 1, 23, 1, 23,
		1, 23, 1, 23, 1, 23, 1, 24, 1, 24, 1, 24, 1, 24, 1, 25, 1, 25, 1, 25, 1,
		25, 1, 25, 1, 25, 1, 25, 1, 26, 1, 26, 1, 26, 1, 26, 1, 26, 1, 26, 1, 26,
		1, 26, 1, 26, 1, 27, 1, 27, 1, 27, 1, 27, 1, 27, 1, 28, 1, 28, 1, 28, 1,
		28, 1, 28, 1, 28, 1, 29, 1, 29, 1, 29, 1, 29, 1, 29, 1, 29, 1, 29, 1, 30,
		1, 30, 1, 30, 1, 30, 1, 30, 1, 30, 1, 30, 1, 30, 1, 30, 1, 30, 1, 30, 1,
		31, 1, 31, 1, 31, 1, 31, 1, 31, 1, 31, 1, 31, 1, 32, 1, 32, 1, 32, 1, 33,
		1, 33, 1, 33, 1, 33, 1, 33, 1, 33, 1, 33, 1, 33, 1, 34, 1, 34, 1, 34, 1,
		34, 1, 34, 1, 34, 1, 35, 4, 35, 348, 8, 35, 11, 35, 12, 35, 349, 1, 35,
		1, 35, 4, 35, 354, 8, 35, 11, 35, 12, 35, 355, 3, 35, 358, 8, 35, 1, 36,
		1, 36, 5, 36, 362, 8, 36, 10, 36, 12, 36, 365, 9, 36, 1, 36, 1, 36, 1,
		37, 1, 37, 5, 37, 371, 8, 37, 10, 37, 12, 37, 374, 9, 37, 1, 38, 1, 38,
		1, 38, 1, 39, 1, 39, 1, 39, 1, 40, 1, 40, 1, 41, 1, 41, 1, 41, 1, 42, 1,
		42, 1, 42, 1, 43, 1, 43, 1, 44, 1, 44, 1, 44, 1, 45, 1, 45, 1, 45, 1, 46,
		1, 46, 1, 46, 1, 47, 1, 47, 1, 47, 1, 48, 1, 48, 1, 49, 1, 49, 1, 50, 1,
		50, 1, 51, 1, 51, 1, 52, 1, 52, 1, 53, 1, 53, 1, 54, 1, 54, 1, 55, 1, 55,
		1, 56, 1, 56, 1, 57, 1, 57, 1, 58, 1, 58, 1, 59, 1, 59, 1, 60, 1, 60, 1,
		61, 1, 61, 1, 62, 1, 62, 1, 63, 1, 63, 1, 64, 4, 64, 437, 8, 64, 11, 64,
		12, 64, 438, 1, 64, 1, 64, 1, 65, 1, 65, 1, 65, 1, 65, 5, 65, 447, 8, 65,
		10, 65, 12, 65, 450, 9, 65, 1, 65, 1, 65, 1, 65, 1, 65, 1, 65, 1, 66, 1,
		66, 1, 66, 1, 66, 5, 66, 461, 8, 66, 10, 66, 12, 66, 464, 9, 66, 1, 66,
		1, 66, 1, 67, 1, 67, 1, 67, 1, 448, 0, 68, 1, 1, 3, 2, 5, 3, 7, 4, 9, 5,
		11, 6, 13, 7, 15, 8, 17, 9, 19, 10, 21, 11, 23, 12, 25, 13, 27, 14, 29,
		15, 31, 16, 33, 17, 35, 18, 37, 19, 39, 20, 41, 21, 43, 22, 45, 23, 47,
		24, 49, 25, 51, 26, 53, 27, 55, 28, 57, 29, 59, 30, 61, 31, 63, 32, 65,
		33, 67, 34, 69, 35, 71, 36, 73, 37, 75, 38, 77, 39, 79, 40, 81, 41, 83,
		42, 85, 43, 87, 44, 89, 45, 91, 46, 93, 47, 95, 48, 97, 49, 99, 50, 101,
		51, 103, 52, 105, 53, 107, 54, 109, 55, 111, 56, 113, 57, 115, 58, 117,
		59, 119, 60, 121, 61, 123, 62, 125, 63, 127, 64, 129, 65, 131, 66, 133,
		67, 135, 0, 1, 0, 7, 1, 0, 48, 57, 1, 0, 34, 34, 2, 0, 65, 90, 97, 122,
		4, 0, 48, 57, 65, 90, 95, 95, 97, 122, 4, 0, 9, 10, 13, 13, 32, 32, 92,
		92, 2, 0, 10, 10, 13, 13, 7, 0, 32, 33, 35, 35, 43, 43, 45, 46, 58, 58,
		64, 64, 91, 93, 476, 0, 1, 1, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 5, 1, 0, 0,
		0, 0, 7, 1, 0, 0, 0, 0, 9, 1, 0, 0, 0, 0, 11, 1, 0, 0, 0, 0, 13, 1, 0,
		0, 0, 0, 15, 1, 0, 0, 0, 0, 17, 1, 0, 0, 0, 0, 19, 1, 0, 0, 0, 0, 21, 1,
		0, 0, 0, 0, 23, 1, 0, 0, 0, 0, 25, 1, 0, 0, 0, 0, 27, 1, 0, 0, 0, 0, 29,
		1, 0, 0, 0, 0, 31, 1, 0, 0, 0, 0, 33, 1, 0, 0, 0, 0, 35, 1, 0, 0, 0, 0,
		37, 1, 0, 0, 0, 0, 39, 1, 0, 0, 0, 0, 41, 1, 0, 0, 0, 0, 43, 1, 0, 0, 0,
		0, 45, 1, 0, 0, 0, 0, 47, 1, 0, 0, 0, 0, 49, 1, 0, 0, 0, 0, 51, 1, 0, 0,
		0, 0, 53, 1, 0, 0, 0, 0, 55, 1, 0, 0, 0, 0, 57, 1, 0, 0, 0, 0, 59, 1, 0,
		0, 0, 0, 61, 1, 0, 0, 0, 0, 63, 1, 0, 0, 0, 0, 65, 1, 0, 0, 0, 0, 67, 1,
		0, 0, 0, 0, 69, 1, 0, 0, 0, 0, 71, 1, 0, 0, 0, 0, 73, 1, 0, 0, 0, 0, 75,
		1, 0, 0, 0, 0, 77, 1, 0, 0, 0, 0, 79, 1, 0, 0, 0, 0, 81, 1, 0, 0, 0, 0,
		83, 1, 0, 0, 0, 0, 85, 1, 0, 0, 0, 0, 87, 1, 0, 0, 0, 0, 89, 1, 0, 0, 0,
		0, 91, 1, 0, 0, 0, 0, 93, 1, 0, 0, 0, 0, 95, 1, 0, 0, 0, 0, 97, 1, 0, 0,
		0, 0, 99, 1, 0, 0, 0, 0, 101, 1, 0, 0, 0, 0, 103, 1, 0, 0, 0, 0, 105, 1,
		0, 0, 0, 0, 107, 1, 0, 0, 0, 0, 109, 1, 0, 0, 0, 0, 111, 1, 0, 0, 0, 0,
		113, 1, 0, 0, 0, 0, 115, 1, 0, 0, 0, 0, 117, 1, 0, 0, 0, 0, 119, 1, 0,
		0, 0, 0, 121, 1, 0, 0, 0, 0, 123, 1, 0, 0, 0, 0, 125, 1, 0, 0, 0, 0, 127,
		1, 0, 0, 0, 0, 129, 1, 0, 0, 0, 0, 131, 1, 0, 0, 0, 0, 133, 1, 0, 0, 0,
		1, 137, 1, 0, 0, 0, 3, 141, 1, 0, 0, 0, 5, 147, 1, 0, 0, 0, 7, 152, 1,
		0, 0, 0, 9, 159, 1, 0, 0, 0, 11, 169, 1, 0, 0, 0, 13, 173, 1, 0, 0, 0,
		15, 177, 1, 0, 0, 0, 17, 182, 1, 0, 0, 0, 19, 187, 1, 0, 0, 0, 21, 193,
		1, 0, 0, 0, 23, 199, 1, 0, 0, 0, 25, 202, 1, 0, 0, 0, 27, 207, 1, 0, 0,
		0, 29, 213, 1, 0, 0, 0, 31, 217, 1, 0, 0, 0, 33, 220, 1, 0, 0, 0, 35, 227,
		1, 0, 0, 0, 37, 232, 1, 0, 0, 0, 39, 240, 1, 0, 0, 0, 41, 246, 1, 0, 0,
		0, 43, 253, 1, 0, 0, 0, 45, 262, 1, 0, 0, 0, 47, 268, 1, 0, 0, 0, 49, 273,
		1, 0, 0, 0, 51, 277, 1, 0, 0, 0, 53, 284, 1, 0, 0, 0, 55, 293, 1, 0, 0,
		0, 57, 298, 1, 0, 0, 0, 59, 304, 1, 0, 0, 0, 61, 311, 1, 0, 0, 0, 63, 322,
		1, 0, 0, 0, 65, 329, 1, 0, 0, 0, 67, 332, 1, 0, 0, 0, 69, 340, 1, 0, 0,
		0, 71, 347, 1, 0, 0, 0, 73, 359, 1, 0, 0, 0, 75, 368, 1, 0, 0, 0, 77, 375,
		1, 0, 0, 0, 79, 378, 1, 0, 0, 0, 81, 381, 1, 0, 0, 0, 83, 383, 1, 0, 0,
		0, 85, 386, 1, 0, 0, 0, 87, 389, 1, 0, 0, 0, 89, 391, 1, 0, 0, 0, 91, 394,
		1, 0, 0, 0, 93, 397, 1, 0, 0, 0, 95, 400, 1, 0, 0, 0, 97, 403, 1, 0, 0,
		0, 99, 405, 1, 0, 0, 0, 101, 407, 1, 0, 0, 0, 103, 409, 1, 0, 0, 0, 105,
		411, 1, 0, 0, 0, 107, 413, 1, 0, 0, 0, 109, 415, 1, 0, 0, 0, 111, 417,
		1, 0, 0, 0, 113, 419, 1, 0, 0, 0, 115, 421, 1, 0, 0, 0, 117, 423, 1, 0,
		0, 0, 119, 425, 1, 0, 0, 0, 121, 427, 1, 0, 0, 0, 123, 429, 1, 0, 0, 0,
		125, 431, 1, 0, 0, 0, 127, 433, 1, 0, 0, 0, 129, 436, 1, 0, 0, 0, 131,
		442, 1, 0, 0, 0, 133, 456, 1, 0, 0, 0, 135, 467, 1, 0, 0, 0, 137, 138,
		5, 73, 0, 0, 138, 139, 5, 110, 0, 0, 139, 140, 5, 116, 0, 0, 140, 2, 1,
		0, 0, 0, 141, 142, 5, 70, 0, 0, 142, 143, 5, 108, 0, 0, 143, 144, 5, 111,
		0, 0, 144, 145, 5, 97, 0, 0, 145, 146, 5, 116, 0, 0, 146, 4, 1, 0, 0, 0,
		147, 148, 5, 66, 0, 0, 148, 149, 5, 111, 0, 0, 149, 150, 5, 111, 0, 0,
		150, 151, 5, 108, 0, 0, 151, 6, 1, 0, 0, 0, 152, 153, 5, 83, 0, 0, 153,
		154, 5, 116, 0, 0, 154, 155, 5, 114, 0, 0, 155, 156, 5, 105, 0, 0, 156,
		157, 5, 110, 0, 0, 157, 158, 5, 103, 0, 0, 158, 8, 1, 0, 0, 0, 159, 160,
		5, 67, 0, 0, 160, 161, 5, 104, 0, 0, 161, 162, 5, 97, 0, 0, 162, 163, 5,
		114, 0, 0, 163, 164, 5, 97, 0, 0, 164, 165, 5, 99, 0, 0, 165, 166, 5, 116,
		0, 0, 166, 167, 5, 101, 0, 0, 167, 168, 5, 114, 0, 0, 168, 10, 1, 0, 0,
		0, 169, 170, 5, 118, 0, 0, 170, 171, 5, 97, 0, 0, 171, 172, 5, 114, 0,
		0, 172, 12, 1, 0, 0, 0, 173, 174, 5, 108, 0, 0, 174, 175, 5, 101, 0, 0,
		175, 176, 5, 116, 0, 0, 176, 14, 1, 0, 0, 0, 177, 178, 5, 118, 0, 0, 178,
		179, 5, 111, 0, 0, 179, 180, 5, 105, 0, 0, 180, 181, 5, 100, 0, 0, 181,
		16, 1, 0, 0, 0, 182, 183, 5, 116, 0, 0, 183, 184, 5, 114, 0, 0, 184, 185,
		5, 117, 0, 0, 185, 186, 5, 101, 0, 0, 186, 18, 1, 0, 0, 0, 187, 188, 5,
		102, 0, 0, 188, 189, 5, 97, 0, 0, 189, 190, 5, 108, 0, 0, 190, 191, 5,
		115, 0, 0, 191, 192, 5, 101, 0, 0, 192, 20, 1, 0, 0, 0, 193, 194, 5, 112,
		0, 0, 194, 195, 5, 114, 0, 0, 195, 196, 5, 105, 0, 0, 196, 197, 5, 110,
		0, 0, 197, 198, 5, 116, 0, 0, 198, 22, 1, 0, 0, 0, 199, 200, 5, 105, 0,
		0, 200, 201, 5, 102, 0, 0, 201, 24, 1, 0, 0, 0, 202, 203, 5, 101, 0, 0,
		203, 204, 5, 108, 0, 0, 204, 205, 5, 115, 0, 0, 205, 206, 5, 101, 0, 0,
		206, 26, 1, 0, 0, 0, 207, 208, 5, 119, 0, 0, 208, 209, 5, 104, 0, 0, 209,
		210, 5, 105, 0, 0, 210, 211, 5, 108, 0, 0, 211, 212, 5, 101, 0, 0, 212,
		28, 1, 0, 0, 0, 213, 214, 5, 102, 0, 0, 214, 215, 5, 111, 0, 0, 215, 216,
		5, 114, 0, 0, 216, 30, 1, 0, 0, 0, 217, 218, 5, 105, 0, 0, 218, 219, 5,
		110, 0, 0, 219, 32, 1, 0, 0, 0, 220, 221, 5, 115, 0, 0, 221, 222, 5, 119,
		0, 0, 222, 223, 5, 105, 0, 0, 223, 224, 5, 116, 0, 0, 224, 225, 5, 99,
		0, 0, 225, 226, 5, 104, 0, 0, 226, 34, 1, 0, 0, 0, 227, 228, 5, 99, 0,
		0, 228, 229, 5, 97, 0, 0, 229, 230, 5, 115, 0, 0, 230, 231, 5, 101, 0,
		0, 231, 36, 1, 0, 0, 0, 232, 233, 5, 100, 0, 0, 233, 234, 5, 101, 0, 0,
		234, 235, 5, 102, 0, 0, 235, 236, 5, 97, 0, 0, 236, 237, 5, 117, 0, 0,
		237, 238, 5, 108, 0, 0, 238, 239, 5, 116, 0, 0, 239, 38, 1, 0, 0, 0, 240,
		241, 5, 98, 0, 0, 241, 242, 5, 114, 0, 0, 242, 243, 5, 101, 0, 0, 243,
		244, 5, 97, 0, 0, 244, 245, 5, 107, 0, 0, 245, 40, 1, 0, 0, 0, 246, 247,
		5, 114, 0, 0, 247, 248, 5, 101, 0, 0, 248, 249, 5, 116, 0, 0, 249, 250,
		5, 117, 0, 0, 250, 251, 5, 114, 0, 0, 251, 252, 5, 110, 0, 0, 252, 42,
		1, 0, 0, 0, 253, 254, 5, 99, 0, 0, 254, 255, 5, 111, 0, 0, 255, 256, 5,
		110, 0, 0, 256, 257, 5, 116, 0, 0, 257, 258, 5, 105, 0, 0, 258, 259, 5,
		110, 0, 0, 259, 260, 5, 117, 0, 0, 260, 261, 5, 101, 0, 0, 261, 44, 1,
		0, 0, 0, 262, 263, 5, 103, 0, 0, 263, 264, 5, 117, 0, 0, 264, 265, 5, 97,
		0, 0, 265, 266, 5, 114, 0, 0, 266, 267, 5, 100, 0, 0, 267, 46, 1, 0, 0,
		0, 268, 269, 5, 102, 0, 0, 269, 270, 5, 117, 0, 0, 270, 271, 5, 110, 0,
		0, 271, 272, 5, 99, 0, 0, 272, 48, 1, 0, 0, 0, 273, 274, 5, 110, 0, 0,
		274, 275, 5, 105, 0, 0, 275, 276, 5, 108, 0, 0, 276, 50, 1, 0, 0, 0, 277,
		278, 5, 115, 0, 0, 278, 279, 5, 116, 0, 0, 279, 280, 5, 114, 0, 0, 280,
		281, 5, 117, 0, 0, 281, 282, 5, 99, 0, 0, 282, 283, 5, 116, 0, 0, 283,
		52, 1, 0, 0, 0, 284, 285, 5, 109, 0, 0, 285, 286, 5, 117, 0, 0, 286, 287,
		5, 116, 0, 0, 287, 288, 5, 97, 0, 0, 288, 289, 5, 116, 0, 0, 289, 290,
		5, 105, 0, 0, 290, 291, 5, 110, 0, 0, 291, 292, 5, 103, 0, 0, 292, 54,
		1, 0, 0, 0, 293, 294, 5, 115, 0, 0, 294, 295, 5, 101, 0, 0, 295, 296, 5,
		108, 0, 0, 296, 297, 5, 102, 0, 0, 297, 56, 1, 0, 0, 0, 298, 299, 5, 105,
		0, 0, 299, 300, 5, 110, 0, 0, 300, 301, 5, 111, 0, 0, 301, 302, 5, 117,
		0, 0, 302, 303, 5, 116, 0, 0, 303, 58, 1, 0, 0, 0, 304, 305, 5, 97, 0,
		0, 305, 306, 5, 112, 0, 0, 306, 307, 5, 112, 0, 0, 307, 308, 5, 101, 0,
		0, 308, 309, 5, 110, 0, 0, 309, 310, 5, 100, 0, 0, 310, 60, 1, 0, 0, 0,
		311, 312, 5, 114, 0, 0, 312, 313, 5, 101, 0, 0, 313, 314, 5, 109, 0, 0,
		314, 315, 5, 111, 0, 0, 315, 316, 5, 118, 0, 0, 316, 317, 5, 101, 0, 0,
		317, 318, 5, 76, 0, 0, 318, 319, 5, 97, 0, 0, 319, 320, 5, 115, 0, 0, 320,
		321, 5, 116, 0, 0, 321, 62, 1, 0, 0, 0, 322, 323, 5, 114, 0, 0, 323, 324,
		5, 101, 0, 0, 324, 325, 5, 109, 0, 0, 325, 326, 5, 111, 0, 0, 326, 327,
		5, 118, 0, 0, 327, 328, 5, 101, 0, 0, 328, 64, 1, 0, 0, 0, 329, 330, 5,
		97, 0, 0, 330, 331, 5, 116, 0, 0, 331, 66, 1, 0, 0, 0, 332, 333, 5, 105,
		0, 0, 333, 334, 5, 115, 0, 0, 334, 335, 5, 69, 0, 0, 335, 336, 5, 109,
		0, 0, 336, 337, 5, 112, 0, 0, 337, 338, 5, 116, 0, 0, 338, 339, 5, 121,
		0, 0, 339, 68, 1, 0, 0, 0, 340, 341, 5, 99, 0, 0, 341, 342, 5, 111, 0,
		0, 342, 343, 5, 117, 0, 0, 343, 344, 5, 110, 0, 0, 344, 345, 5, 116, 0,
		0, 345, 70, 1, 0, 0, 0, 346, 348, 7, 0, 0, 0, 347, 346, 1, 0, 0, 0, 348,
		349, 1, 0, 0, 0, 349, 347, 1, 0, 0, 0, 349, 350, 1, 0, 0, 0, 350, 357,
		1, 0, 0, 0, 351, 353, 5, 46, 0, 0, 352, 354, 7, 0, 0, 0, 353, 352, 1, 0,
		0, 0, 354, 355, 1, 0, 0, 0, 355, 353, 1, 0, 0, 0, 355, 356, 1, 0, 0, 0,
		356, 358, 1, 0, 0, 0, 357, 351, 1, 0, 0, 0, 357, 358, 1, 0, 0, 0, 358,
		72, 1, 0, 0, 0, 359, 363, 5, 34, 0, 0, 360, 362, 8, 1, 0, 0, 361, 360,
		1, 0, 0, 0, 362, 365, 1, 0, 0, 0, 363, 361, 1, 0, 0, 0, 363, 364, 1, 0,
		0, 0, 364, 366, 1, 0, 0, 0, 365, 363, 1, 0, 0, 0, 366, 367, 5, 34, 0, 0,
		367, 74, 1, 0, 0, 0, 368, 372, 7, 2, 0, 0, 369, 371, 7, 3, 0, 0, 370, 369,
		1, 0, 0, 0, 371, 374, 1, 0, 0, 0, 372, 370, 1, 0, 0, 0, 372, 373, 1, 0,
		0, 0, 373, 76, 1, 0, 0, 0, 374, 372, 1, 0, 0, 0, 375, 376, 5, 33, 0, 0,
		376, 377, 5, 61, 0, 0, 377, 78, 1, 0, 0, 0, 378, 379, 5, 61, 0, 0, 379,
		380, 5, 61, 0, 0, 380, 80, 1, 0, 0, 0, 381, 382, 5, 33, 0, 0, 382, 82,
		1, 0, 0, 0, 383, 384, 5, 124, 0, 0, 384, 385, 5, 124, 0, 0, 385, 84, 1,
		0, 0, 0, 386, 387, 5, 38, 0, 0, 387, 388, 5, 38, 0, 0, 388, 86, 1, 0, 0,
		0, 389, 390, 5, 61, 0, 0, 390, 88, 1, 0, 0, 0, 391, 392, 5, 62, 0, 0, 392,
		393, 5, 61, 0, 0, 393, 90, 1, 0, 0, 0, 394, 395, 5, 60, 0, 0, 395, 396,
		5, 61, 0, 0, 396, 92, 1, 0, 0, 0, 397, 398, 5, 43, 0, 0, 398, 399, 5, 61,
		0, 0, 399, 94, 1, 0, 0, 0, 400, 401, 5, 45, 0, 0, 401, 402, 5, 61, 0, 0,
		402, 96, 1, 0, 0, 0, 403, 404, 5, 62, 0, 0, 404, 98, 1, 0, 0, 0, 405, 406,
		5, 60, 0, 0, 406, 100, 1, 0, 0, 0, 407, 408, 5, 42, 0, 0, 408, 102, 1,
		0, 0, 0, 409, 410, 5, 47, 0, 0, 410, 104, 1, 0, 0, 0, 411, 412, 5, 43,
		0, 0, 412, 106, 1, 0, 0, 0, 413, 414, 5, 45, 0, 0, 414, 108, 1, 0, 0, 0,
		415, 416, 5, 37, 0, 0, 416, 110, 1, 0, 0, 0, 417, 418, 5, 40, 0, 0, 418,
		112, 1, 0, 0, 0, 419, 420, 5, 41, 0, 0, 420, 114, 1, 0, 0, 0, 421, 422,
		5, 123, 0, 0, 422, 116, 1, 0, 0, 0, 423, 424, 5, 125, 0, 0, 424, 118, 1,
		0, 0, 0, 425, 426, 5, 58, 0, 0, 426, 120, 1, 0, 0, 0, 427, 428, 5, 91,
		0, 0, 428, 122, 1, 0, 0, 0, 429, 430, 5, 93, 0, 0, 430, 124, 1, 0, 0, 0,
		431, 432, 5, 44, 0, 0, 432, 126, 1, 0, 0, 0, 433, 434, 5, 46, 0, 0, 434,
		128, 1, 0, 0, 0, 435, 437, 7, 4, 0, 0, 436, 435, 1, 0, 0, 0, 437, 438,
		1, 0, 0, 0, 438, 436, 1, 0, 0, 0, 438, 439, 1, 0, 0, 0, 439, 440, 1, 0,
		0, 0, 440, 441, 6, 64, 0, 0, 441, 130, 1, 0, 0, 0, 442, 443, 5, 47, 0,
		0, 443, 444, 5, 42, 0, 0, 444, 448, 1, 0, 0, 0, 445, 447, 9, 0, 0, 0, 446,
		445, 1, 0, 0, 0, 447, 450, 1, 0, 0, 0, 448, 449, 1, 0, 0, 0, 448, 446,
		1, 0, 0, 0, 449, 451, 1, 0, 0, 0, 450, 448, 1, 0, 0, 0, 451, 452, 5, 42,
		0, 0, 452, 453, 5, 47, 0, 0, 453, 454, 1, 0, 0, 0, 454, 455, 6, 65, 0,
		0, 455, 132, 1, 0, 0, 0, 456, 457, 5, 47, 0, 0, 457, 458, 5, 47, 0, 0,
		458, 462, 1, 0, 0, 0, 459, 461, 8, 5, 0, 0, 460, 459, 1, 0, 0, 0, 461,
		464, 1, 0, 0, 0, 462, 460, 1, 0, 0, 0, 462, 463, 1, 0, 0, 0, 463, 465,
		1, 0, 0, 0, 464, 462, 1, 0, 0, 0, 465, 466, 6, 66, 0, 0, 466, 134, 1, 0,
		0, 0, 467, 468, 5, 92, 0, 0, 468, 469, 7, 6, 0, 0, 469, 136, 1, 0, 0, 0,
		9, 0, 349, 355, 357, 363, 372, 438, 448, 462, 1, 6, 0, 0,
	}
	deserializer := antlr.NewATNDeserializer(nil)
	staticData.atn = deserializer.Deserialize(staticData.serializedATN)
	atn := staticData.atn
	staticData.decisionToDFA = make([]*antlr.DFA, len(atn.DecisionToState))
	decisionToDFA := staticData.decisionToDFA
	for index, state := range atn.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(state, index)
	}
}

// SwiftLexerInit initializes any static state used to implement SwiftLexer. By default the
// static state used to implement the lexer is lazily initialized during the first call to
// NewSwiftLexer(). You can call this function if you wish to initialize the static state ahead
// of time.
func SwiftLexerInit() {
	staticData := &SwiftLexerLexerStaticData
	staticData.once.Do(swiftlexerLexerInit)
}

// NewSwiftLexer produces a new lexer instance for the optional input antlr.CharStream.
func NewSwiftLexer(input antlr.CharStream) *SwiftLexer {
	SwiftLexerInit()
	l := new(SwiftLexer)
	l.BaseLexer = antlr.NewBaseLexer(input)
	staticData := &SwiftLexerLexerStaticData
	l.Interpreter = antlr.NewLexerATNSimulator(l, staticData.atn, staticData.decisionToDFA, staticData.PredictionContextCache)
	l.channelNames = staticData.ChannelNames
	l.modeNames = staticData.ModeNames
	l.RuleNames = staticData.RuleNames
	l.LiteralNames = staticData.LiteralNames
	l.SymbolicNames = staticData.SymbolicNames
	l.GrammarFileName = "SwiftLexer.g4"
	// TODO: l.EOF = antlr.TokenEOF

	return l
}

// SwiftLexer tokens.
const (
	SwiftLexerINT          = 1
	SwiftLexerFLOAT        = 2
	SwiftLexerBOOL         = 3
	SwiftLexerSTR          = 4
	SwiftLexerCHAR         = 5
	SwiftLexerVAR          = 6
	SwiftLexerLET          = 7
	SwiftLexerVOID         = 8
	SwiftLexerTRU          = 9
	SwiftLexerFAL          = 10
	SwiftLexerPRINT        = 11
	SwiftLexerIF           = 12
	SwiftLexerELSE         = 13
	SwiftLexerWHILE        = 14
	SwiftLexerFOR          = 15
	SwiftLexerIN           = 16
	SwiftLexerSWITCH       = 17
	SwiftLexerCASE         = 18
	SwiftLexerDEFAULT      = 19
	SwiftLexerBREAK        = 20
	SwiftLexerRETURN       = 21
	SwiftLexerCONTINUE     = 22
	SwiftLexerGUARD        = 23
	SwiftLexerFUNC         = 24
	SwiftLexerNIL          = 25
	SwiftLexerSTRUCT       = 26
	SwiftLexerMUTATING     = 27
	SwiftLexerSELF         = 28
	SwiftLexerINOUT        = 29
	SwiftLexerAPPEND       = 30
	SwiftLexerREMOVELAST   = 31
	SwiftLexerREMOVE       = 32
	SwiftLexerAT           = 33
	SwiftLexerISEMPTY      = 34
	SwiftLexerCOUNT        = 35
	SwiftLexerNUMBER       = 36
	SwiftLexerSTRING       = 37
	SwiftLexerID           = 38
	SwiftLexerDIF          = 39
	SwiftLexerIG_IG        = 40
	SwiftLexerNOT          = 41
	SwiftLexerOR           = 42
	SwiftLexerAND          = 43
	SwiftLexerIG           = 44
	SwiftLexerMAY_IG       = 45
	SwiftLexerMEN_IG       = 46
	SwiftLexerSUM_IG       = 47
	SwiftLexerSUB_IG       = 48
	SwiftLexerMAYOR        = 49
	SwiftLexerMENOR        = 50
	SwiftLexerMUL          = 51
	SwiftLexerDIV          = 52
	SwiftLexerADD          = 53
	SwiftLexerSUB          = 54
	SwiftLexerMOD          = 55
	SwiftLexerPARIZQ       = 56
	SwiftLexerPARDER       = 57
	SwiftLexerLLAVEIZQ     = 58
	SwiftLexerLLAVEDER     = 59
	SwiftLexerD_PTS        = 60
	SwiftLexerCORIZQ       = 61
	SwiftLexerCORDER       = 62
	SwiftLexerCOMA         = 63
	SwiftLexerPUNTO        = 64
	SwiftLexerWHITESPACE   = 65
	SwiftLexerCOMMENT      = 66
	SwiftLexerLINE_COMMENT = 67
)

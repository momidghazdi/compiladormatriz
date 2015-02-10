package comp;
import java_cup.runtime.Symbol;
%%
%class AnalizadorLexico
%cup
%full
%line
%column
%char
%ignorecase
%eofval{
	return new Symbol(sym.EOF,new String("Fin del archivo"));
%eofval}

%{
    int lineaActual = 1;
    private static int actualEtq=0;
    private static String nuevaEtq() {
        return "etqL"+(++actualEtq);
    }

    /*  Generamos un java_cup.Symbol para guardar el tipo de token encontrado */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    /* Generamos un Symbol para el tipo de token encontrado junto con su valor */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

//Expresiones regulares

digito = 0|[1-9][0-9]*
SaltoLinea = \r|\n|\r\n|\n\r
espacio = \t|\f|" "

%%
"("         { return new Symbol(sym.ABREPARENTESIS, new token(yycolumn, yyline, yytext())); }
")"         { return new Symbol(sym.CIERRAPARENTESIS, new token(yycolumn, yyline, yytext())); }
";"         { return new Symbol(sym.PUNTOYCOMA, new token(yycolumn, yyline, yytext())); }
","         { return new Symbol(sym.COMA, new token(yycolumn, yyline, yytext())); }

//"entero"    { return new Symbol(sym.INT, new token(yycolumn, yyline, yytext()));}
//{digito} {System.out.print(yytext()); return symbol(sym.INT, new Integer(yytext())); }

{digito} {return new Symbol(sym.INT, new token(yycolumn, yyline, yytext()));}   

{SaltoLinea} {return new Symbol(sym.ENTER, new token(yycolumn, yyline, yytext()));}
{espacio}+  {;}
.    {System.err.println("caracter invalido" + yytext() + "["+ yyline + ":"+ yycolumn + "]");}
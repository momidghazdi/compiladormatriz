package comp;

import java_cup.runtime.*;
import java.io.FileReader;
import javax.swing.JTextArea;
/**
 * CUP v0.11b 20141202 (SVN rev 60) generated parser.
 */
@SuppressWarnings({"rawtypes"})
public class AnalizadorSintactico extends java_cup.runtime.lr_parser {

    public final Class getSymbolContainer() {
        return sym.class;
    }

    public AnalizadorSintactico() {
        super();
    }

    JTextArea txterror;

    public AnalizadorSintactico(java_cup.runtime.Scanner s, JTextArea txterror) {
        super(s);
        this.txterror = txterror;
    }

    /**
     * Constructor which sets the default scanner.
     */
    public AnalizadorSintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {
        super(s, sf);
    }

    /**
     * Production table.
     */
    protected static final short _production_table[][]
            = unpackFromStrings(new String[]{
                "\000\011\000\002\002\004\000\002\004\005\000\002\002"
                + "\004\000\002\002\007\000\002\002\003\000\002\003\004"
                + "\000\002\005\010\000\002\006\010\000\002\007\010"});

    /**
     * Access to production table.
     */
    public short[][] production_table() {
        return _production_table;
    }

    /**
     * Parse-action table.
     */
    protected static final short[][] _action_table
            = unpackFromStrings(new String[]{
                "\000\046\000\004\004\004\001\002\000\004\011\012\001"
                + "\002\000\004\002\006\001\002\000\004\002\001\001\002"
                + "\000\006\005\041\011\043\001\002\000\006\005\ufffd\011"
                + "\ufffd\001\002\000\004\007\020\001\002\000\004\010\013"
                + "\001\002\000\004\011\014\001\002\000\004\010\015\001"
                + "\002\000\004\011\016\001\002\000\004\006\017\001\002"
                + "\000\010\005\ufff9\007\ufffb\011\ufff9\001\002\000\002\001"
                + "\002\000\006\007\023\011\024\001\002\000\006\007\ufffc"
                + "\011\ufffc\001\002\000\004\011\033\001\002\000\004\010"
                + "\025\001\002\000\004\011\026\001\002\000\004\010\027"
                + "\001\002\000\004\011\030\001\002\000\004\006\031\001"
                + "\002\000\006\007\ufffa\011\ufffa\001\002\000\006\005\ufffe"
                + "\011\ufffe\001\002\000\004\010\034\001\002\000\004\011"
                + "\035\001\002\000\004\010\036\001\002\000\004\011\037"
                + "\001\002\000\004\006\040\001\002\000\006\005\ufff9\011"
                + "\ufff9\001\002\000\004\002\000\001\002\000\006\005\uffff"
                + "\011\uffff\001\002\000\004\010\044\001\002\000\004\011"
                + "\045\001\002\000\004\010\046\001\002\000\004\011\047"
                + "\001\002\000\004\006\050\001\002\000\006\005\ufffb\011"
                + "\ufffb\001\002"});

    /**
     * Access to parse-action table.
     */
    public short[][] action_table() {
        return _action_table;
    }

    /**
     * <code>reduce_goto</code> table.
     */
    protected static final short[][] _reduce_table
            = unpackFromStrings(new String[]{
                "\000\046\000\004\004\004\001\001\000\010\002\006\005"
                + "\010\007\007\001\001\000\002\001\001\000\002\001\001"
                + "\000\004\005\041\001\001\000\002\001\001\000\002\001"
                + "\001\000\002\001\001\000\002\001\001\000\002\001\001"
                + "\000\002\001\001\000\002\001\001\000\002\001\001\000"
                + "\004\003\020\001\001\000\004\006\021\001\001\000\002"
                + "\001\001\000\004\007\031\001\001\000\002\001\001\000"
                + "\002\001\001\000\002\001\001\000\002\001\001\000\002"
                + "\001\001\000\002\001\001\000\002\001\001\000\002\001"
                + "\001\000\002\001\001\000\002\001\001\000\002\001\001"
                + "\000\002\001\001\000\002\001\001\000\002\001\001\000"
                + "\002\001\001\000\002\001\001\000\002\001\001\000\002"
                + "\001\001\000\002\001\001\000\002\001\001\000\002\001"
                + "\001"});

    /**
     * Access to <code>reduce_goto</code> table.
     */
    public short[][] reduce_table() {
        return _reduce_table;
    }

    /**
     * Instance of action encapsulation class.
     */
    protected CUP$AnalizadorSintactico$actions action_obj;

    /**
     * Action encapsulation object initializer.
     */
    protected void init_actions() {
        action_obj = new CUP$AnalizadorSintactico$actions(this);
    }

    /**
     * Invoke a user supplied parse action.
     */
    public java_cup.runtime.Symbol do_action(
            int act_num,
            java_cup.runtime.lr_parser parser,
            java.util.Stack stack,
            int top)
            throws java.lang.Exception {
        /* call code in generated class */
        return action_obj.CUP$AnalizadorSintactico$do_action(act_num, parser, stack, top);
    }

    /**
     * Indicates start state.
     */
    public int start_state() {
        return 0;
    }

    /**
     * Indicates start production.
     */
    public int start_production() {
        return 0;
    }

    /**
     * <code>EOF</code> Symbol index.
     */
    public int EOF_sym() {
        return 0;
    }

    /**
     * <code>error</code> Symbol index.
     */
    public int error_sym() {
        return 1;
    }

    @Override
    public void syntax_error(Symbol sy) {
        token t = (token) sy.value;
        done_parsing();
        report_error("Error de Sintaxis \"" + t.getCadena() + "\" : [" + t.getRow() + " : " + t.getCol() + "]", null);
        txterror.setText("Error cerca del token: \"" + t.getCadena() + "\" : En la Linea [" + t.getRow() + " : " + t.getCol() + "]  " + "\n" + txterror.getText());
        txterror.setText(txterror.getText() + "\n" + "Se debe tener la sig. Estructura:" + "\n"
                + "\t" + " (1,2,3;4,6,1;7,8,9;) ");
    }

    /* Reporte de error encontrado. */
    public void report_error(String message, Object info) {
        StringBuilder m = new StringBuilder("Error");
        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
            if (s.left >= 0) {
                m.append(" en la línea " + (s.left + 1));
                if (s.right >= 0) {
                    m.append(", columna " + (s.right + 1));
                }
            }
        }
        m.append(" : " + message);
        System.err.println(m);
    }

    /* Cuando se encuentra un error de donde el sistema no puede recuperarse, se lanza un error fatal. Se despliega el mensaje
     de error y se finaliza la ejecucion. */
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        // System.exit(1);
    }

    /**
     * Cup generated class to encapsulate user supplied action code.
     */
    @SuppressWarnings({"rawtypes", "unchecked", "unused"})
    class CUP$AnalizadorSintactico$actions {

        private final AnalizadorSintactico parser;

        /**
         * Constructor
         */
        CUP$AnalizadorSintactico$actions(AnalizadorSintactico parser) {
            this.parser = parser;
        }

        /**
         * Method 0 with the actual generated action code for actions 0 to 300.
         */
        public final java_cup.runtime.Symbol CUP$AnalizadorSintactico$do_action_part00000000(
                int CUP$AnalizadorSintactico$act_num,
                java_cup.runtime.lr_parser CUP$AnalizadorSintactico$parser,
                java.util.Stack CUP$AnalizadorSintactico$stack,
                int CUP$AnalizadorSintactico$top)
                throws java.lang.Exception {
            /* Symbol object for return from actions */
            java_cup.runtime.Symbol CUP$AnalizadorSintactico$result;

            /* select the action based on the action number */
            switch (CUP$AnalizadorSintactico$act_num) {
                /*. . . . . . . . . . . . . . . . . . . .*/
                case 0: // $START ::= prog EOF 
                {
                    Object RESULT = null;
                    int start_valleft = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)).left;
                    int start_valright = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)).right;
                    Object start_val = (Object) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)).value;
                    RESULT = start_val;
                    CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("$START", 0, ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)), ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()), RESULT);
                }
                /* ACCEPT */
                CUP$AnalizadorSintactico$parser.done_parsing();
                return CUP$AnalizadorSintactico$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 1: // prog ::= ABREPARENTESIS instrucciones CIERRAPARENTESIS 
                {
                    Object RESULT = null;

                    CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("prog", 2, ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 2)), ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()), RESULT);
                }
                return CUP$AnalizadorSintactico$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 2: // instrucciones ::= instrucciones expresion1 
                {
                    Object RESULT = null;

                    CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("instrucciones", 0, ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)), ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()), RESULT);
                }
                return CUP$AnalizadorSintactico$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 3: // instrucciones ::= expresion1 ENTER instruccion ENTER expresion3 
                {
                    Object RESULT = null;

                    CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("instrucciones", 0, ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 4)), ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()), RESULT);
                }
                return CUP$AnalizadorSintactico$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 4: // instrucciones ::= expresion3 
                {
                    Object RESULT = null;

                    CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("instrucciones", 0, ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()), RESULT);
                }
                return CUP$AnalizadorSintactico$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 5: // instruccion ::= instruccion expresion2 
                {
                    Object RESULT = null;

                    CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("instruccion", 1, ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)), ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()), RESULT);
                }
                return CUP$AnalizadorSintactico$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 6: // expresion1 ::= INT COMA INT COMA INT PUNTOYCOMA 
                {
                    Object RESULT = null;
                    int aleft = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 5)).left;
                    int aright = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 5)).right;
                    token a = (token) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 5)).value;
                    int bleft = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 3)).left;
                    int bright = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 3)).right;
                    token b = (token) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 3)).value;
                    int cleft = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)).left;
                    int cright = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)).right;
                    token c = (token) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)).value;
                    System.out.println("" + a + " " + b + " " + c);

                    CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expresion1", 3, ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 5)), ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()), RESULT);
                }
                return CUP$AnalizadorSintactico$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 7: // expresion2 ::= INT COMA INT COMA INT PUNTOYCOMA 
                {
                    Object RESULT = null;
                    int dleft = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 5)).left;
                    int dright = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 5)).right;
                    token d = (token) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 5)).value;
                    int eleft = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 3)).left;
                    int eright = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 3)).right;
                    token e = (token) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 3)).value;
                    int fleft = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)).left;
                    int fright = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)).right;
                    token f = (token) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)).value;
                    System.out.println("" + d + " " + e + " " + f);

                    CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expresion2", 4, ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 5)), ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()), RESULT);
                }
                return CUP$AnalizadorSintactico$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 8: // expresion3 ::= INT COMA INT COMA INT PUNTOYCOMA 
                {
                    Object RESULT = null;
                    int gleft = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 5)).left;
                    int gright = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 5)).right;
                    token g = (token) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 5)).value;
                    int hleft = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 3)).left;
                    int hright = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 3)).right;
                    token h = (token) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 3)).value;
                    int ileft = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)).left;
                    int iright = ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)).right;
                    token i = (token) ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 1)).value;
                    System.out.println("" + g + " " + h + " " + i);

                    CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expresion3", 5, ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top - 5)), ((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()), RESULT);
                }
                return CUP$AnalizadorSintactico$result;

                /* . . . . . .*/
                default:
                    throw new Exception(
                            "Invalid action number " + CUP$AnalizadorSintactico$act_num + "found in internal parse table");

            }
        } /* end of method */


        /**
         * Method splitting the generated action code into several parts.
         */
        public final java_cup.runtime.Symbol CUP$AnalizadorSintactico$do_action(
                int CUP$AnalizadorSintactico$act_num,
                java_cup.runtime.lr_parser CUP$AnalizadorSintactico$parser,
                java.util.Stack CUP$AnalizadorSintactico$stack,
                int CUP$AnalizadorSintactico$top)
                throws java.lang.Exception {
            return CUP$AnalizadorSintactico$do_action_part00000000(
                    CUP$AnalizadorSintactico$act_num,
                    CUP$AnalizadorSintactico$parser,
                    CUP$AnalizadorSintactico$stack,
                    CUP$AnalizadorSintactico$top);
        }
    }
}

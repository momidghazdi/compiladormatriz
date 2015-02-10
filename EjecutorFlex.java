package comp;

import java.io.*;
import java_cup.runtime.Symbol;

/**
 *
 * @author Chris
 */
public class EjecutorFlex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    jflex.Main.generate(new File(
                "src"+File.separator+"comp"
                + File.separator + "Lexer.flex"));  
    }
}
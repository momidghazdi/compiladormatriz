package comp;

import java.io.File;

public class MainCup {
    public static void main(String[] args) {
        String opciones[] = new String[5];
        opciones[0] = "-destdir";
        opciones[1] = "src" + File.separator + "comp";
        opciones[2] = "-parser";
        opciones[3] = "AnalizadorSintactico";
        opciones[4] = "src" + File.separator + "comp" + File.separator + "Sintactico.cup";
        try {
            //  java_cup.Main.main(opciones);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
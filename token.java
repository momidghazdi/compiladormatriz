package comp;
public class token {

    private int col;
    private int row;
    private String cadena;
    private int entero;

    public token() {

    }
    public token(int col, int row, String cadena) {
        this.col = col;
        this.row = row;
        this.cadena = cadena;
    }
    public int getCol() {
        return (this.col) + 1;
    }
    public int getRow() {
        return (this.row) + 1;
    }

    public String getCadena() {
        return this.cadena;
    }
    public void setCadena(String c) {
        cadena = c;
    }
    public int getEntero() {
        return this.entero;
    }

    @Override
    public String toString() {
        return "token{" + "col=" + col + ", row=" + row + ", cadena=" + cadena + ", entero=" + entero + '}';
    }
}

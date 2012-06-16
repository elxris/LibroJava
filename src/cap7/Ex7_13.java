package cap7;

public class Ex7_13 {
    public static void main( String args[] ){
        int ventas[][] = new int[3][5];
        
        for( int fila = 0; fila < ventas.length; fila++){
            for( int columna = 0; columna < ventas[fila].length; columna++ ){
                System.out.printf("ventas[%d][%d]\t>>\t", fila, columna);
                ventas[fila][columna] = 0;
            }
            System.out.println("");
        }
    }
}

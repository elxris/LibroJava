package cap6;

import java.util.Scanner;

public class Ex6_28 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        int calif;
        System.out.print("Escriba la calificacion del alumno (0-100): ");
        calif = entrada.nextInt();
        System.out.printf("De %d obtienes %d puntos.", calif, puntosCalidad(calif));
    }
    
    public static int puntosCalidad( int calif ){
        if( calif < 60 ){
            calif = 59;
        }
        calif -= 50;
        return calif / 10;
    }
}

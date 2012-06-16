package cap6;

import java.util.Scanner;

public class Ex6_22 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        System.out.print("Escriba 1 si quiere convertir de Centigrados, o 2 si quiere convertir de Fahrenheit: ");
        if(entrada.nextInt() == 1){
            System.out.print("Escriba los grados Centigrados: ");
            System.out.printf("Fahrenheit: %f", CaF(entrada.nextDouble()));
        }else{
            System.out.print("Escriba los grados Fahrenheit: ");
            System.out.printf("Centigrados: %f", FaC(entrada.nextDouble()));
        }
    }
    
    public static double CaF( double C ){
        return 9.0 / 5.0 * C + 32;
    }
    
    public static double FaC( double F ){
        return 5.0 / 9.0 * ( F - 32 );
    }
}

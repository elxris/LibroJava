package cap6;

import java.util.Scanner;

public class Ex6_18 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        System.out.print("Escriba un numero: ");
        cuadradoDeAsteriscos(entrada.nextInt());
    }
    
    public static void cuadradoDeAsteriscos(int n){
        for(int a = 1; a <= n; a++){
            for(int b = 1; b <= n; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

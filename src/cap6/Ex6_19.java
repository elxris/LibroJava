package cap6;

import java.util.Scanner;

public class Ex6_19 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        int n;
        String t;
        System.out.print("Escriba un numero: ");
        n = entrada.nextInt();
        System.out.print("Escriba un caracter: ");
        t = entrada.next();
        cuadradoDeAsteriscos(n, t);
    }
    
    public static void cuadradoDeAsteriscos(int n, String t){
        for(int a = 1; a <= n; a++){
            for(int b = 1; b <= n; b++){
                System.out.print(t);
            }
            System.out.println();
        }
    }
}

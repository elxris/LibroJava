package cap6;

import java.util.Scanner;

public class Ex6_27 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        int a, b;
        System.out.print("Escriba un numero: ");
        a = entrada.nextInt();
        System.out.print("Escriba un numero: ");
        b = entrada.nextInt();
        System.out.print( mcd(a, b) );
    }
    
    public static int mcd( int a, int b ){
        int t;
        System.out.printf("a: %d b: %d\n", a, b);
        for(; b != 0; ){
            t = a%b;
            a = b;
            b = t;
            System.out.printf("a: %d b: %d\n", a, b);
        }
        return a;
    }
}

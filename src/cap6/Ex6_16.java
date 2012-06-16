package cap6;

import java.util.Scanner;

public class Ex6_16 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner(System.in);
        int a, b;
        for(a = 0; a !=1;){
            System.out.print("Escriba un numero (o -1 para terminar): ");
            a = entrada.nextInt();
            if ( a == -1 ){
                break;
            }
            System.out.print("Escriba un numero: ");
            b = entrada.nextInt();
            System.out.printf("%d%s es multiplo de %d\n", b, (multiplo(a, b)?"":" no"), a);
        }
    }
    
    public static boolean multiplo( int a, int b){
        boolean mult = false;
        if( a % b == 0 ){
            mult = true;
        }
        return mult;
    }
}

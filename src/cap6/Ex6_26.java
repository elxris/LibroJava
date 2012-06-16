package cap6;

import java.util.Scanner;

public class Ex6_26 {
    public static void main( String args[] ){
        System.out.print("Escriba un numero: ");
        System.out.print( invertidos( new Scanner( System.in ).nextInt() ) );
    }
    
    public static int invertidos( int n ){
        int invertidos;
        for(invertidos = 0; n > 0;){
            invertidos *= 10;
            invertidos += n % 10;
            n /= 10;
        }
        return invertidos;
    }
}

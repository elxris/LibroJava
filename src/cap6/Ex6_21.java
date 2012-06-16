package cap6;

import java.util.Scanner;

public class Ex6_21 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        System.out.print("Escriba un numero: ");
        obtenerDigitos(entrada.nextInt());
    }
    
    public static int cocienteEntero(int a, int b){
        return a / b;
    }
    
    public static int cocienteResiduo(int a, int b){
        return a % b;
    }
    
    public static void obtenerDigitos(int a){
        int ultimo = 0;
        for(int b = 10000; b != 0; b /= 10){
            int r = a / b;
            if( !( (ultimo == 0) && (r == 0) ) ){
                System.out.printf("%d ", r);
                ultimo = r;
                a %= b;
            }
        }
    }
}

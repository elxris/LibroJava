package cap5;

import java.util.Scanner;

public class Ex5_11 {
    public static void main ( String args[] ){
        Scanner entrada = new Scanner (System.in);
        System.out.print("Cantidad a comparar: ");
        int x = entrada.nextInt();
        int a, b;
        System.out.print("Escriba un numero: ");
        a = entrada.nextInt();
        b = a;
        for(int i = 1; i < x; i++){
            System.out.print("Escriba un numero: ");
            a = entrada.nextInt();
            if(a > b){
                b = a;
            }
        }
        
        System.out.printf("El numero %d, es el mayor.", a);
    }
}

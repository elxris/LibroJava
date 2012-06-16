package cap5;

import java.util.Scanner;

public class Ex5_16 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner(System.in);
        int numero;
        for(int i = 1; i <= 5; i++){
            System.out.print("Escriba un numero: ");
            numero = entrada.nextInt();
            if(!(numero >= 1 && numero <= 30)){
                numero = 1;
            }
            for(int x = numero; x >= 1; x--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

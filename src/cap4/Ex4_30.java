package cap4;

import java.util.Scanner;

public class Ex4_30 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int a, b, d;
        boolean pase=true;
        System.out.print("Escribe un numero de 5 numeros: ");
        numero = entrada.nextInt();
        
        while(pase){
            if (!(numero < 10000)){
                if (!(numero > 99999)){
                    pase = false;
                }else{
                    System.out.print("Es muy grande, intentalo de nuevo: ");
                    numero = entrada.nextInt();
                }
            }else{
                System.out.print("Es muy pequeño, intentalo de nuevo: ");
                numero = entrada.nextInt();
            }
        }
    
        System.out.printf("El numero %d ", numero);
        a = numero / 10000;
        numero = numero % 10000;
        b = numero / 1000;
        numero = numero % 1000;
        numero = numero % 100;
        d = numero / 10;
        numero = numero % 10;
        
        if (a == numero && b == d){
            System.out.print("es palindromo.");
        }else{
            System.out.print("no es palindromo.");
        }
    }
}

package cap4;

import java.util.Scanner;

public class Ex4_31 {
    public static void main ( String args [] ){
        Scanner entrada = new Scanner(System.in);
        int binario;
        System.out.print("Escribe un numero binario: ");
        binario = entrada.nextInt();
        int bit, numero;
        bit = 1;
        numero = 0;
        
        while (binario != 0){
            numero += (binario % 10) * bit;
            bit *= 2;
            binario /= 10;
        }
        
        System.out.printf("El numero binario corresponde a: %d", numero);
    }
}

package cap4;

import java.util.Scanner;

public class Ex4_21 {
/*Seudocódigo
 * Iniciar variables contador, numero, mayor
 * contador en 1
 * numero en 0
 * mayor en 0
 * Iniciar while (contador <= 10)
 *  recibir numero
 *  si numero  es mayor que mayor
 *      entonces reemplazar
 * fin del ciclo
 * */
    public static void main ( String args []){
        int contador, numero, mayor;
        Scanner entrada = new Scanner ( System.in );
        contador = 1;
        numero = 0;
        mayor = 0;
        
        while (contador <= 10){
            System.out.print("Escriba un numero: ");
            numero = entrada.nextInt();
            if (numero > mayor){
                if (contador != 1){
                    System.out.printf("El numero %d es mayor a %d, por lo tanto se reemplaza.\n", numero, mayor);
                }
                mayor = numero;
            }else{
                System.out.printf("El numero %d no es mayor a %d.\n", numero, mayor);
            }
            contador++;
        }
        System.out.printf("El mayor es: %d", mayor);
    }
}

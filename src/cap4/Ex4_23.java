package cap4;

import java.util.Scanner;

public class Ex4_23 {
    public static void main ( String args []){
        int contador, numero, mayor, mayor2;
        Scanner entrada = new Scanner ( System.in );
        contador = 1;
        numero = 0;
        mayor = 0;
        mayor2 = 0;
        
        while (contador <= 10){
            System.out.print("Escriba un numero: ");
            numero = entrada.nextInt();
            if (numero > mayor){
                if (contador != 1){
                    System.out.printf("El numero %d es mayor a %d, por lo tanto se reemplaza.\n", numero, mayor);
                }
                mayor2 = mayor;
                mayor = numero;
            }else{
                System.out.printf("El numero %d no es mayor a %d.\n", numero, mayor);
            }
            contador++;
        }
        
        System.out.printf("El mayor es: %d\n", mayor);
        System.out.printf("El segundo mayor es: %d", mayor2);
    }
}

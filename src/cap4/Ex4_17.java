package cap4;

import java.util.Scanner;

public class Ex4_17 {
    public static void main( String args[] ){
      //Declarar variables kilometros, litros, y variables temporales.
        int kilometros = 0, litros = 0, k, l;
        Scanner entrada = new Scanner(System.in);
        
      //Mientras centinela no es -1 entonces
        do{
          //Obtener kilometros y litros en esa parada
            System.out.print("Kilometros recorridos: ");
            k = entrada.nextInt();
            System.out.print("Litros consumidos: ");
            l = entrada.nextInt();
          //Calcular promedio de kilometros/litros en esa parada
            System.out.printf("El promedio de kilometros por litro en la parada es: %f\n", promedio(k, l));
          //Sumar kilometros y litros
            kilometros += k;
            litros += l;
            System.out.print("Escriba -1 para terminar o otro numero para continuar ");
        }while( entrada.nextInt() != -1 );
        
        System.out.printf("El total de kilometros es: %d\nEl total de litros es: %d\n", kilometros, litros);
        //Calcular y mostrar el promedio general
        System.out.printf("El promedio de kilometros por litro en general es: %f\n", promedio(kilometros, litros));
    }
    
    public static double promedio(int a, int b){
        return (double) a / b;
    }
}

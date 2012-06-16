package cap5;

import java.util.Scanner;

public class Ex5_17 {
    public static void main ( String args[] ){
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.print("Escriba el numero de producto (1, 2, 3, 4, 5) o 0 para terminar: ");
        
        for(numero = entrada.nextInt(); numero != 0; numero = entrada.nextInt()){
            System.out.print("Escriba la cantidad: ");
            int cantidad = entrada.nextInt();
            switch (numero){
            case 1:
                System.out.printf("Total de venta: %f\n", (double) 2.98 * cantidad);
                break;
            case 2:
                System.out.printf("Total de venta: %f\n", (double) 4.5 * cantidad);
                break;
            case 3:
                System.out.printf("Total de venta: %f\n", (double) 9.98 * cantidad);
                break;
            case 4:
                System.out.printf("Total de venta: %f\n", (double) 4.49 * cantidad);
                break;
            case 5:
                System.out.printf("Total de venta: %f\n", (double) 6.87 * cantidad);
                break;
            default:
                System.out.printf("Total de venta: %f\n", (double) 0 * cantidad);
            }
            System.out.print("Escriba el numero de producto (1, 2, 3, 4, 5) o 0 para terminar: ");
        }
    }
}

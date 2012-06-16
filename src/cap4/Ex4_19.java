package cap4;

import java.util.Scanner;

public class Ex4_19 {
/* Seudocoidigo
 * iniciar vendedor, articulo, costo, cantidad
 * 
 * obtener vendedor -1 para salir
 * while(vendedor != -1){
 *  Obtener articulos
 *  Switch para determinar el costo
 *  Obtener cantidad
 *  Calcular e imprimir salario mas comision
 *  Obtener vendedor
 * }*/
    
    public static void main( String args[] ){
        int vendedor = 0, articulo = 0, cantidad = 0;
        double costo = 0.0, sueldo = 0.0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print( "Escriba el numero de vendedor (o -1 para terminar): " );
        vendedor = entrada.nextInt();
        while( vendedor != -1 ){
            System.out.print( "Escriba el numero de articulo (1-4): " );
            articulo = entrada.nextInt();
            switch (articulo) {
            case 1:
                costo = 239.99;
                break;
            case 2:
                costo = 129.75;
                break;
            case 3:
                costo = 99.95;
                break;
            case 4:
                costo = 350.89;
                break;
            default:
                costo = 0.0;
                break;
            }
            System.out.print( "Escriba la cantidad: " );
            cantidad = entrada.nextInt();
            sueldo = 200.00 + (cantidad * costo )*.09;
            System.out.printf( "El salario que recibira es de: %.2f\n", sueldo);
            System.out.print( "Escriba el numero de vendedor (o -1 para terminar): " );
            vendedor = entrada.nextInt();
        }
    }
}
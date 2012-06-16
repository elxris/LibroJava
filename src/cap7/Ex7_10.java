package cap7;

import java.util.Random;

public class Ex7_10 {
    public static void main( String args[] ){
        Random rndm = new Random();
        //100 empleados
        int ventasEmpleado[] = new int[100];
        for(int i = 0; i < 100; i++){
            //Al azar se le asigna ventas de 0 a 11,000 a
            //cada uno de los empleados.
            ventasEmpleado[i] = rndm.nextInt(11000);
        }
        int rango[] = new int[9];
        for(int i = 0; i < 100; i++){
            int sueldo;
            //Toma el sueldo base, lo suma por el
            //porcentaje de las ventas del empleado.
            sueldo = 200 + (int)(ventasEmpleado[i] * .09);
            sueldo /= 100;
            sueldo -= 2;
            //Esto es para 1,000 de sueldo en adelante.
            //Aseguarar que los que superen los 1,099 se contabilizen.
            if( sueldo >= 9 ){
                sueldo = 8;
            }
            rango[sueldo]++;
        }
        for(int i = 0; i < 9; i++){
            //Imprime el rango y los empleados en el rango
            System.out.printf("%d-%d: %d\n", ( i + 2 ) * 100, ( (i + 2) * 100 ) - 1, rango[i]);
        }
    }
}

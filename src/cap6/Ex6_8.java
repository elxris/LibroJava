package cap6;

import java.util.Scanner;

public class Ex6_8 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner(System.in);
        double recibo = 0.0;
        System.out.print("Escriba las horas estacionadas (o -1 para terminar): ");
        for(int i = entrada.nextInt(); i != -1; i = entrada.nextInt()){
            double cargos = calcularCargos(i);
            recibo += cargos;
            System.out.printf("Cargos: $%f\n", cargos);
            System.out.print("Escriba las horas estacionadas (o -1 para terminar): ");
        }
        System.out.printf("\nLos cargos recibidos de ayer son: $%f", recibo);
    }
    
    public static double calcularCargos(int horas){
        double cargos = 2.00;
        if(horas > 3){
            horas -= 3;
            cargos += (double) horas * 0.5;
            if(cargos > 10){
                cargos = 10;
            }
        }
        
        return cargos;
    }
}

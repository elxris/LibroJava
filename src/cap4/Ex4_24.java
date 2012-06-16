package cap4;

import java.util.Scanner;

public class Ex4_24 {
    public void procesarEntradas() {
        Scanner entrada = new Scanner ( System.in );
        
        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 1;
        int resultado;
        boolean pase = true;
        
        while (contadorEstudiantes <= 10){
            System.out.print("Escriba el resultado (1: aprobado, 2: reprobado): ");
            resultado = entrada.nextInt();
            while (pase){
                if (resultado == 1){
                    aprobados++;
                    pase = false;
                }else if(resultado == 2){
                    reprobados++;
                    pase = false;
                }else{
                    System.out.print("No escribió un resultado valido. ");
                    System.out.print("Escriba el resultado (1: aprobado, 2: reprobado): ");
                    resultado = entrada.nextInt();
                }
            }
            pase = true;
            contadorEstudiantes++;
        }
        
        System.out.printf("Aprobados: %d, Reprobados: %d\n", aprobados, reprobados);
        
        if ( aprobados > 8 ){
            System.out.println("Aumentar colegiatura");
        }
    }
}
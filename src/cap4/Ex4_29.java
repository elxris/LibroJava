package cap4;

import java.util.Scanner;

public class Ex4_29 {
    public static void main ( String args[] ){
        Scanner entrada = new Scanner ( System.in );
        int largo, x, y;
        y = 1;
        x = 1;
        
        System.out.print("Escribe el largo del cuadrado: ");
        largo = entrada.nextInt();
        
        while (y <= largo){
            //La primera fila
            if (y == 1){
                x = 1;
                while (x <= largo){
                    System.out.print("*");
                    x++;
                }
            //La última
            }else if(y == largo){
                x = 1;
                while (x <= largo){
                    System.out.print("*");
                    x++;
                }
            //Relleno
            }else{
                System.out.print("*");
                x = 1;
                while (x <= (largo-2)){
                    System.out.print(" ");
                    x++;
                }
                System.out.print("*");
            }
            System.out.println();
            y++;
        }
    }
}

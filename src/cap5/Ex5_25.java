package cap5;

import java.util.Scanner;

public class Ex5_25 {
    public static void main ( String args[] ){
        Scanner entrada = new Scanner( System.in );
        int i, l;
        l = 1;
        System.out.print("Escriba un numero impar (1 a 19): ");
        for (boolean pase = true; pase; ){
            l = entrada.nextInt();
            if ((l % 2) != 1){
                l--;
                System.out.print("No es impar, se resta uno.\n");
            }
            if ( (l < 1) || (l > 19) ){
                System.out.print("Escriba un numero impar (1 a 19): ");
            }else{
                pase = false;
            }
        }
        
        for (i = 1; i <= l; i += 2){
            for (int e = 1; e <= (l - i)/2; e++){
                System.out.print(" ");
            }
            for (int e = 1; e <= i; e++){
                System.out.print("*");
            }
            for (int e = 1; e <= (l - i)/2; e++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (i -= 4; i >= 1; i -= 2){
            for (int e = 1; e <= (l - i)/2; e++){
                System.out.print(" ");
            }
            for (int e = 1; e <= i; e++){
                System.out.print("*");
            }
            for (int e = 1; e <= (l - i)/2; e++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

package cap6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_33 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        Random rndm = new Random();
        int secreto = 1 + rndm.nextInt(100);
        
        System.out.print("Adivine el numero entre 1 al 100: ");
        for(int n = entrada.nextInt(); secreto != n; n = entrada.nextInt()){
            if(n < secreto){
                System.out.print("Demaciado bajo. Intentelo de nuevo: ");
            }else{
                System.out.print("Demaciado alto. Intentelo de nuevo: ");
            }
        }
        System.out.print("Lo ha adivinado!");
    }
}

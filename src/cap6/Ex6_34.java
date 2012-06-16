package cap6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_34 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        Random rndm = new Random();
        int secreto = 1 + rndm.nextInt(100);
        int intentos = 0;
        
        System.out.print("Adivine el numero entre 1 al 100: ");
        for(int n = entrada.nextInt(); secreto != n; n = entrada.nextInt()){
            if(n < secreto){
                System.out.print("Demaciado bajo. Intentelo de nuevo: ");
            }else{
                System.out.print("Demaciado alto. Intentelo de nuevo: ");
            }
            intentos++;
        }
        if(intentos < 10){
            System.out.print("O ya sabia usted el secreto, o tuvo suerte!");
        }else if(intentos == 10){
            System.out.print("Aja! Ya sabia el secreto!");
        }else{
            System.out.print("Deberia haberlo hecho mejor!");
        }
        
    }
}

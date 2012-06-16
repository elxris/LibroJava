package cap6;

import java.util.Scanner;
import java.util.Random;

public class Ex6_29 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        int contadorcara = 0;
        int contadorcruz = 0;
        System.out.print("Primer lanzamiento? (Si:1 No:2): ");
        for(; entrada.nextInt() == 1; System.out.print("Otro lanzamiento? (Si:1 No:2): ")){
            if(lanzar()){
                contadorcruz++;
                System.out.println("Cruz");
            }else{
                contadorcara++;
                System.out.println("Cara");
            }
        }
        System.out.printf("Cara: %d, Cruz: %d", contadorcara, contadorcruz);
    }
    
    public static boolean lanzar(){
        Random rndm = new Random();
        return rndm.nextBoolean();
    }
}

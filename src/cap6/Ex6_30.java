package cap6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_30 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        int r;
        
        for(r = preguntar(); true;){
            if(r == entrada.nextInt()){
                System.out.printf("Muy bien!\n");
                r = preguntar();
            }else {
                System.out.printf("Mal, intentalo de nuevo: ");
            }
            
            
        }
    }
    
    public static int preguntar(){
        Random rndm = new Random();
        int n1, n2;
        n1 = rndm.nextInt(10);
        n2 = rndm.nextInt(10);
        System.out.printf("Cuanto es %d por %d?: ", n1, n2);
        return n1 * n2;
    }
}

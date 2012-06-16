package cap6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_31 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        Random rndm = new Random();
        int r;
        
        for(r = preguntar(); true;){
            if(r == entrada.nextInt()){
                switch(rndm.nextInt(4)){
                case 0:
                    System.out.printf("Muy bien!\n");
                    break;
                case 1:
                    System.out.printf("Excelente!\n");
                    break;
                case 2:
                    System.out.printf("Buen trabajo!\n");
                    break;
                case 3:
                    System.out.printf("Sigue asi!\n");
                    break;
                }
                r = preguntar();
            }else {
                switch(rndm.nextInt(4)){
                case 0:
                    System.out.printf("No. Por favor intenta de nuevo: ");
                    break;
                case 1:
                    System.out.printf("Incorrecto. Intenta una vez mas: ");
                    break;
                case 2:
                    System.out.printf("No te rindas!: ");
                    break;
                case 3:
                    System.out.printf("No. Sigue intentando: ");
                    break;
                }
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

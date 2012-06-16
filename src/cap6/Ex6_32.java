package cap6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_32 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        Random rndm = new Random();
        int r;
        int incorrectas = 0;
        r = preguntar();
        for(int i = 1; i <= 10;){
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
                i++;
                if(i <= 10){
                    r = preguntar();    
                }
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
                incorrectas++;
            }//fin if
            
        }//fin ciclo for
        
        if(incorrectas>3){
            System.out.print("Por favor pida ayuda adicional a su instructor" +
            		" y reinicie el programa, para que otro estudiante pueda probarlo.");
        }
        
    }//fin main
    
    public static int preguntar(){
        Random rndm = new Random();
        int n1, n2;
        n1 = rndm.nextInt(10);
        n2 = rndm.nextInt(10);
        System.out.printf("Cuanto es %d por %d?: ", n1, n2);
        return n1 * n2;
    }
}

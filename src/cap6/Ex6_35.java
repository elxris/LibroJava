package cap6;

import java.util.Scanner;
import java.util.Random;

public class Ex6_35 {
    static int n1, n2; //Dos numeros
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        Random rndm = new Random();
        System.out.print("Nivel:\n\t1)Un digito\n\t2)Dos digitos\n>>");
        int nivel = entrada.nextInt();
        System.out.print("Tipo de operacion:\n\t1)Suma\n\t2)Resta" +
        		"\n\t3)Multiplicacion\n\t4)Division\n\t5)Variado\n>>");
        int tipo = entrada.nextInt();
        int mal = 0;
        int r = preguntar(nivel, tipo, true);
        for(int i = 0; i < 10;){
            if( entrada.nextInt() == r ){
                switch(rndm.nextInt(4)){
                case 0:
                    System.out.println("Muy bien!");
                    break;
                case 1:
                    System.out.println("Excelente!");
                    break;
                case 2:
                    System.out.println("Buen trabajo!");
                    break;
                case 3:
                    System.out.println("Sigue asi!");
                    break;
                }
                i++;
                if(i < 10){
                    r = preguntar(nivel, tipo, true);
                }
            }else{
                switch(rndm.nextInt(4)){
                case 0:
                    System.out.println("No. Por favor intenta de nuevo.");
                    break;
                case 1:
                    System.out.println("Incorrecto. Intenta una vez mas.");
                    break;
                case 2:
                    System.out.println("No te rindas!");
                    break;
                case 3:
                    System.out.println("Sigue intentando.");
                    break;
                }
                preguntar(nivel, tipo, false);
                mal++;
            }
        }
        if(mal > 3){
            System.out.print("Por favor pida ayuda adicional a su instructor" +
            		"y reinicie el programa para que otro estudiante pueda usarlo.");
        }
    }
    
    public static int preguntar(int nivel, int tipo, boolean nueva){
        if(nueva){
            Random rndm = new Random();
            if(nivel == 1){
                n1 = rndm.nextInt(10);
                n2 = rndm.nextInt(10);
            }else{
                n1 = rndm.nextInt(100);
                n2 = rndm.nextInt(100);
            }
            if(tipo != 1 && tipo != 2 && tipo != 3 && tipo != 4){
                tipo = 1 + rndm.nextInt(4);
            }
        }
        switch(tipo){
        case 1:
            System.out.printf("%d mas %d?\n>>", n1, n2);
            return n1 + n2;
        case 2:
            System.out.printf("%d menos %d?\n>>", n1, n2);
            return n1 - n2;
        case 3:
            System.out.printf("%d por %d?\n>>", n1, n2);
            return n1 * n2;
        case 4:
            if(n2 == 0){
                n2++;
            }
            if(n1 % n2 != 0){
                n1 = n1 * n2;
            }
            System.out.printf("%d entre %d?\n>>", n1, n2);
            return n1 / n2;
        }
        return 0;
    }
}
package cap4;

import java.util.Scanner;

public class Ex4_35 {
    public static void main ( String args[] ){
        Scanner entrada = new Scanner (System.in);
        int a, b, c;
        //Obtengo los lados del traingulo
        System.out.print("Escriba lado A: ");
        a = entrada.nextInt(); //Sugiero 4
        System.out.print("Escriba lado B: ");
        b = entrada.nextInt(); //Sugiero 3
        System.out.print("Escriba lado C: ");
        c = entrada.nextInt(); //Sugiero 5
        //Multiplico para que se cumpla el
        //teorema de pitagoras
        //c^2=a^2+b^2
        a *= a;
        b *= b;
        c *= c;
        
        if ((a + b)==c){
            System.out.println("Este triangulo es posible.");
        }else{
            System.out.println("Este triangulo no es posible.\n");
        }
    }
}

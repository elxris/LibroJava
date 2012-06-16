package cap6;

import java.util.Scanner;

public class Ex6_17 {
    public static void main ( String args[] ){
        Scanner entrada = new Scanner(System.in);
        int a;
        for(a = 0; a != -1;){
            System.out.print("Escriba un numero: ");
            a = entrada.nextInt();
            System.out.printf("%s multiplo\n", esPar(a)?"Es":"No es");
        }
    }
    
    public static boolean esPar(int n){
        return (n % 2) == 0;
    }
}

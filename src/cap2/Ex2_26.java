package cap2;

import java.util.Scanner;

public class Ex2_26 {
    public static void main(String args[]){
        int a, b;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriba el primer numero: ");
        a = entrada.nextInt();
        System.out.print("Escriba el segundo numero: ");
        b = entrada.nextInt();
        if(a % b == 0){
            System.out.printf("%d es multiplo de %d", a, b);
        }else{
            System.out.printf("%d no es multiplo de %d", a, b);
        }
    }
}

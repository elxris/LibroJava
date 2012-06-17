package cap2;

import java.util.Scanner;

public class Ex2_25 {
    public static void main(String args[]){
        int x;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        x = entrada.nextInt();
        if((x % 2)==0){
            System.out.print("Es par");
        }else{
            System.out.print("Es impar");
        }
    }
}

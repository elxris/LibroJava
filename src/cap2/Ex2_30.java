package cap2;

import java.util.Scanner;

public class Ex2_30 {
    public static void main(String args[]){
        int x, a, b, c, d;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escribe un numero de 5 digitos: ");
        x = entrada.nextInt();
        a = x / 10000;
        x = x % 10000;
        b = x / 1000;
        x = x % 1000;
        c = x / 100;
        x = x % 100;
        d = x / 10;
        x = x % 10;
        System.out.printf("%d %d %d %d %d", a, b, c, d, x);
    }
}

package cap2;

import java.util.Scanner;

public class Ex2_16 {
    public static void main(String args[]) {
        int a, b;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el primer numero: ");
        a = entrada.nextInt();

        System.out.print("Escriba el segundo numero: ");
        b = entrada.nextInt();

        System.out.println();
        if (a > b) {
            System.out.printf("%d es mas grande que %d", a, b);
        } else if (b > a) {
            System.out.printf("%d es mas gramde que %d", b, a);
        } else {
            System.out.print("Estos numeros son iguales");
        }
    }
}

package cap2;
import java.util.Scanner;

public class Ex2_15 {
    public static void main ( String args[] ){
        Scanner entrada = new Scanner(System.in);
        int a, b;
        System.out.print("Escriba el primer n�mero: ");
        a = entrada.nextInt();
        System.out.print("Escriba el segundo n�mero: ");
        b = entrada.nextInt();
        System.out.printf("a + b = %d\n", a + b);
        System.out.printf("a * b = %d\n", a * b);
        System.out.printf("a - b = %d\n", a - b);
        System.out.printf("a / b = %d\n", a / b);
    }
}

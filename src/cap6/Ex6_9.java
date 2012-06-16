package cap6;

import java.util.Scanner;

public class Ex6_9 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner(System.in);
        double x, y;
        System.out.print("Escriba un numero a redondear: ");
        x = entrada.nextDouble();
        y = Math.floor(x + 0.5);
        System.out.printf("Original: %f\nRedondeado: %f", x, y);
    }
}

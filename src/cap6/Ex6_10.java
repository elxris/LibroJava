package cap6;

import java.util.Scanner;

public class Ex6_10 {
    public static void main( String args[]){
        Scanner entrada = new Scanner(System.in);
        double x, y;
        //Redondear a Integer
        System.out.print("Escriba el numero a redondear a entero: ");
        x = entrada.nextDouble();
        y = Math.floor(x + 0.5);
        System.out.printf("Original: %f\nRedondeado: %f\n", x, y);
        //Redondear a decimas
        System.out.print("Escriba el numero a redondear a decimas: ");
        x = entrada.nextDouble();
        y = Math.floor(x * 10 + 0.5) / 10;
        System.out.printf("Original: %f\nRedondeado: %f\n", x, y);
        //Redondear a centecimas
        System.out.print("Escriba el numero a redondear a centecimas: ");
        x = entrada.nextDouble();
        y = Math.floor(x * 100 + 0.5) / 100;
        System.out.printf("Original: %f\nRedondeado: %f\n", x, y);
        //Redondear a milesimas
        System.out.print("Escriba el numero a redondear a milesimas: ");
        x = entrada.nextDouble();
        y = Math.floor(x * 1000 + 0.5) / 1000;
        System.out.printf("Original: %f\nRedondeado: %f\n", x, y);
    }
}

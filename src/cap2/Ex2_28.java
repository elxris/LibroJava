package cap2;

import java.util.Scanner;

public class Ex2_28 {
    public static void main(String args[]){
        double radio;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriba el radio: ");
        radio = entrada.nextDouble();
        
        System.out.printf("El diametro es: %f\nLa circunferencia es: %f\nEl area es: %f", 2 * radio, 2 * Math.PI * radio, Math.PI * radio * radio);
    }
}

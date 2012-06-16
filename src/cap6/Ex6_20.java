package cap6;

import java.util.Scanner;

public class Ex6_20 {
    public static void main( String arg[] ){
        Scanner entrada = new Scanner( System.in );
        System.out.print("Escriba un radio: ");
        System.out.printf("El area del circulo es: %.3f", calculaAreaCirculo(entrada.nextDouble()));
    }
    
    public static double calculaAreaCirculo( double radio ){
        double area;
        area = radio * radio * Math.PI;
        return area;
    }
}

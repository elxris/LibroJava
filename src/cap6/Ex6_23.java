package cap6;

import java.util.Scanner;

public class Ex6_23 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        double n1, n2, n3;
        System.out.print("Escribe el primer numero: ");
        n1 = entrada.nextDouble();
        System.out.print("Escribe el segundo numero: ");
        n2 = entrada.nextDouble();
        System.out.print("Escribe el tercer numero: ");
        n3 = entrada.nextDouble();
        System.out.printf("El numero mas pequeño es: %f", minimo3(n1, n2, n3));
    }
    
    public static double minimo3( double n1, double n2, double n3 ){
        double minimo;
        minimo = n1;
        double n2n3;
        n2n3 = Math.min(n2, n3);
        if (n2n3 < n1){
            minimo = n2n3;
        }
        return minimo;
    }
}

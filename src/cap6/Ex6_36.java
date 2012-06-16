package cap6;

import java.util.Scanner;

public class Ex6_36 {
    public static void main( String args[] ){
        Scanner entrada = new Scanner( System.in );
        double x1, y1, x2, y2;
        System.out.print("x1:\n>> ");
        x1 = entrada.nextDouble();
        System.out.print("y1:\n>> ");
        y1 = entrada.nextDouble();
        System.out.print("x2:\n>> ");
        x2 = entrada.nextDouble();
        System.out.print("y2:\n>> ");
        y2 = entrada.nextDouble();
        System.out.printf("distancia: %f", distancia(x1, y1, x2, y2));
    }
    
    public static double distancia( double x1, double y1, 
            double x2, double y2 ){
        double r;
        r = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return r;
    }
}

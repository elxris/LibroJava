package cap2;
import java.util.Scanner;

public class Ex2_17 {
    public static void main (String args[]){
        int a, b, c, d;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriba el primer numero: ");
        a = entrada.nextInt();
        System.out.print("Escriba el segundo numero: ");
        b = entrada.nextInt();
        System.out.print("Escriba el tercer numero: ");
        c = entrada.nextInt();
        
        System.out.printf("La suma de los numeros es: %d\n", a + b + c);
        System.out.printf("El promedio de los numeros es: %d\n", (a * b* c)/2);
        System.out.printf("El producto de los numeros es: %d\n", a * b* c);
        
        d = a;
        if (b < d){
            d = b;
        }
        if (c < d){
            d = c;
        }
        
        System.out.printf("El menor de los numeros es: %d\n", d);
        
        d = a;
        if (b > d){
            d = b;
        }
        if (c > d){
            d = c;
        }
        
        System.out.printf("El mayor de los numeros es: %d", d);
    }
}

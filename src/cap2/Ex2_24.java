package cap2;
import java.util.Scanner;

public class Ex2_24 {
    public static void main(String args[]){
        int a, b, c, d, e, x;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriba el primer numero: ");
        a = entrada.nextInt();
        System.out.print("Escriba el segundo numero: ");
        b = entrada.nextInt();
        System.out.print("Escriba el tercer numero: ");
        c = entrada.nextInt();
        System.out.print("Escriba el cuarto numero: ");
        d = entrada.nextInt();
        System.out.print("Escriba el quinto numero: ");
        e = entrada.nextInt();
        
        x = a;
        if (b > x){
            x = b;
        }
        if (c > x){
            x = c;
        }
        if (d > x){
            x = d;
        }
        if (e > x){
            x = e;
        }
        System.out.printf("%d es el mayor\n", x);
        
        x = a;
        if (b < x){
            x = b;
        }
        if (c < x){
            x = c;
        }
        if (d < x){
            x = d;
        }
        if (e < x){
            x = e;
        }
        System.out.printf("%d es el menor\n", x);
    }
}

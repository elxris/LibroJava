package cap2;

import java.util.Scanner;

public class Ex2_32 {
    public static void main(String args[]){
        int a, b, c, d, e, neg, pos, ceros;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escribe el primer numero: ");
        a = entrada.nextInt();
        System.out.print("Escribe el segundo numero: ");
        b = entrada.nextInt();
        System.out.print("Escribe el tercer numero: ");
        c = entrada.nextInt();
        System.out.print("Escribe el cuarto numero: ");
        d = entrada.nextInt();
        System.out.print("Escribe el quinto numero: ");
        e = entrada.nextInt();
        neg = 0;
        pos = 0;
        ceros = 0;
        if(a > 0){
            pos = pos + 1;
        }else if(a < 0){
            neg = neg + 1;
        }else{
            ceros = ceros + 1;
        }
        if(b > 0){
            pos = pos + 1;
        }else if(b < 0){
            neg = neg + 1;
        }else{
            ceros = ceros + 1;
        }
        if(c > 0){
            pos = pos + 1;
        }else if(c < 0){
            neg = neg + 1;
        }else{
            ceros = ceros + 1;
        }
        if(d > 0){
            pos = pos + 1;
        }else if(d < 0){
            neg = neg + 1;
        }else{
            ceros = ceros + 1;
        }
        if(e > 0){
            pos = pos + 1;
        }else if(e < 0){
            neg = neg + 1;
        }else{
            ceros = ceros + 1;
        }
        System.out.printf("Negativos: %d\nPositivos: %d\nCeros: %d\n", neg, pos, ceros);
    }
}

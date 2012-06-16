package cap4;

import java.util.Scanner;

public class Ex4_38 {
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        System.out.print("Escribe un numero: ");
        int numero = entrada.nextInt();
        if(numero > 0){
            System.out.printf("El facotrial es: %d\n\n", factorial(numero));
        }else{
            System.out.println("No es positivo\n\n");
        }
        
        System.out.printf("El numero complejo E vale: %f\n\n", numeroE());
        
        System.out.print("Escribe un numero: ");
        numero = entrada.nextInt();
        if(numero > 0){
            System.out.printf("E^x es: %f", numeroE(numero));
        }else{
            System.out.println("No es positivo");
        }
    }
    
    public static int factorial(int numero){
        
        int contador = 1, resultado;
        resultado = numero;
        while(contador < numero){
            resultado *= (numero - contador);
            contador++;
        }
        
        return resultado;
    }
    
    public static double numeroE(){
        double e = 1;
        int contador = 1;
        while(contador <= 9){
            e += (double) 1/factorial(contador);
            contador++;
        }
        return e;
    }
    
    public static double numeroE(int x){
        double e = 1;
        int contador = 1;
        while(contador <= 9){
            e += (double) x/factorial(contador);
            contador++;
        }
        return e;
    }
}

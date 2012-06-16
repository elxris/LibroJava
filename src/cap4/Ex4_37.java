package cap4;

import java.util.Scanner;

public class Ex4_37 {
    public static void main ( String args[] ){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba el numero xxxx a cifrar: ");
        System.out.printf("Cifrado es: %d\n", cifrar(entrada.nextInt()));
        System.out.print("Escriba el numero xxxx a decifrar: ");
        System.out.printf("Decifrado es: %d\n", decifrar(entrada.nextInt()));
    }
    
    public static int cifrar(int cifrado){
        int dos, cuatro;
        
        //Sumo 7
        cifrado += 7;
        System.out.printf("%d ", cifrado);
        //abcd a dabc
        cifrado = (cifrado / 10) + (cifrado % 10) * 1000;
        System.out.printf("%d ", cifrado);
        //Comienza invertir numeros
        dos = ((cifrado % 1000) - (cifrado % 100)) / 100;
        cuatro = (cifrado % 10);
        cifrado -= (dos * 100);
        cifrado -= cuatro;
        cifrado += cuatro * 100;
        cifrado += dos;
        //Fin invertir numeros
        return cifrado;
    }
    
    public static int decifrar(int cifrado){
        int dos, cuatro;
        //Comienza invertir numeros
        dos = ((cifrado % 1000) - (cifrado % 100)) / 100;
        cuatro = (cifrado % 10);
        cifrado -= (dos * 100);
        cifrado -= cuatro;
        cifrado += cuatro * 100;
        cifrado += dos;
        System.out.printf("%d ", cifrado);
        //Fin invertir numeros
        //dabc a abcd
        cifrado = (cifrado / 1000) + (cifrado % 1000) * 10;
        System.out.printf("%d ", cifrado);
        //Resto 7
        cifrado -= 7;
        return cifrado;
    }
}

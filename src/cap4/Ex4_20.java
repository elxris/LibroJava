package cap4;

import java.util.Scanner;

public class Ex4_20 {
/*Seudocódigo
 * inicializar las variables nombre y horas trabajadas, y salario.
 * recibir los datos para 3 usuarios
 *  salario bruto = horas*salario por horas+(horas%40*salario por hora*1.5)
 * */
    public static void main ( String args[] ){
        String nombre;
        double horas;
        double salario;
        salario = 34.50; //Sueldo por hora
        Scanner entrada = new Scanner(System.in);
        
        int i = 1;
        
        while (i <= 3){
            System.out.print("Escriba el nombre del empleado: ");
            nombre = entrada.next();
            System.out.print("Escriba las horas trabajadas: ");
            horas = entrada.nextDouble();
            System.out.printf("El salario bruto de %s es: %f\n", nombre, salarioBruto( horas, salario));
            i++;
        }
    }
    
    public static double salarioBruto ( double horas, double salario ){
        if (horas <= 40){
            return horas * salario;
        }else{
            return (40 * salario + ( (horas - 40) * salario * 1.5 ));
        }
    }
}

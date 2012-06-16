package cap7;

import java.util.Scanner;

public class Ex7_19 {
    public boolean asientos[];
    public Ex7_19(int tamanioAvion){
        asientos = new boolean[tamanioAvion];
    }
    
    public boolean tramitar(){
        Scanner entrada = new Scanner( System.in );
        if(lleno()){
            System.out.print("Ya no hay boletos para este vuelo, el proximo sale en 3 horas.");
            return false;
        }
        System.out.print("Introduzca Nombre: ");
        String nombre = entrada.next();
        System.out.print("Introduzca Seccion(1-Primera Clase, 2-Economico): ");
        int tipo = entrada.nextInt();
        if ( tipo != 1 && tipo != 2 ){
            tipo = 1;
        }
        int asiento = asignarAsiento(tipo);
        if(asiento != -1){
            imprimirBoleto(asiento, nombre);
        }
        return true;
    }
    
    public int asignarAsiento(int tipo){
        Scanner entrada = new Scanner( System.in );
        if( !lleno() ){
            if(tipo == 1){
                if(lleno(1)){
                    System.out.printf("La sección de Primera" +
                            " Clase esta llena, ¿Desea un boleto" +
                            " para Economico? (Escriba 1 para aceptar): ");
                    if(entrada.nextInt() == 1){
                        tipo = 2;
                    }else{
                        return -1;
                    }
                }
            }else{
                if(lleno(2)){
                    System.out.printf("La sección Economica esta llena" +
                    		", ¿Desea un boleto para Primera Clase?" +
                    		" (Escriba 1 para aceptar): ");
                    if(entrada.nextInt() == 1){
                        tipo = 1;
                    }else{
                        return -1;
                    }
                }
            }
        }        
        return colocarAsiento(tipo);
    }
    
    public boolean lleno(){
        if(lleno(1) && lleno(2)){
            return true;
        }
        return false;
    }
    
    public boolean lleno(int tipo){
        if(tipo == 1){
            if( asientos[(asientos.length / 2) - 1] ){
                return true;
            }
        }else{
            if( asientos[asientos.length - 1] ){
                return true;
            }
        }
        return false;
    }
    
    public int colocarAsiento(int tipo){
        //Verifica y asigna asientos que no estén ocupados
        int empezar;
        if(tipo == 1){
            empezar = 0;
        }else{
            empezar = (asientos.length / 2);
        }
        for(; asientos[empezar++];){}
        asientos[--empezar] = true;
        return empezar;
    }
    
    public void imprimirBoleto(int asiento, String nombre){
        String tipoString;
        if(asiento < (asientos.length / 2)){
            tipoString = "Primera Clase";
        }else{
            tipoString = "Economico";
        }
        System.out.printf("##########AEROLINEAS DEITEL##########\n" +
        		"Nombre: %s\n" +
        		"Asiento: %d (%s)\n" +
        		"Gracias por preferirnos\n" +
        		"##########AEROLINEAS DEITEL##########\n", nombre, asiento + 1, tipoString);
    }
    
    public static void main( String args[] ){
        Ex7_19 avion = new Ex7_19(10);
        for(; avion.tramitar();){
            
        }
    }
}

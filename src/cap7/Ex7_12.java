package cap7;

import java.util.Scanner;

public class Ex7_12 {
    public static void main( String args[]){
        Scanner entrada = new Scanner( System.in );
        int valoresUnicos[] = new int[5];
        int contadorValoresUnicos = 0;//
        
        int valorIntroducido[] = new int[5];
        
        for(int i = 0; i < 5; i++){
            System.out.print("Escriba un valor: ");
            int valorTemporal;
            for(valorTemporal = entrada.nextInt(); //Pide por prmera vez el valor
                    !( (valorTemporal >= 10) && (valorTemporal <= 100) ); //Verifica que esté entre 10 y 100
                    valorTemporal = entrada.nextInt()){ //Si no, lo pide hasta que lo sea
                System.out.print("Debe ser entre 10 y 100.\nEscriba un valor: ");
            }
            
            boolean existe = false;
            for(int key : valorIntroducido){
                if(key == valorTemporal){
                    existe = true; //Busca si ya existe
                }
            }
            valorIntroducido[i] = valorTemporal;
            
            if(!existe){
                valoresUnicos[ contadorValoresUnicos ++ ] = valorIntroducido[i];
            }
        }
        
        for( int valor : valoresUnicos ){
            if(valor != 0){
                System.out.println(valor);
            }
        }
        
    }
}

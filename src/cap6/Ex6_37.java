package cap6;

import java.util.Random;
import java.util.Scanner;

public class Ex6_37 {
    public Random numerosAleatorios = new Random();
    
    private enum Estado { CONTINUA, GANO, PERDIO };
    
    private final static int DOS_UNOS = 2;
    private final static int TRES = 3;
    private final static int SIETE = 7;
    private final static int ONCE = 11;
    private final static int DOCE = 12;
    
    public Estado jugar(){
        int miPunto = 0;
        Estado estadoJuego;
        
        int sumaDeDados = tirarDados();
        
        switch ( sumaDeDados ){
        case SIETE:
        case ONCE:
            estadoJuego = Estado.GANO;
            break;
        case DOS_UNOS:
        case TRES:
        case DOCE:
            estadoJuego = Estado.PERDIO;
            break;
        default:
            estadoJuego = Estado.CONTINUA;
            miPunto = sumaDeDados;
            System.out.printf("El punto es %d\n", miPunto);
            break;
        }
        
        while( estadoJuego == Estado.CONTINUA ){
            sumaDeDados = tirarDados();
            if( sumaDeDados == miPunto ){
                estadoJuego = Estado.GANO;
            }else{
                if( sumaDeDados == SIETE ){
                    estadoJuego = Estado.PERDIO;
                }
            }
        }
        
        if( estadoJuego == Estado.GANO ){
            System.out.println("El jugador gana!");
        }else
            System.out.println("El jugador pierde!");
        return estadoJuego;
    }
    
    public int tirarDados(){
        int dado1 = 1 + numerosAleatorios.nextInt( 6 );
        int dado2 = 1 + numerosAleatorios.nextInt( 6 );
        
        int suma = dado1 + dado2;
        
        System.out.printf("El jugadir tiro %d + %d = %d\n", dado1, dado2, suma);
        return suma;
    }
    
    public static void main( String args [] ){
        Ex6_37 juego = new Ex6_37();
        int saldoBanco = 1000;
        Scanner entrada = new Scanner( System.in );
        
        for(; saldoBanco > 0;){
            System.out.printf("Tiene %d.00 en el banco.\n", saldoBanco);
            System.out.print("Escriba una apuesta: ");
            int apuesta = entrada.nextInt();
            for(; apuesta > saldoBanco;){
                System.out.print("Escriba una apuesta valida: ");
                apuesta = entrada.nextInt();
            }
            Estado juegoEstado = juego.jugar();
            if(juegoEstado == Estado.GANO){
                saldoBanco += apuesta;
            }else{
                saldoBanco -= apuesta;
            }
            System.out.printf("%s", fraseAleatoria());
        }
        System.out.print("Lo siento, se quedo sin fondos!");
    }
    
    public static String fraseAleatoria(){
        switch(new Random().nextInt(5)){
        case 0:
            return "Oh, se esta yendo a la quiebra, verdad?\n";
        case 1:
            return "Oh, vamos, arriesguese!\n";
        case 2:
            return "La hizo en grande. Ahora es tiempo de " +
            		"cambiar sus fichas por efectivo!\n";
        default:
            return "";
        }
    }
}

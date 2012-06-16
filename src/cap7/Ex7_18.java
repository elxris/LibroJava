package cap7;

import java.util.Random;

public class Ex7_18 {
    public Random numerosAleatorios = new Random();
    
    private enum Estado { CONTINUA, GANO, PERDIO };
    
    private final static int DOS_UNOS = 2;
    private final static int TRES = 3;
    private final static int SIETE = 7;
    private final static int ONCE = 11;
    private final static int DOCE = 12;
    
    public int[] jugar(){
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
            //System.out.printf("El punto es %d\n", miPunto);
            break;
        }
        int juegos = 1;
        while( estadoJuego == Estado.CONTINUA ){
            sumaDeDados = tirarDados();
            if( sumaDeDados == miPunto ){
                estadoJuego = Estado.GANO;
            }else{
                if( sumaDeDados == SIETE ){
                    estadoJuego = Estado.PERDIO;
                }
            }
            juegos++;
        }
        
        int ganado = 0;
        if( estadoJuego == Estado.GANO ){
            //System.out.println("El jugador gana!");
            ganado++;
        }else{
            //System.out.println("El jugador pierde!");
        }
        int retorno[] = {ganado, juegos};
        return retorno;
    }
    
    public int tirarDados(){
        int dado1 = 1 + numerosAleatorios.nextInt( 6 );
        int dado2 = 1 + numerosAleatorios.nextInt( 6 );
        
        int suma = dado1 + dado2;
        
        //System.out.printf("El jugador tiro %d + %d = %d\n", dado1, dado2, suma);
        return suma;
    }
    
    public static void main( String args [] ){
        Ex7_18 juego = new Ex7_18();
        int ganados[] = new int[21];
        int perdidos[] = new int[21];
        int duracion = 0;
        int juegos = 1000;
        for(int i = 0; i < juegos; i++){
            int partida[] = juego.jugar();
            //Verificar que no pasen de 21
            partida[1]--;
            if(partida[1] > 19){
                partida[1] = 20;
            }
            
            if(partida[0] == 1){ 
                ganados[partida[1]]++;
            }else{
                perdidos[partida[1]]++;
            }
            duracion += partida[1];
        }
        
        int ganadosMenosPerdidos = 0;
        System.out.println("Ganados (dividido en jugadas)");
        for(int i = 0; i < ganados.length; i++){
            System.out.printf("%d: %d\t", i + 1, ganados[i]);
            ganadosMenosPerdidos = ganados[i]-perdidos[i];
        }
        System.out.println();
        System.out.println("Perdidos (divido en jugadas)");
        for(int i = 0; i < perdidos.length; i++){
            System.out.printf("%d: %d\t", i + 1, perdidos[i]);
        }
        System.out.println();
        if(ganadosMenosPerdidos > 0){
            System.out.printf("Se han ganado %d partidas mas que las que se han perdio.\n", ganadosMenosPerdidos);
        }else if(ganadosMenosPerdidos < 0){
            System.out.printf("Se han perdido %d partidas mas que las que se han ganado.\n", ganadosMenosPerdidos);
        }else{
            System.out.println("El juego ha sido justo, se han ganado las mismas veces que se pierde.");
        }
        
        System.out.printf("Duracion promedio: %.2f jugadas.\n", (double) duracion / juegos);
        
        if(ganados[2]>ganados[0]){
            System.out.printf("El juego mejora con la duración del juego.");
        }
        
    }
}

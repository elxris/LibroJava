package cap7;

import java.util.Scanner;

public class Ex7_21 {
    enum Estado {ARRIBA, ABAJO};
    Estado estado = Estado.ARRIBA;
    enum Orientacion {N, S, E, O};
    Orientacion orient = Orientacion.N;
    public void iniciar(){
        int x, y, tx, ty;
        x = 20;
        y = 20;
        tx = 0;
        ty = 0;
        int piso[][] = new int[x][y];
        Scanner entrada = new Scanner( System.in );
        int comando;
        System.out.print(">> ");
        for(comando = entrada.nextInt(); comando != 9; comando = entrada.nextInt()){
            switch(comando){
            case 1:
                plumaArriba();
                break;
            case 2:
                plumaAbajo();
                break;
            case 3:
                voltearDerecha(false);
                break;
            case 4:
                voltearIzquerda();
                break;
            case 5:
                System.out.print("Cuantos avanzas?\n>> ");
                int ret[] = avanzar(tx, ty, entrada.nextInt(), piso);
                tx = ret[0];
                ty = ret[1];
                break;
            case 6:
                imprimir(piso);
                break;
            default:
                break;
            }
            System.out.print(">> ");
        }
    }
    
    public void plumaArriba(){
        estado = Estado.ARRIBA;
        System.out.println("Pluma arriba.");
    }
    
    public void plumaAbajo(){
        estado = Estado.ABAJO;
        System.out.println("Pluma abajo.");
    }
    
    public void voltearDerecha(boolean silencio){
        switch (orient){
        case N:
            orient = Orientacion.E;
            break;
        case E:
            orient = Orientacion.S;
            break;
        case S:
            orient = Orientacion.O;
            break;
        case O:
            orient = Orientacion.N;
        }
        if(!silencio){
            System.out.println("Volteando a la derecha.");
        }
    }
    
    public void voltearIzquerda(){
        voltearDerecha(true);
        voltearDerecha(true);
        voltearDerecha(true);
        System.out.println("Volteando a la izquierda.");
    }
    
    public int[] avanzar(int x, int y, int n, int piso[][]){
        System.out.printf("Avanzando %d.\n", n);
        for(; n > 0; n--){
            grabar(piso, x, y);
            switch (orient){
            case N:
                x++;
                break;
            case E:
                y++;
                break;
            case S:
                x--;
                break;
            case O:
                y--;
                break;
            }
            if(x > (piso.length - 1)){
                x = piso.length - 1;
            }
            if( y > (piso[0].length - 1)){
                y = piso[0].length - 1;
            }
        }
        int retorno[] = {x, y};
        return retorno;
    }
    
    public void grabar(int arr[][], int x, int y){
        if(estado == Estado.ABAJO){
            arr[x][y] = 1;
        }
    }
    
    public void imprimir(int piso[][]){
        System.out.println("Imprimiendo...");
        for(int x = 0; x < piso.length; x++){
            for(int y = 0; y < piso[x].length; y++){
                if(piso[piso.length - (x + 1)][y] == 1){
                    System.out.printf("%2s", "#");
                }else{
                    System.out.printf("%2s", ".");
                }
            }
            System.out.println();
        }
    }
    
    public static void main( String args[] ){
        Ex7_21 tortuga = new Ex7_21();
        tortuga.iniciar();
    }
    
}
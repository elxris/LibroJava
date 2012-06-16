package cap7;

import java.util.Scanner;
import java.util.Random;

public class Ex7_22 {
    
    public int tablero[][], mTablero[][], mapa[][][];
    public int movimientoX[] = {0, 2, 1, -1, -2, -2, -1, 1, 2};
    public int movimientoY[] = {0, 1, 2, 2, 1, -1, -2, -2, -1};;
    public int x, y, tx, ty;
    public int contador, mContador;
    public int h, w;
    
    public static void main( String args[] ){
        Ex7_22 juego = new Ex7_22();
        juego.resolver();
        juego.imprimir();
    }
    
    public Ex7_22(){
        int tamanio[] = obtenerTamanioTablero();
        h = tamanio[0];
        w = tamanio[1];
        tablero = new int[w][h];
        int c[] = obtenerXY();
        x = c[0];
        y = c[1];
        mapaHeuristico(w, h);
    }
    
    public int[] obtenerTamanioTablero(){
        int tamanio[] = new int[2];
        Scanner entrada = new Scanner(System.in);
        for(;!(tamanio[0] >= 3);){
            System.out.print("Escriba el alto del tablero:\n>> ");
            tamanio[0] = entrada.nextInt();
        }
        for(;!(tamanio[1] >= 3);){
            System.out.print("Escriba el ancho del tablero:\n>> ");
            tamanio[1] = entrada.nextInt();
        }
        return tamanio;
    }
    
    public int[] obtenerXY(){
        int c[] = {-1, -1};
        Scanner entrada = new Scanner(System.in);
        for(;!((c[0] < h)&&(c[0] >= 0));){
            System.out.print("Escriba la posición inicial del caballo a lo alto:\n>> ");
            c[0] = entrada.nextInt();
        }
        for(;!((c[1] < w)&&(c[1] >= 0));){
            System.out.print("Escriba la posición inicial del caballo a lo ancho:\n>> ");
            c[1] = entrada.nextInt();            
        }
        return c;
    }
    
    //Comprueba que las coordenadas entén dentro del limite.
    public boolean determinarLimite(int x, int y){
        if((x < w) && (x >= 0)){
            if((y < h) && (y >= 0)){
                return true;
            }
        }
        return false;
    }
    
    //Busca el id de un movimiento en el tablero. Y da sus coordenadas.
    public int[] obtenerMovimiento(int m){
        int coordenadas[] = new int[2];
        for(int i = 0; i < tablero.length; i++){
            for(int e = 0; e < tablero[i].length; e++){
                if( tablero[i][e] == m ){
                    coordenadas[0] = i;
                    coordenadas[1] = e;
                    return coordenadas;
                }
            }
        }
        //else
        coordenadas[0] = -1;
        coordenadas[1] = -1;
        return coordenadas;
    }
    
    //Busca cual movimiento da las coordenadas.
    public int determinarMovimiento(int x1, int y1, int x2, int y2){
        int n;
        for(n = 0; n <= 8; n++){
            if((x1 + movimientoX[n]) == x2){
                if((y1 + movimientoY[n]) == y2){
                    return n;
                }
            }
        }
        return 0;
    }
    
    //Busca el movimiento posible en m y después de m.
    public int movimientoPosible(int iX, int iY, int m){
        int i;
        for(i = m; i <= 8; i++){
            if( determinarLimite( iX + movimientoX[i], iY + movimientoY[i] ) ){
                if( tablero[iX + movimientoX[i]][iY + movimientoY[i]] == 0 ){
                    return i;
                }
            }
        }
        return 0;
    }
    
    public int[][] copiarTablero(int t[][]){
        int copiado[][] = new int[t.length][t[0].length];
        for(int i = 0; i < t.length; i++){
            for(int e = 0; e < t[i].length; e++){
                copiado[i][e] = t[i][e];
            }
        }
        return copiado;
    }
    
    //Hace el mapa heurístico
    public void mapaHeuristico(int W, int H){
        int mapa[][] = new int[W][H];
        for(int i = 2; i <= (Math.min(W, H)/2)+2; i++){
            for(int e = 0; e < Math.max(W, H); e++){
                //Horizontal
                //Para Y0, 1, para Y1, 2 como comienzo de linea.
                if((i-1+e) <= (W-i+1)){
                    mapa[i-1+e][i-2] = i; //Horizontal arriba
                    mapa[i-1+e][H-i+1] = i; //Horizontal abajo
                }
                //Vertical
                if((i-1+e) <= (H-i+1)){
                    mapa[i-2][i-1+e] = i; //Vertizal Izquierdo
                    mapa[W-i+1][i-1+e] = i; //Vertical Derecho
                }
                //Para Y0, W-2, para Y1, W-3 como final de linea.
                //Para Y0, Y = H-1, para Y2, Y = H-2 como final de linea.
            }
            //Esquinas
            mapa[i-2][i-2] = i-1;
            mapa[W-i+1][i-2] = i-1;
            mapa[i-2][H-i+1] = i-1;
            mapa[W-i+1][H-i+1] = i-1;
        }
        
        int mapa2[][][] = new int[W][H][9];
        preHeuristica(mapa, W, H, mapa2);
        int n = movimientoHeuristico(x, y, 0);
        mapa[x + movimientoX[n]][y + movimientoY[n]] = (Math.min(W, H) / 2) + 4;
        preHeuristica(mapa, W, H, mapa2);
        
        //Imprime el mapa heurístico
        for(int i = 0; i < mapa.length; i++){
            for(int e = 0; e < mapa[i].length; e++){
                System.out.printf("%3d", mapa[i][e]);
            }
            System.out.println();
        }
    }
    
    public void preHeuristica(int mapa[][], int W, int H, int mapa2[][][]){
        for(int i = 0; i < W; i++){
            for(int e = 0; e < H; e++){
                for(int o = 1; o <= 8; o++){
                    if(determinarLimite(i+movimientoX[o], e+movimientoY[o])){
                        mapa2[i][e][o] = mapa[i+movimientoX[o]][e+movimientoY[o]];
                    }
                }
            }
        }
        this.mapa = (int[][][])mapa2.clone();
    }
    
    public int movimientoHeuristico(int x, int y, int m){
        //Saca el más cercano a m
        int minimo = 0;
        int v = 0;
        int mov = 0;
        for(int i = 0; i <= 8; i++){
            v = mapa[x][y][i];
            if(v != 0){
                if(i != m){
                    if(tablero[x+movimientoX[i]][y+movimientoY[i]] == 0){
                        if((minimo == 0)){
                            minimo = v;
                            mov = i;
                        }else if(v <= minimo){
                            if(v == minimo){
                                if(new Random().nextBoolean()){
                                    mov = i;
                                    minimo = v;
                                }
                            }else{
                                mov = i;
                                minimo = v;              
                            }
                        }
                    }
                }
            }
        }
        return mov;
    }
    
    public void resolver(){
        int n = 0;
        contador = 1;
        tablero[x][y] = contador;
        for(int iteracion = 0; iteracion < w*h; iteracion++){
            /*int px, py;
            px = x;
            py = y;
            contador = 1;
            for(int xi = 0; xi < w; xi++){
                for(int yi = 0; yi < h; yi++){
                    
                }
            }*/
            
            //System.out.print("Primera fase\n");
            n = movimientoHeuristico(x, y, 0);
            for(; n > 0; n = movimientoHeuristico(x, y, 0)){
                tx = x;
                ty = y;
                x += movimientoX[n];
                y += movimientoY[n];
                contador++;
                tablero[x][y] = contador;
                //System.out.printf("Movimiento %d, %d, %d\n", x, y, n);
            }
            
            
            if(contador > mContador){
                mTablero = copiarTablero(tablero);
                mContador = contador;
            }
            //System.out.print("Segunda fase\n");
            /*for(; (n == 0)&&(mContador != w*h);){
                tablero[x][y] = 0;
                n = determinarMovimiento(tx, ty, x, y);
                n++;
                x = tx;
                y = ty;
                contador--;
                int tp[] = obtenerMovimiento(contador - 1);
                tx = tp[0];
                ty = tp[1];
                //System.out.printf("Movimiento %d, %d, %d\n", x, y, n);
            }*/
        }
        System.out.println(contador);
    }
    
    public void imprimir(){
        for(int i = h - 1; i >= 0; i--){
            for(int e = 0; e < w; e++){
                System.out.printf("%3d", tablero[e][i]);
            }
            System.out.println();
        }
    }
}

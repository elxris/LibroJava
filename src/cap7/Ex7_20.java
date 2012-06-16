package cap7;

import java.util.Random;

public class Ex7_20 {
    public static void main( String args[] ){
        int maxVendedores = 4;
        int maxProductos = 5; 
        int maxNotas = 6;
        int dias = 30;
        int notas[][][][] = new int[dias][maxVendedores][maxProductos][maxNotas];
        //notas[dia][vendedor][producto][nota] = vendido;
        llenarNotas(notas, dias, maxVendedores, maxProductos, maxNotas);
        int ventas[][] = new int[maxVendedores][maxProductos];
        resumirVentas(notas, ventas);
        //ventas[vendedor][producto] = totalVendido
        imprimirVentas(ventas);
    }
    
    public static void llenarNotas(int notas[][][][], int dia,int a, int b, int c){
        Random rndm = new Random();
        for(int i = 0; i < dia; i++){
            for(int ia = 0; ia < a; ia++){
                for(int ic = rndm.nextInt(c); ic < c; ic++){
                    int ib = rndm.nextInt(b);
                    notas[i][ia][ib][ic] = rndm.nextInt(100);
                }
            }
        }
    }
    
    public static void resumirVentas(int notas[][][][], int ventas[][]){
        for(int dia = 0; dia < notas.length; dia++){
            for(int a = 0; a < notas[dia].length; a++){
                for(int b = 0; b < notas[dia][a].length; b++){
                    for(int c = 0; c < notas[dia][a][b].length; c++){
                        ventas[a][b] += notas[dia][a][b][c];
                    }
                }
            }
        }
    }
    
    public static void imprimirVentas(int ventas[][]){
        System.out.printf("%10s%10s%10s\n", "Vendedor", "Producto", "Total");
        int totales = 0;
        for(int a = 0; a < ventas.length; a++){
            for(int b = 0; (b < ventas[a].length) && (ventas[a][b] != 0); b++){
                System.out.printf("%10d%10d%10d\n", a + 1, b + 1, ventas[a][b]);
                totales += ventas[a][b];
            }
        }
        System.out.printf("%10s%10s%10d\n", "", "Total:", totales);
    }
}

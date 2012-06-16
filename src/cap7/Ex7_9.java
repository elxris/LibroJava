package cap7;

import java.util.Scanner;

public class Ex7_9 {
    public static void main( String args[] ){
        //a)
        int t[][];
        t = new int[2][3];
        //b) 2
        //c) 3
        //d) 6
        //e) t[1][0]; t[1][1]; t[1][2];
        //f) t[0][2]; t[1][2];
        //g)
        t[0][1] = 0;
        //h)
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;
        //i)
        for(int i = 0; i < 2; i++){
            for(int e = 0; e < 3; e++){
                t[i][e] = 0;
            }
        }
        //j)
        Scanner entrada = new Scanner( System.in );
        for(int i = 0; i < 2; i++){
            for(int e = 0; e < 3; e++){
                System.out.printf("Elemento %d, %d: ", i, e);
                t[i][e] = entrada.nextInt();
            }
        }
        //k)
        int minimo = t[0][0];
        for(int i = 0; i < 2; i++){
            for(int e = 1; e < 3; e++){
                if(t[i][e] < minimo){
                    minimo = t[i][e];
                }
            }
        }
        System.out.printf("Minimo %d\n", minimo);
        //l)
        System.out.printf("%d, %d, %d\n", t[0][0], t[0][1], t[0][2]);
        //m)
        System.out.printf("%d\n", t[0][2] + t[1][2]);
        //n)
        System.out.printf("\n%4s %4d %4d %4d\n", "", 1, 2, 3);
        for(int e = 0; e < 2; e++){
            System.out.printf("%4d %4d %4d %4d\n", e, t[e][0], t[e][1], t[e][2]);
        }
    }
    
}

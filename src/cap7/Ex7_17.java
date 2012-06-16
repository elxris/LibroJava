package cap7;

import java.util.Random;

public class Ex7_17 {
    public static void main(String args[]) {
        Random rndm = new Random();
        int registro[] = new int[11];
        for (int i = 0; i < 36000; i++) {
            registro[((rndm.nextInt(6) + 1) + (rndm.nextInt(6) + 1) -2 )]++;
        }
        for(int i = 0; i < registro.length; i++){
            System.out.printf("%d: %d\n", i + 2, registro[i]);
        }
        System.out.printf("7 > %.2f porciento", (36000 / (double)registro[5]) * 100);
    }
}

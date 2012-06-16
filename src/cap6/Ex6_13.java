package cap6;

import java.util.Random;

public class Ex6_13 {
    public static void main(String args[]){
        Random rndm = new Random();
        System.out.printf("2, 4, 6, 8, 10: %d\n", (rndm.nextInt(5-1+1)+1)*2);
        System.out.printf("3, 5, 7, 9, 11: %d\n", (rndm.nextInt(5-1+1)+1)*2+1);
        System.out.printf("6, 10, 14, 18, 22: %d\n", (rndm.nextInt(5-0+1)+0)*4+6);
    }
}

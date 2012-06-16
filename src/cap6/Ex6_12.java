package cap6;

import java.util.Random;

public class Ex6_12 {
    public static void main(String args[]){
        Random rndm = new Random();
        //rndm.nextInt(ultimoNumero-primerNumero+1)+primerNumero;
        System.out.printf("1 < n < 2, n: %d\n", rndm.nextInt(2-1+1)+1);
        System.out.printf("1 < n < 100, n: %d\n", rndm.nextInt(100-1+1)+1);
        System.out.printf("0 < n < 9, n: %d\n", rndm.nextInt(9-0+1)+0);
        System.out.printf("1000 < n < 1112, n: %d\n", rndm.nextInt(1112-1000+1)+1000);
        System.out.printf("-1 < n < 1, n: %d\n", rndm.nextInt(1+1+1)-1);
        System.out.printf("-3 < n < 11, n: %d\n", rndm.nextInt(11+3+1)-3);
    }
}

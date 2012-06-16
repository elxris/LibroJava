package cap4;

public class Ex4_22 {
    public static void main( String args[] ){
        int i, e;
        i = 1;
        System.out.printf("%8s %8s %8s %8s", "N", "10*N", "100*N", "1000*N\n");
        while (i <= 50){
            e = 0;
            while (e < 4){
                System.out.printf("%8d", (int) (i * Math.pow((double) 10, (double) e)));
                e++;
            }
            System.out.println();
            i++;
        }
    }
}
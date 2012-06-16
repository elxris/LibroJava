package cap5;

public class Ex5_20 {
    public static void main ( String args[] ){
        double pi = 4;
        for (int i = 3; i < 9999; i += 2){
            pi -= (double)4/i;
            i += 2;
            pi += (double)4/i;
        }
        System.out.printf("Pi es: %f", pi);
    }
}

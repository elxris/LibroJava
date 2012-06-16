package cap6;

public class Ex6_14 {
    public static void main( String args[] ){
        System.out.printf("2 a la 6: %d\n", enteroPotencia(2, 6));
        System.out.printf("6 a la 1: %d\n", enteroPotencia(6, 1));
        System.out.printf("16 a la 3: %d\n", enteroPotencia(16, 3));
    }
    
    public static int enteroPotencia(int base, int exponente){
        int r;
        for (r = base; exponente > 1; exponente--){
            r *= base;
        }
        return r;
    }
}

package cap6;

public class Ex6_25 {
    public static void main( String args[] ){
        int cuenta = 0;
        for(int p = 2; p <= 10000; p++){
            if( esPrimo(p) ){
                System.out.printf("%d es primo\n", p);
                cuenta++;
            }
        }
        System.out.printf("%d son primos\n", cuenta);
    }
    
    public static boolean esPrimo( int n ){
        int limit = (int)Math.sqrt(n);
        int cuenta = 0;
        for(int p = 1; p <= limit; p++){
            if( n % p == 0){
                cuenta++;
            }
        }
        if(cuenta != 1){
            return false;
        }else{
            return true;
        }
    }
}

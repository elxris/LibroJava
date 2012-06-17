package cap7;

public class Ex7_29 {
    public static void main( String args[] ){
        System.out.printf("El octavo numero Fibonacci es %d\n", fibonacci(8));
        //Máximo numero posible.
        System.out.printf("%d\n", fibonacci(100));
        System.out.print(fibonacciDouble(10000));
    }
    
    public static int fibonacci( int n ){
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;
        int c = 0;
        for(n--; n > 1; n--){
            c++;
            if(n3 < 0){
                System.out.printf("En %d es lo máximo que se puede calcular con int. ", c-1);
                break;
            }
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
    
    public static double fibonacciDouble( int n ){
        double n1 = 0;
        double n2 = 1;
        double n3 = 1;
        int c = 0;
        for(n--; n > 1; n--){
            if((n1 + n2) > Double.MAX_VALUE){
                System.out.printf("En %d es lo máximo que se puede calcular con Double. ", c-1);
                break;
            }
            c++;
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}

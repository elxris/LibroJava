package cap7;

public class Ex7_14 {
    public static void main( String args[] ){
        int numeros1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(producto(numeros1));
        int numeros2[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(producto(numeros2));
        int numeros3[] = {1, 2, 3, 4};
        System.out.println(producto(numeros3));
        int numeros4[] = {1, 2};
        System.out.println(producto(numeros4));
    }
    
    public static int producto( int numeros[] ){
        int producto = 1;
        for( int valor : numeros ){
            producto *= valor;
        }
        return producto;
    }
}

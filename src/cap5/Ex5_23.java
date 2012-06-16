package cap5;

public class Ex5_23 {
    public static void main ( String args[] ){
        //a)
        int x, y;
        x = 6;
        y = 6;
        if( !( x < 5 ) && !( y >= 7 ) ){
            System.out.println("a) Original");
        }
        if( !( ( x < 5 ) || ( y >= 7 ) ) ){
            System.out.println("a) Logica equivalente");
        }
        
        //b)
        int a, b, g;
        a = 5;
        b = 5;
        g = 5;
        if( !( a == b ) || !( g != 5 ) ){
            System.out.println("b) Original");
        }
        if( !( ( a == b ) && ( g != 5 ) ) ){
            System.out.println("b) Logica equivalente");
        }
        
        //c)
        x = 9;
        y = 4;
        if( !( ( x <= 8 ) && ( y > 4 ) ) ){
            System.out.println("c) Original");
        }
        if( !( x <= 8 ) || !( y > 4 ) ){
            System.out.println("c) Logica equivalente");
        }
        
        //d)
        int j, i;
        j = 6;
        i = 4;
        if( !( ( i > 4 ) && ( j <= 6 ) ) ){
            System.out.println("d) Original");
        }
        if( !( i > 4 ) || !( j <= 6 ) ){
            System.out.println("d) Logica equivalente");
        }
    }
}

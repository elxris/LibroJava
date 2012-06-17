package cap2;

public class Ex2_13 {
    public static void main (String args[]){
        int x = 7 + 3 * 6 / 2 - 1;
        System.out.println("x = 7 + 3 * 6 / 2 - 1;");
        System.out.println("3*6, /2, +7, -1");
        System.out.printf("x = %d\n\n", x);
        
        x = 2 % 2 + 2 * 2 - 2 / 2;
        System.out.println("x = 2 % 2 + 2 * 2 - 2 / 2;");
        System.out.println("2%2, +2*2, -2/2");
        System.out.printf("x = %d\n\n", x);
        
        x = ( 3 * 9 * ( 3 + ( 9 * 3 / ( 3 )) ) );
        System.out.println("x = ( 3 * 9 * ( 3 + ( 9 * 3 / ( 3 )) ) );");
        System.out.println("3/3, *9, +3, *3, *9");
        System.out.printf("x = %d", x);
    }
}

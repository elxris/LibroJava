package cap4;

public class Ex4_27 {
    public static void main( String args[] ){
        pruebaA(5, 8);
        System.out.println();
        pruebaB(5, 8);
        System.out.println();
        pruebaC(5, 8);
        System.out.println();
        pruebaD(5, 7);
    }
    
    public static void pruebaA(int x , int y){
        if ( y == 8 )
        if ( x == 5 )
        System.out.println("@@@@@");
        else
        System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");
    }
    
    public static void pruebaB(int x , int y){
        if ( y == 8 )
        if ( x == 5 ){
        System.out.println("@@@@@");
        }else{
        System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");}
    }
    
    public static void pruebaC(int x , int y){
        if ( y == 8 ){
        if ( x == 5 ){
        System.out.println("@@@@@");
        }else{
        System.out.println("#####");
        System.out.println("$$$$$");}
        System.out.println("&&&&&");}
    }
    
    public static void pruebaD(int x , int y){
        if ( y == 8 ){
        if ( x == 5 ){
        System.out.println("@@@@@");}
        }else{
        System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");}
    }
}

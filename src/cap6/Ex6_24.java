package cap6;

public class Ex6_24 {
    public static void main( String args[] ){
        for(int p = 1; p <= 10000000; p++){
            if( perfecto(p) ){
                System.out.printf("El numero %d es perfecto.\n", p);
            }
        }
    }
    
    public static boolean perfecto( int n ){
        int temporal = 0;
        for(int f = 1; temporal < n; f++){
            temporal += f;
        }
        
        if ( temporal == n  && temporal != 1 ){
            return true;
        }else{
            return false;
        }
        
    }
}

package cap5;

public class Ex5_21 {
    public static void main( String args[] ){
        int a,h;
        for(int i = 1; i < 500; i++){
            for(int e = 1; e < 500; e++){
                h = i*i+e*e;
                a = (int)Math.sqrt(h);
                if ((a*a) == i*i+e*e){
                    System.out.printf("Triplete l1:%d, l2:%d y l3:%d\n", i, e, a);
                }
            }
        }
    }
}

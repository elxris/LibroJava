package cap6;

public class Ex6_15 {
    public static void main( String args[] ){
        System.out.printf("L1: 3.0 L2: 4.0 H: %.1f\n", hipotenusa(3, 4));
        System.out.printf("L1: 5.0 L2: 12.0 H: %.1f\n", hipotenusa(5, 12));
        System.out.printf("L1: 8.0 L2: 15.0 H: %.1f\n", hipotenusa(8, 15));
    }
    
    public static double hipotenusa(double l1, double l2){
        double hip;
        hip = Math.sqrt(l1*l1+l2*l2);
        return hip;
    }
}

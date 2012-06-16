package cap5;

public class Ex5_24 {
    public static void main ( String args[] ){
        for (int i = 1; i <= 9; i += 2){
            for (int e = 1; e <= (9 - i)/2; e++){
                System.out.print(" ");
            }
            for (int e = 1; e <= i; e++){
                System.out.print("*");
            }
            for (int e = 1; e <= (9 - i)/2; e++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 7; i >= 1; i -= 2){
            for (int e = 1; e <= (9 - i)/2; e++){
                System.out.print(" ");
            }
            for (int e = 1; e <= i; e++){
                System.out.print("*");
            }
            for (int e = 1; e <= (9 - i)/2; e++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

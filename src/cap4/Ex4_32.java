package cap4;

public class Ex4_32 {
    public static void main (String args[]){
        int x, y, z;
        x = 0;
        y = 0;
        z = 0;
        while(x < 10){
            while (y < 10){
                if (z == 0){
                    System.out.print("*");
                    z++;
                }else{
                    System.out.print(" ");
                    z = 0;
                }
                y++;
            }
            y = 0;
            z--;
            System.out.println();
            x++;
        }
    }
}

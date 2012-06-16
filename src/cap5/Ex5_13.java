package cap5;

public class Ex5_13 {
    public static void main (String args[]){
        int factorial = 1;
        System.out.printf("%2s%5s\n", "n", "n!");
        for(int n = 1; n <=5; n++){
            factorial *= n;
            System.out.printf("%2d%5d\n", n, factorial);
        }
        //La capacidad de la variable factorial impediría un
        //calculo más grande.
    }
}

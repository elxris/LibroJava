package cap7;

public class Ex7_11 {
    public static void main( String args[] ){
        //a)
        int cuentas[] = new int[10];
        for(int i = 0; i < 10; i++){
            cuentas[i] = 0;
        }
        //b)
        int bono[] = new int[15];
        for(int i = 0; i < 15; i++){
            bono[i]++;
        }
        //c)
        int mejoresPuntuaciones[] = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.printf("%5d%5d\n", i + 1, mejoresPuntuaciones[i]);
        }
    }
}

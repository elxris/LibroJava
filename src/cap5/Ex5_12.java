package cap5;

public class Ex5_12 {
    public static void main(String args[]){
        int r = 1;
        for(int i = 1; i <= 15; i++){
            if((i % 2)==1){
                r *= i;
            }
        }
        
        System.out.printf("El producto de los numeros impares del 1 al 15 es: %d", r);
    }
}

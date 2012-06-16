package cap7;

public class Ex7_16 {
    public static void main( String args[] ){
        double suma = 0;
        for(String valor : args ){
            suma += Double.parseDouble(valor);
        }
        System.out.print(suma);
    }
}

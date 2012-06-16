package cap5;

public class Ex5_18 {
    public static void main ( String args[] ){
        int monto = 0;
        int principal = 100000;
        int tasa = 5;
        
        System.out.printf("%5s%15s\n", "anio", "deposito");
        
        for ( int anio = 1; anio <= 10; anio++){
            monto = (int)(principal * Math.pow(1.0 + (double)tasa/100, anio));
            System.out.printf("%5d%13d.%d\n", anio, monto/100, monto%100);
        }
    }
}

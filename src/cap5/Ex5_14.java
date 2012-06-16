package cap5;

public class Ex5_14 {
    public static void main( String args[]){
        double monto;
        double principal = 1000.0;
        double tasa;
        
        System.out.printf("%5s%10s%10s\n", "anio", "tasa", "monto");
        
        for(tasa = .05; tasa <= 0.1; tasa += .01){
            for(int anio = 1; anio <= 10; anio++){
                monto = principal * Math.pow(1.0 + tasa, (double) anio);
                System.out.printf("%5d%10.2f%10.2f\n", anio, tasa, monto);
            }
        }
    }
}

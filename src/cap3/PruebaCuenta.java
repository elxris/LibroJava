package cap3;

public class PruebaCuenta {
    public static void main( String args[] ){
        Cuenta cuenta = new Cuenta(0.0);
        System.out.printf("El saldo inicial de la cuenta es: %f\n", cuenta.obtenerSaldo());
        cuenta.abonar(200.00);
        System.out.printf("El saldo despues de abonar 200.00 a la cuenta es: %f\n", cuenta.obtenerSaldo());
        cuenta.cargar(123.50);
        System.out.printf("El saldo despues de cargar 123.50 a la cuenta es: %f\n", cuenta.obtenerSaldo());
        System.out.println("Intentando cargar 500.00 a la cuenta");
        cuenta.cargar(500.00);
        System.out.printf("El saldo despues de intentar cargar 500.00 a la cuenta: %f", cuenta.obtenerSaldo());
    }
}

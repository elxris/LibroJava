package cap3; //Ejercicio 3.12

public class Cuenta {
    private double saldo;
    
    public Cuenta( double saldoInicial ){
        if( saldoInicial > 0.0){
            saldo = saldoInicial;
        }
    }
    
    public void abonar( double monto ){
        saldo = saldo + monto;
    }
    
    public void cargar( double monto ){
        if(monto < saldo){
            saldo = saldo - monto;
        }else{
            System.out.println("El monto a retirar excede el saldo de la cuenta");
        }
    }
    
    public double obtenerSaldo(){
        return saldo;
    }
}

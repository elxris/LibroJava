package cap3; //Ejercicio 3.14

public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;
    
    public Empleado( String nombre, String apellido, double salario ){
        establecerPrimerNombre(nombre);
        establecerApellidoPaterno(apellido);
        establecerSalarioMensual(salario);
    }
    
    public void establecerPrimerNombre( String nombre ){
        primerNombre = nombre;
    }
    
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    
    public void establecerApellidoPaterno( String apellido ){
        apellidoPaterno = apellido;
    }
    
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }
    
    public void establecerSalarioMensual( double salario ){
        if(salario > 0.0){
            salarioMensual = salario;
        }else{
            salarioMensual = 0.0;
        }
    }
    
    public double obtenerSalarioMensual(){
        return salarioMensual;
    }
}

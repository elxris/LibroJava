package cap3; //Ejercicio 3.13

public class Factura {
    private String noPieza;
    private String descripcion;
    private int cantidad;
    private double precio;
    
    public Factura(String serie, String detalle, int numero, double costo){
        noPieza = serie;
        descripcion = detalle;
        establecerCantidad(numero);
        establecerPrecio(costo);
    }
    
    public void establecerNoPieza( String serie ){
        noPieza = serie;
    }
    
    public String obtenerNoPieza(){
        return noPieza;
    }
    
    public void establecerDescripcion( String detalle ){
        descripcion = detalle;
    }
    
    public String obtenerDescripcion(){
        return descripcion;
    }
    
    public void establecerCantidad( int numero ){
        if(numero > 0){
            cantidad = numero;
        }
    }
    
    public int obtenerCantidad(){
        return cantidad;
    }
    
    public void establecerPrecio( double costo ){
        if(costo > 0.0){
            precio = costo;
        }
    }
    
    public double obtenerPrecio(){
        return precio;
    }
    
    public double obtenerMontoFactura(){
        return cantidad * precio;
    }
}

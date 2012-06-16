package cap3; //Ejercicio 3.15

public class Fecha {
    private int dia, mes, anio;
    public Fecha( int d, int m, int a ){
        establecerDia(d);
        establecerMes(m);
        establecerAnio(a);
    }
    
    public void establecerDia( int d ){
        dia = d;
    }
    
    public int obtenerDia(){
        return dia;
    }
    
    public void establecerMes( int m ){
        mes = m;
    }
    
    public int obtenerMes(){
        return mes;
    }
    
    public void establecerAnio( int a ){
        anio = a;
    }
    
    public int obtenerAnio(){
        return anio;
    }
    
    public void obtenerFecha(){
        System.out.printf("%02d/%02d/%d", obtenerDia(), obtenerMes(), obtenerAnio());
    }
}

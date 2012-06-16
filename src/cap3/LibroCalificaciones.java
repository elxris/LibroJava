package cap3; //Ejercicio 3.11

public class LibroCalificaciones {
    private String nombreDelCurso, nombreInstructor;
    public LibroCalificaciones( String nombre, String instructor ){
        nombreDelCurso = nombre;
        nombreInstructor = instructor;
    }
    
    public void establecerNombreDelCurso( String nombre ){
        nombreDelCurso = nombre;
    }
    
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }
    
    public void establecerNombreInstructor( String nombre ){
        nombreInstructor = nombre;
    }
    
    public String obtenerNombreInstructor(){
        return nombreInstructor;
    }
    
    public void mostrarMensaje(){
        System.out.printf("Bienvenido al Libro de calificaciones para\n%s!\nEste curso es impartido por: %s", 
                obtenerNombreDelCurso(), obtenerNombreInstructor());
    }
}

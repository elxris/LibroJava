package cap3;

public class PruebaEmpleado {
    public static void main( String args[] ){
        Empleado empleado1 = new Empleado("Fernando", "Gutierrez", 5250.00);
        Empleado empleado2 = new Empleado("Javier", "Portillo", 6300.00);
        
        System.out.printf("El empleado1 %s, %s se le paga %.2f anualmente.\n",
                empleado1.obtenerApellidoPaterno(), empleado1.obtenerPrimerNombre(),
                empleado1.obtenerSalarioMensual() * 12);
        
        System.out.printf("El empleado2 %s, %s se le paga %.2f anualmente.\n",
                empleado2.obtenerApellidoPaterno(), empleado2.obtenerPrimerNombre(),
                empleado2.obtenerSalarioMensual() * 12);
        
        //Aumento del 10%
        empleado1.establecerSalarioMensual(empleado1.obtenerSalarioMensual()*1.1);
        empleado2.establecerSalarioMensual(empleado2.obtenerSalarioMensual()*1.1);
        
        System.out.println("Los dos empleados recibieron un aumento del 10%.");
        
        System.out.printf("El empleado1 %s, %s se le paga %.2f anualmente.\n",
                empleado1.obtenerApellidoPaterno(), empleado1.obtenerPrimerNombre(),
                empleado1.obtenerSalarioMensual() * 12);
        
        System.out.printf("El empleado2 %s, %s se le paga %.2f anualmente.\n",
                empleado2.obtenerApellidoPaterno(), empleado2.obtenerPrimerNombre(),
                empleado2.obtenerSalarioMensual() * 12);
    }
}

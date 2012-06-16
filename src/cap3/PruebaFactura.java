package cap3;

public class PruebaFactura {
    public static void main( String args[] ){
        Factura factura = new Factura("111-11", "clavos de alta calidad", 1000, 0.12);
        System.out.printf("La factura de '%s' con el numero de pieza '%s' cuesta %.2f " +
        		"cada uno y pediste %d\nAsi que te costara: %.2f\n", factura.obtenerDescripcion(),
        		factura.obtenerNoPieza(), factura.obtenerPrecio(), factura.obtenerCantidad(),
        		factura.obtenerMontoFactura());
        System.out.println("Pero como eres buen cliente te descontaremos .02 en cada clavo");
        factura.establecerPrecio(factura.obtenerPrecio()-0.02);
        System.out.printf("Asi que ahora te costara un total de: %.2f", factura.obtenerMontoFactura());
    }
}

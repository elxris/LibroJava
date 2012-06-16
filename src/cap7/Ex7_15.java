package cap7;

public class Ex7_15 {
    public static void main(String args[]) {
        int arreglo[];
        if( args.length == 1 ){
            arreglo = new int[Integer.parseInt(args[0])];
        }else{
            arreglo = new int[10];            
        }
        System.out.printf("%s%8s\n", "Indice", "Valor");
        for (int contador = 0; contador < arreglo.length; contador++) {
            System.out.printf("%5d%8d\n", contador, arreglo[contador]);
        }
    }
}

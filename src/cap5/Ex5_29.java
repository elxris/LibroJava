package cap5;

public class Ex5_29 {
    public static void main ( String args[] ){
        for(int i = 1; i <= 12; i++){
            System.out.print("El ");
            switch (i){
            case 1:
                System.out.print("primer");
                break;
            case 2:
                System.out.print("segundo");
                break;
            case 3:
                System.out.print("tercer");
                break;
            case 4:
                System.out.print("cuarto");
                break;
            case 5:
                System.out.print("quinto");
                break;
            case 6:
                System.out.print("sexto");
                break;
            case 7:
                System.out.print("septimo");
                break;
            case 8:
                System.out.print("octavo");
                break;
            case 9:
                System.out.print("noveno");
                break;
            case 10:
                System.out.print("decimo");
                break;
            case 11:
                System.out.print("onceavo");
                break;
            case 12:
                System.out.print("doceavo");
                break;
            }
            System.out.println(" dia de Navidad, mi amor me regalo");
            for(int e = i; e >= 1; e--){
                switch (e){
                case 1:
                    System.out.println("un perdiz picando peras del peral");
                    break;
                case 2:
                    System.out.println("dos tortolitas");
                    break;
                case 3:
                    System.out.println("tres gallinitas");
                    break;
                case 4:
                    System.out.println("cuatro pajaritos");
                    break;
                case 5:
                    System.out.println("cinco anillos dorados");
                    break;
                case 6:
                    System.out.println("seis mama gansas");
                    break;
                case 7:
                    System.out.println("siete cisnitos");
                    break;
                case 8:
                    System.out.println("ocho lecheritas");
                    break;
                case 9:
                    System.out.println("nueve bailarinas");
                    break;
                case 10:
                    System.out.println("diez señores saltando");
                    break;
                case 11:
                    System.out.println("once gaiteritos");
                    break;
                case 12:
                    System.out.println("doce tamborileros");
                    break;
                }
            }
        }
    }
}

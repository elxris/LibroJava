package cap5;

public class Ex5_15 {
    public static void main( String args[] ){
        for(int y = 1; y <= 10; y++){
            //Primer patron
            for(int x = 1; x <= y; x++){
                System.out.print("*");
            }
            for(int x = 1; x <= (10-y); x++){
                System.out.print(" ");                    
            }
            System.out.print("/ /");
            //Segundo patron
            for(int x = 0; x+y <= 10; x++){
                System.out.print("*");                    
            }
            for(int x = 1; x <= (y-1); x++){
                System.out.print(" ");
            }
            System.out.print("/ /");
            //Tercer patron
            for(int x = 1; x <= (y-1); x++){
                System.out.print(" ");
            }
            for(int x = 0; x+y <= 10; x++){
                System.out.print("*");                    
            }
            System.out.print("/ /");
            //Cuarto patron
            for(int x = 1; x <= (10-y); x++){
                System.out.print(" ");                    
            }
            for(int x = 1; x <= y; x++){
                System.out.print("*");
            }
            //Linea de retorno
            System.out.println();
        }
    }
}

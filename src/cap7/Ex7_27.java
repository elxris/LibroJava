package cap7;

public class Ex7_27 {
    boolean[] array = new boolean[1000];
    
    public static void main( String args[] ){
        Ex7_27 ejercicio = new Ex7_27();
        ejercicio.setearEnTrue();
        ejercicio.paseo();
        
        System.out.print("Los numeros siguientes: ");
        ejercicio.sobrevivientes();
        System.out.print("son primos.");
    }
    
    public void setearEnTrue(){
        for(int i = 0; i < array.length ; i++){
            array[i] = true;
        }
    }
    
    public void paseo(){
        for(int i = 2; i < array.length; i++){
            iteracion(i);
        }
    }
    
    public void iteracion(int n){
        for(int i = 2; (i*n) < array.length; i++){
            array[i*n] = false;
        }
    }
    
    public void sobrevivientes(){
        for(int i = 2; i < array.length; i++){
            if(array[i] == true){
                System.out.printf("%d, ", i);
            }
        }
    }
}

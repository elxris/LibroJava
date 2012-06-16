package cap7;

import java.util.Random;

public class Ex7_28 {
    int T = 1;
    int H = 1;
    
    public static void main( String args[] ){
        Ex7_28 carrera = new Ex7_28();
        carrera.juego();
    }
    
    public void juego(){
        System.out.print("PUM!!!\nY ARRANCAN!!!\n");
        imprimir();
        for(boolean sigue = true; sigue;){
            tic();
            imprimir();
            if(T >= 70){
                System.out.print("LA TORTUGA GANA!!! YAY!!!");
                sigue = false;
            }
            if(H >= 70){
                System.out.print("La Liebre gana. Que mal.");
                sigue = false;
            }
            if((T >= 70) && (H >= 70)){
                System.out.print("\nEmpatan.");
            }
        }
    }
    
    public void tic(){
        Random rndm = new Random();
        int r = rndm.nextInt(10);
        if(r < 5){
            T += 3;
        }else if (r < 7){
            T += -6;
        }else if (r < 10){
            T += 1;
        }
        T = (T < 1)? 1 : T;
        
        r = rndm.nextInt(10);
        if(r < 2){
        }else if(r < 4){
            H += 9;
        }else if(r < 5){
            H += -12;
        }else if(r < 8){
            H += 1;
        }else if(r < 10){
            H += -1;
        }
        H = (H < 1)? 1 : H;
    }
    
    public void imprimir(){
        String texto = "";
        for(int i = 1; i <= 70; i++){
            texto += "-";
        }
        
        if(T == H){
            texto = String.format(texto+"\n%"+(T)+"s%s", "", "OUCH!!");
        }else{
            if(H > T){
                texto = String.format(texto+"\n%"+T+"s%"+(H-T)+"s", "T", "H");
            }else{
                texto = String.format(texto+"\n%"+H+"s%"+(T-H)+"s", "H", "T");
            }
        }
        System.out.print(texto+"\n");
    }
}

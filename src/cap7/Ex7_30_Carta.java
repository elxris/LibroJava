package cap7;

public class Ex7_30_Carta {
    private String cara;
    private String palo;
    
    public Ex7_30_Carta( String cara, String palo ){
        this.cara = cara;
        this.palo = palo;
    }
    
    public String toString(){
        return cara + " de " + palo;
    }
    
    public String cara(){
        return cara;
    }
    
    public String palo(){
        return palo;
    }
    
    public int obtenerCara( String caras[] ){
        for(int i = 0; i < caras.length; i++){
            if(cara == caras[i]){
                return i;
            }
        }
        return -1;
    }
    
    public int obtenerPalo( String palos[] ){
        for(int i = 0; i < palos.length; i++){
            if(cara == palos[i]){
                return i;
            }
        }
        return -1;
    }
}

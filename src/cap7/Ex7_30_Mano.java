package cap7;

public class Ex7_30_Mano {
    private Ex7_30_Carta mano[];
    public Ex7_30_Mano( Ex7_30_Carta mano[] ){
        this.mano = mano.clone();
    }
    
    //carta alta
    public int cartaAlta( String caras[] ){
        int i = 1;
        int e;
        for(e = mano[0].obtenerCara( caras ); i < mano.length; i++){
            e = Math.max(e, mano[i].obtenerCara(caras));
        }
        return e;
    }
    
    //un par (valores)
    public int[] unPar( String caras[] ){
        int res[] = new int[3];
        int i;
        for(i = 0; i < mano.length; i++){
            
            int e;
            for(e = 0; e < mano.length; e++){
                if(mano[i].obtenerCara(caras) == mano[e].obtenerCara(caras)){
                    res[0] = 1;
                    res[1] = i;
                    res[2] = e;
                    return res;
                }
            }
        }
        return res;
    }
    
    //doble par (valores)
    
    //trio (valores)
    
    //escalera (5 valores consecutivos sin importar el palo)
    
    //color (mismo palo)
    
    //full house (trio de valor y par de valor)
    
    //poker (cuatro mismo valor)
}

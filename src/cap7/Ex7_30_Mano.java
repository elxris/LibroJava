package cap7;

public class Ex7_30_Mano {
    private Ex7_30_Carta mano[];
    public Ex7_30_Mano( Ex7_30_Carta mano[] ){
        this.mano = mano.clone();
    }
    
    //carta alta, devuelve el indice de la carta más alta.
    public int cartaAlta( String caras[] ){
        int i = 1;
        int e = mano[0].obtenerCara( caras );
        for(; i < mano.length; i++){
            e = Math.max(e, mano[i].obtenerCara(caras));
        }
        return e;
    }
    
    //un par (valores), en caso de no haber un par [0] es 0, devuelve el indice del par.
    public int[] unPar( String caras[], Ex7_30_Carta mano[] ){
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
    
    //doble par (valores), de vuelve los indices de los pares de cartas.
    public int[] dosPares( String caras[] ){
        int[] parPar = new int[5];
        int[] par = unPar( caras, mano );
        if(par[0] == 1){
            Ex7_30_Carta mano2[] = new Ex7_30_Carta[mano.length-2];
            //Hace una mano temporal sin las primeros pares de cartas.
            int cont = 0;
            for(int i = 0; i < mano.length; i++){
                if(i == par[1]){
                }else if(i == par[2]){
                }else{
                    mano2[cont++] = new Ex7_30_Carta(mano[i].cara(), mano[i].palo());
                }
            }
            //Busca el par en la mano temporal.
            int[] par2 = unPar( caras, mano2 );
            if(par2[0] == 1){
                parPar[0] = 1;
                parPar[1] = par[0];
                parPar[2] = par[1];
                parPar[3] = par2[0];
                parPar[4] = par2[1];
            }
        }
        return parPar;
    }
    
    //trio (valores)
    public int[] trio( String caras[] ){
        int ret[] = new int[4];
        int t1, t2, t3;
        int ti1, ti2, ti3;
        for(int e = 0; e < mano.length; e++){
            t1 = mano[e].obtenerCara(caras);
            ti1 = e;
            for(int i = 0; i < mano.length; i++){
                t2 = mano[e].obtenerCara(caras);
                ti2 = i;
                for(int a = 0; a < mano.length; a++){
                    t3 = mano[a].obtenerCara(caras);
                    ti3 = a;
                    if(t1 == t2){
                        if(t2 == t3){
                            ret[0] = 1;
                            ret[1] = ti1;
                            ret[2] = ti2;
                            ret[3] = ti3;
                        }
                    }                    
                }
            }            
        }
        return ret;
    }
    //escalera (5 valores consecutivos sin importar el palo)
    public boolean escalera( String caras[] ){
        int i = 1;
        int t;
        for(int a = 0; a < mano.length;){
            t = mano[a++].obtenerCara(caras);
            if(t == mano[a].obtenerCara(caras)){
                i++;
            }
        }
        if(i == 5){
            return true;
        }
        return false;
    }
    //color (mismo palo)
    public boolean color( String palos[] ){
        int i = 1;
        int t;
        for(int a = 0; a < mano.length;){
            t = mano[a++].obtenerPalo(palos);
            if(t == mano[a].obtenerPalo(palos)){
                i++;
            }
        }
        if(i == 5){
            return true;
        }
        return false;
    }
    
    //full house (trio de valor y par de valor)
    public boolean full( String caras[] ){
        int i = 1;
        int t;
        for(int a = 0; a < mano.length;){
            t = mano[a++].obtenerCara(caras);
            if(t == mano[a].obtenerCara(caras)){
                i++;
            }
        }
        if(i == 3){
            return true;
        }
        return false;
    }
    //poker (cuatro mismo valor)
    public boolean poker( String caras[] ){
        int i = 1;
        int t;
        for(int a = 0; a < mano.length;){
            t = mano[a++].obtenerCara(caras);
            if(t == mano[a].obtenerCara(caras)){
                i++;
            }
        }
        if(i == 4){
            return true;
        }
        return false;
    }
}

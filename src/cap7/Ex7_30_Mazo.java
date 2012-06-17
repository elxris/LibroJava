package cap7;

import java.util.Random;

public class Ex7_30_Mazo {
    private final int NUMERO_DE_CARTAS = 52;
    private Ex7_30_Carta mazo[] = new Ex7_30_Carta[NUMERO_DE_CARTAS];
    private String cara[] = {"dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "Joto", "Quina", "Rey", "As"};
    private String palo[] = {"pica", "corazon", "trebol", "diamante"};
    private int actual = 0;
    
    public Ex7_30_Mazo(){
        for(int i = 0; i < mazo.length; i++){
            mazo[i] = new Ex7_30_Carta(cara[ i % cara.length ], palo[ i / cara.length ]);
        }
        barajar();
    }
    
    public void barajar(){
        Random rndm = new Random();
        int varRndm;
        Ex7_30_Carta cartaTmp;
        for(int i = 0; i < mazo.length; i++){
            varRndm = rndm.nextInt(mazo.length);
            cartaTmp = mazo[varRndm];
            mazo[varRndm] = mazo[i];
            mazo[i] = cartaTmp;
        }
    }
    
    public Ex7_30_Carta repartir(){
        return mazo[ ++actual ];
    }
}
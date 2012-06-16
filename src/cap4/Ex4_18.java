package cap4;

import java.util.Scanner;

public class Ex4_18 {
    /*Pseudocodigo
     * Iniciar variables numero cuenta, saldo mes, 
     * articulos cargados en el mes, creditos del mes,
     * limite de crédito y saldo
     * 
     * Obtener el numero de cuenta
     * 
     * Iniciar while para obtener datos while(cuenta != -1)
     *  Obtener el saldo incial del mes,
     *  los articulos cargados, los creditos, y el limite.
     *  Llamar al metodo saldo
     *  saldo - limite de creditos
     *  Determinar si el saldo es negativo
     *      Si lo es mostrar "El limite de credito se excedió"
     *      Obtener el numero de cuenta
     * 
     * Metodo saldo(saldo inicial, cargos, creditos){
     *  saldo = saldo inicial + cargos - credito
     * }*/
    
    public void recibe(){
        int cuenta = 0, saldoInicial = 0, cargosMes = 0, creditosMes = 0, limiteCredito = 0;
        Scanner entrada = new Scanner( System.in );
        System.out.print("Escriba el numero de cuenta (o -1 para quitar): ");
        cuenta = entrada.nextInt();
        while(cuenta != -1){
            System.out.print("Escriba el saldo incial del mes: ");
            saldoInicial = entrada.nextInt();
            System.out.print("Escriba los cargos del mes: ");
            cargosMes = entrada.nextInt();
            System.out.print("Escriba los creditos del mes: ");
            creditosMes = entrada.nextInt();
            System.out.print("Escriba el limite de creditos: ");
            limiteCredito = entrada.nextInt();
            int saldo = saldo(saldoInicial, cargosMes, creditosMes);
            if (saldo - limiteCredito > 0){
                System.out.println("El limite de credito se excedio.");
            }
            System.out.println();
            System.out.print("Escriba el numero de cuenta (o -1 para quitar): ");
            cuenta = entrada.nextInt();
        }
    }
    
    private int saldo(int saldo, int cargos, int credito){
        return saldo + cargos - credito;
    }
}

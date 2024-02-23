/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_constructores;

import java.util.Scanner;

/**
 *
 * @author luisin
 */
public class EVA1_8_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.imprimirDatosCuenta();

        System.out.println("cuanto quieres retirar?");
        double retiro = captura.nextDouble();
        cuenta.retirarSaldo(retiro);
        cuenta.imprimirDatosCuenta();

        System.out.println("cuanto quieres depositar?");
        double deposito = captura.nextDouble();
        cuenta.depositarSaldo(deposito);
        cuenta.imprimirDatosCuenta();
    }

}

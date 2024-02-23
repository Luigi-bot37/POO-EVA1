/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_constructores;

/**
 *
 * @author Luisin
 */
public class CuentaBancaria {

    private double saldo;
    private int noCuenta;
    private String nomCliente;

    //CONSTRUCTOR DEFAULT
    public CuentaBancaria() {
        saldo = 2000.0;
        noCuenta = 1234567;
        nomCliente = "Eggman";
    }

    //GET y SET

    public void setNomCliente(String nombre) {
        nomCliente = nombre;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNoCuenta(int num) {
        noCuenta = num;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void imprimirDatosCuenta() {
        System.out.println("Nombre de cliente: " + nomCliente);
        System.out.println("Num. Cuenta: " + noCuenta);
        System.out.println("Saldo: $" + saldo);

    }

    //RETIRAR

    public void retirarSaldo(double monto) {
        if ((monto <= saldo) && (monto > 0)) {
            saldo -= monto;
        }
    }

    public void depositarSaldo(double monto) {
        saldo += monto;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_formula_general;

import static java.lang.Math.sqrt;

/**
 *
 * @author Luisin
 */
public class Fgeneral {

    private double A;
    private double B;
    private double C;

    //CONSTRUCTOR
    public Fgeneral() {
        A = 0;
        B = 0;
        C = 0;
    }
    //GET y SET

    public void setA(double num) {
        A = num;
    }

    private double getA() {
        return A;

    }

    public void setB(double num) {
        B = num;
    }

    private double getB() {
        return B;

    }

    public void setC(double num) {
        C = num;
    }

    private double getC() {
        return C;
    }

    //OPERACIONES

    private double calcularRaiz() {
        return sqrt((Math.pow(B, 2)) - (4 * A * C));
    }

    private double calcularX1() {
        return (-B - calcularRaiz()) / (2 * A);
    }

    private double calcularX2() {
        return (-B + calcularRaiz()) / (2 * A);
    }

    public void imprimirDatos() {
        System.out.println("A:" + A);
        System.out.println("B:" + B);
        System.out.println("C:" + C);
        System.out.println("x1= " + calcularX1());
        System.out.println("x2= " + calcularX2());
    }
}

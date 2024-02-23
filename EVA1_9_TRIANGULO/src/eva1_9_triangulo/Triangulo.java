/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_triangulo;

import static java.lang.Math.sqrt;

/**
 *
 * @author LUISIN
 */
public class Triangulo {

    private double base;
    private double altura;

    public Triangulo() {
        base = 0;
        altura = 0;
    }

    //GET y SET
    public void setAltura(double h) {
        altura = h;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }

    private double calcularArea() {
        return (base * altura) / 2;
    }

    private double calcularHipo() {
        return sqrt((Math.pow(base, 2)) + (Math.pow(altura, 2)));
    }

    private double calcularPeri() {

        return base + altura + calcularHipo();
    }
    public void imprimirDatos(){
        System.out.println("Base: "+ getBase());
        System.out.println("Altura: "+ getAltura());
        System.out.println("El area es: "+ calcularArea());
        System.out.println("El perimetro es: "+ calcularPeri());
    }
}

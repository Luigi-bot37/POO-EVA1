/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_metodos;

import java.util.Scanner;

/**
 *
 * @author LUISIN
 */
public class EVA1_6_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso1 = new Persona();
        perso1.setNombre("Will");
        perso1.setEdad(50);
        perso1.setApellido("Mushroom");
        System.out.println("Nombre:" + perso1.generarNombreCompleto());
        System.out.println("Anio: " + perso1.generarAnioNacimiento());
        //arreglo de personas, aun no existen
        Persona[] grupo = new Persona[5];
        for (int i = 0; i < grupo.length; i++) {
            grupo[i] = new Persona();//creamos cada objeto
            //Pedir datos
            Scanner captura= new Scanner(System.in);
            System.out.println("Ingrese nombre: ");
            String nombre= captura.nextLine();
            grupo[i].setNombre(nombre);
            System.out.println("Ingrese apellidos: ");
            String ape= captura.nextLine();
            grupo[i].setApellido(ape);
            System.out.println("Ingrese edad: ");
            int edad= captura.nextInt();
            grupo[i].setEdad(edad);
        }
        //imprimir
        for (int i = 0; i < grupo.length; i++) {
            System.out.println("Nombre:" + grupo[i].generarNombreCompleto());
        System.out.println("Anio: " + grupo[i].generarAnioNacimiento()); 
        }
    }

}

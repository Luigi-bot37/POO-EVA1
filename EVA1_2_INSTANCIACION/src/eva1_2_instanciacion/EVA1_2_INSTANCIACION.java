/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_instanciacion;

/**
 *
 * @author invitado
 */
public class EVA1_2_INSTANCIACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciacion: asignar memoria a un objeto
        Persona perso1 = new Persona();
        System.out.println(perso1);
        //El operador "." sirve para dirigirte a la direccion de 
        //memoria y acceder al conternido del objeto
        perso1.apellido = "Gutierrez";
        perso1.nombre = "Benjamin";
        perso1.edad = 45;
    }

}

class Persona {

    String nombre;
    String apellido;
    int edad;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_4_clase_persona;

/**
 *
 * @author invitado
 */
public class EVA1_4_CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Persona perso1= new  Persona();
       perso1.setNombre("Will");
       perso1.setEdad(50);
       perso1.setApellido("Mushroom");
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
    }
    
}
class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String valor) {
        apellido = valor;

    }

    public void setEdad(int valor) {
        edad = valor;
    }

    public int getEdad() {
        return edad;
    }
}

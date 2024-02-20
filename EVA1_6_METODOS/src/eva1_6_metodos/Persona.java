/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_metodos;

/**
 *
 * @author Luisin
 */
public class Persona {

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
    public String generarNombreCompleto(){
        
        return (nombre + " "+ apellido);
    }
    public int generarAnioNacimiento(){
        return 2024 - edad;
    }
}

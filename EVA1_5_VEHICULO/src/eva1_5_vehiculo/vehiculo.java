/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_vehiculo;

/**
 *
 * @author Luisin
 */
public class vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private double precio;
    //metodos SET y GET
    
    public void setMarca(String valor){
        marca= valor;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String valor){
        modelo= valor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setAnio(int valor){
        anio= valor;
    }
    public int getAnio(){
        return anio;
    }
    public void setColor(String valor){
        color= valor;
    }
    public String getColor(){
        return color;
    }
    public void setPrecio(double valor){
        precio= valor;
    }
    public double getPrecio(){
        return precio;
    }
}

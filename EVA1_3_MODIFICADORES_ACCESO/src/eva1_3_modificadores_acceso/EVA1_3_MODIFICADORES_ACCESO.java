/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_modificadores_acceso;

import otropaquete.ClasePrueba2;

/**
 *
 * @author invitado
 */
public class EVA1_3_MODIFICADORES_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Prueba objPrueba= new Prueba();
      objPrueba.x=0;//visible (protected) mismo paquete
      objPrueba.y=0;//visible (public) siempre visible
      objPrueba.z=0;// visible (default) mismo paquete
       ClasePrueba2 objClasePrueba2= new ClasePrueba2();
       objClasePrueba2.y=0;//visible (public) siempre visiblie
    
}}
//ES DEFAULT
class Prueba{
    private int w;
    protected int x;
    public int y;
    int z;
}
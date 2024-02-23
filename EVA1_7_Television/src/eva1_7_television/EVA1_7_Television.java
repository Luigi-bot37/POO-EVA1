/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_television;

/**
 *
 * @author Luisin
 */
public class EVA1_7_Television {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Television tv1= new Television();
        tv1.imprimirConfig();
        tv1.bajarVolumen();
        tv1.bajarCanal();
        tv1.imprimirConfig(); 
        tv1.power();
         tv1.bajarVolumen();
        tv1.bajarCanal();
        tv1.imprimirConfig();
    }
    
}

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
public class Television {

    private int volumen;
    private int canal;
    private boolean estaOn;

    //constructores
    //METODO, en java se llama igual que la clase
    //se usan para inicializar atributos
    //constructor defuault no tiene argumentos
    // si no pones  un constructor default, java lo agrega en automatico
    public Television(){
        volumen= 30;
        canal= 5;
        estaOn= false;
    }
    
    //NO hay metodos get y set
    public void subirVolumen() {
        if (estaOn == true) {
            if((volumen>=0) && (volumen<100))
                    volumen += 1;
        }

        //volumen= volumen+1;
    }

    public void bajarVolumen() {
        if (estaOn == true) {
          if((volumen>0) && (volumen<=100)) 
              volumen -= 1;
        }
    }

    public void subirCanal() {
        if (estaOn == true) {
            canal += 1;
        }
        //volumen= volumen+1;
    }

    public void bajarCanal() {
        if (estaOn == true) {
            canal -= 1;
        }
    }

    public void cambiarCanal(int noCanal) {
        if (estaOn == true) {
            canal = noCanal;
        }
    }

    public void power() {
        /*  if(estaEncendida==true)
         estaEncendida=false;
         else
         estaEncendida=true;*/
        //NEGACION:cambiar un valor booleano por su contrario
        estaOn = !estaOn;
    }

    public void imprimirConfig() {
        System.out.println("Encendido: " + estaOn);
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);

    }
}

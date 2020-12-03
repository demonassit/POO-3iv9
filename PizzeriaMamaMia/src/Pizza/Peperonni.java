/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;

/**
 *
 * @author demon
 */
public class Peperonni extends Pizza{

    public Peperonni() {
    }

    public Peperonni(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        //opciones de peperoni
        //rodajas, rodajas y parmesano, rodajas y albaca, doble
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Rodajas";
        this.ingredientes[1] = "Rodajas con Parmesano";
        this.ingredientes[2] = "Rodajas y Albaca";
        this.ingredientes[4] = "Doble Peperoni en Rodajas";
        
    }
    
    
    
}

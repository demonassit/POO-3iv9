/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;

import java.util.Scanner;

/**
 *
 * @author demon
 */
public class Queso extends Pizza {
    
    //si es privado debo de ocupar un objeto para poder acceder a el

    public Queso() {
    }

    public Queso(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[2];
        this.ingredientes[0] = "Parmesano";
        this.ingredientes[1] = "Mozzarela";
    }
    
    //queremos elegir un tipo de queso
    public String elegirtipoqueso(){
        //es un metodo void, o string?
        Scanner entrada = new Scanner(System.in);
        String queso;
        System.out.println("Elije el queso que deseas");
        System.out.println("1.- Parmesano");
        System.out.println("2.- Mozzalera");
        queso = entrada.next();
        return queso;
    }
    
    
    
    
}

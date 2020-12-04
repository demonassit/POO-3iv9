/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapersona;

/**
 *
 * @author demon
 */
public class Estudiante extends Persona {
    
    private int numBoleta;
    
    private String chillon;

    public Estudiante() {
        
    }

    public Estudiante(int numBoleta, String chillon, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.numBoleta = numBoleta;
        this.chillon = chillon;
    }
    
    public Estudiante(int numBoleta, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.numBoleta = numBoleta;
        //this.chillon = chillon;
    }

    public int getNumBoleta() {
        return numBoleta;
    }

    public void setNumBoleta(int numBoleta) {
        this.numBoleta = numBoleta;
    }

    public String getChillon() {
        return chillon;
    }

    public void setChillon(String chillon) {
        this.chillon = chillon;
    }
    
    
    
    
    
}

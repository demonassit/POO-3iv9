/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author demon
 */
public class Alumno extends Persona{
    
    private int boleta;

    public Alumno() {
        
    }

    public Alumno(int boleta, String nombre, int edad) {
        super(nombre, edad);
        this.boleta = boleta;
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }
    
    /*
    vamos a convertir una persona en un alumno
    */
    @Override
    String tipoPersona(){
        return("Alumno");
    }
    
}

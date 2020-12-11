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
public class Profesor extends Persona {

    private int num_trabajor;

    public Profesor() {
        
    }

    public Profesor(int num_trabajor, String nombre, int edad) {
        super(nombre, edad);
        this.num_trabajor = num_trabajor;
    }
    
    

    @Override
    String tipoPersona() {
        return("Profesor");
    }

    public int getNum_trabajor() {
        return num_trabajor;
    }

    public void setNum_trabajor(int num_trabajor) {
        this.num_trabajor = num_trabajor;
    }
    
    
}

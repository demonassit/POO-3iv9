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
public class Pizza {
    
    private String masa;  //rellena de queso, crunch, con ajo
    private String[] salsa; //quiero una salva barbique, tomate, hiervas finas
    protected String[] ingredientes;
    
    public Pizza(){
    }

    public Pizza(String masa, String[] salsa, String[] ingredientes) {
        this.masa = masa;
        this.salsa = salsa;
        this.ingredientes = ingredientes;
    }
    
    //getter and setter

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String[] getSalsa() {
        return salsa;
    }

    public void setSalsa(String[] salsa) {
        this.salsa = salsa;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    //operaciones propias
    public void hornear(){
        System.out.println("Honear la pizza toma 15 min");
    }
    
    public void cortar(){
        System.out.println("La pizza se corta en 12 porciones");
    }
    
    public void empacar(){
        System.out.println("La pizza se empaca en una cajita de corazon");
    }
    
    
}

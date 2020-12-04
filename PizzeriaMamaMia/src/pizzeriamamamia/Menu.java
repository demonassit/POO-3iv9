/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriamamamia;

//import Pizza.Queso;
import Pizza.*;
import java.util.Scanner;

/**
 *
 * @author demon
 */
public class Menu {
    
    public void MenuOperaciones(){
        
        Scanner entrada = new Scanner(System.in);
        int opc;
        //voy a crear un objeto llamado pizza
        Pizza piza = null;
        do{
        
        System.out.println("Bienvenidos a la Pizzeria Los Tacos");
        System.out.println("¿Que desea ordenar?");
        System.out.println("1.- Pizza de Queso");
        System.out.println("2.- Pizza de Peperoni");
        System.out.println("3.- Pizza de Vegetariana");
        System.out.println("Gracias uwu");
        
        opc = entrada.nextInt();
        
        switch(opc){
            case 1:
                //polomorfismo
                piza = new Queso();
                
                Queso ques = new Queso();
                ques.elegirtipoqueso();
                //me pregunte que tipo de queso quiero?
                piza.hornear();
                piza.cortar();
                piza.empacar();
                
                //necesito a queso
                //Queso ques = new Queso();
                
                break;
            case 2:
                piza = new Peperonni();
                piza.hornear();
                piza.cortar();
                piza.empacar();
                
                break;
            case 3: 
                piza = new Vegetariana();
                piza.hornear();
                piza.cortar();
                piza.empacar();
                break;
            default:
        }
        
        }while(opc != 4);
        
    }
    
}

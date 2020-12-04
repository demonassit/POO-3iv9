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

import javax.swing.JOptionPane;

public class Datos {
    
    //vamos a crear un objeto del estudiante
    Estudiante obj[] = new Estudiante[10];
    
    int x = 0;
    
    //metodo del menu
    void menu(){
        String var = "si";
        
        while(var.equalsIgnoreCase("si")){
            int op = Integer.parseInt(JOptionPane.showInputDialog("Ingresa"
                    + "la opcion deseada \n"
                    + "1.- Dar de alta a un nuevo estudiante\n"
                    + "2.- Mostrar los datos de un estudiante. "));
            
            switch(op){
                case 1:
                    //un metodo para solicitar la informacion del estudiante
                    pedirEstudiante();
                    break;
                case 2:
                    //necesitar un metodo para visualizar los datos
                    mostrarEstudiante();
                    break;
                    
            }
            var = JOptionPane.showInputDialog("¿Deseas repetir?");
        }
    }

    public void pedirEstudiante() {
        //debemos pensar que vamos a solicitar, 
        //los datos del estudiante y almacenarlos en el obj
        //existe algun tipo de dato que soporte diferentes tamaños
        //asi como tambien diferentes dimensiones
        
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del estudiante\n");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante\n"));
        char genero = JOptionPane.showInputDialog("Ingresa el genero del estudiante\n").charAt(0);
        
        //solo para estudiante
        int numBoleta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el num de boleta\n"));
        //x es la cantidad de estudiantes y el tamaño que soporta es de hasta 10
        obj[x] = new Estudiante(numBoleta, nombre, edad, genero);
        x++;
    }

    public void mostrarEstudiante() {
        
        //necesitamos mostrar los datos de los estudiantes
        //recorremos el arreglo del obj
        for(int i = 0; i<x; i++){
            //visualizarlos
            JOptionPane.showMessageDialog(null, "El nombre del estudiante es: "
            + obj[i].getNombre() +"\n " + "La edad del estudiante es: "
            + obj[i].getEdad() + "\n " + "El genero del estudiante es: "
            + obj[i].getGenero() + "\n" + "Su boleta es: "
            + obj[i].getNumBoleta());
        }
        
    }
    
}

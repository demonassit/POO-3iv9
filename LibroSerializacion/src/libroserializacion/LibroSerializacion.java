/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroserializacion;

/**
 *
 * @author demon
 */

import java.io.*;
import java.util.*;

public class LibroSerializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //aun no hacemos nada wiii
        Scanner entrada = new Scanner(System.in);
        
        listaLibros objlista = new listaLibros();
        
        int opcion;
        
        do{
            System.out.println("Bienvenido a la biblioteca");
            System.out.println("Ingrese la opcion deseada");
            System.out.println("1.- Agregar nuevo libro");
            System.out.println("2.- Consultar libro");
            System.out.println("3.- Consutlar todos los libros");
            System.out.println("4.- Borrar un libro");
            System.out.println("5.- Modificar los datos de un libro");
            System.out.println("6.- Salir");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    objlista.agregarLibro();
                    
                    break;
                    
                case 2:
                    objlista.buscar();
                    
                    break;    
                    
                case 3:
                    objlista.consultaGral();
                    
                    break;
                
                case 4:
                    objlista.borrar();
                    
                    break;
                    
                case 5:
                    objlista.modificar();
                    
                    break;
                    
                case 6:
                    System.out.println("Salir");
                    //que se guarde en un archivo
                    objlista.grabar();
                default:
                    System.out.println("Error al elegir intente de nuevo");
            }
        
        }while((opcion >= 1) && (opcion<6));
        
        
    }
    
}

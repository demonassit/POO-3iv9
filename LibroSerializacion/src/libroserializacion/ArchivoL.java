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

import java.util.*;
import java.io.*;

public class ArchivoL implements Serializable {
    
    //vamos a crear el objeto que vamos a serializar
    //lista de libros que vamos a recuperar
    
    ArrayList<CLibro> listarecuperada = new ArrayList<CLibro>();
    
    //vamos a generar el metodo para leer el archivo
    
    public ArrayList<CLibro> leer(){
    
        try{
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("libro.txt"));
            listarecuperada = (ArrayList<CLibro>)in.readObject();
            in.close();
            
        }catch(Exception e){
            
            System.out.println("Error ... " + e.getMessage());
        
        }
        return listarecuperada;
    }
    
    //el metodo para generar el archivo
    void serializar(ArrayList<CLibro> listaSerializada){
        try{
            
            FileOutputStream out = new FileOutputStream("libro.txt");
            ObjectOutputStream objout = new ObjectOutputStream(out);
            
            //ya que tengo la generacion de la salida del archivo
            //vamos a escribirla
            objout.writeObject(listaSerializada);
            objout.close();
            
        }catch(Exception e){
            System.out.println("Error al serializar el archivo" + e.getMessage());
        }
    }
    
}

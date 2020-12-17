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


public class listaLibros implements Serializable {
    
    //vamos a generar los objetos del array y del archivo pero privados
    private ArrayList<CLibro> listalibros;
    private ArchivoL objarchivolibros = new ArchivoL();
    
    public listaLibros(){
        listalibros = new ArrayList<CLibro>();
        //sobrecargar el objeto
        listalibros = objarchivolibros.leer();
    }
    
    //crud
    
    //agregar
    public void agregarLibro(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        
        while(resp == 's'){
            //creamos un objeto de libros
            CLibro objlibro = new CLibro();
            objlibro.aceptarDatos();
            listalibros.add(objlibro);
            System.out.println("¿Deseas agregar otro libro?");
            resp = entrada.next().charAt(0);
        }
    }
    
    //vamos a hacer la consulta general
    public void consultaGral(){
        //verificar si lista esta vacia
        if(listalibros.isEmpty()){
            System.out.println("No hay libros agregados");
        }else{
            System.out.println("Los libros son: ");
            
            //tenemos que recorrer el array
            for(int i = 0; i < listalibros.size(); i++){
                
                System.out.println("********          *************");
                System.out.println("Libro: " + listalibros.get(i).getNombre() + "\n"
                                + "Autor: " + listalibros.get(i).getAutor()+ "\n"
                                + "Editorial: " + listalibros.get(i).getEditorial()+ "\n"
                                + "Precio: " + listalibros.get(i).getPrecio()+ "\n");
                System.out.println("************     ***************");
            
            }
        }
    }
    
    //vamos a crear un metodo para buscar por la posicion de un libro dentro del array
    
    private int traePosicion (String nombreBuscar){
        int pos = 0;
        boolean existe = false;
        
        for(int i = 0; i < listalibros.size(); i++){
            
            //buscar si existe por le nombre
            if(nombreBuscar.equals(listalibros.get(i).getNombre())){
                //si lo encuentra
                pos = i;
                existe = true;
                
            }else{
                System.out.println("Libro no encontrado");
            }
        }
        if(!existe){
            //porque esta afuera del arreglo osea no existe
            System.out.println("No exista el registro");
            pos = -1;
        }
        return pos;
    }
    
    
    //para buscar
    public int buscar(){
        int posbuscar = 0;
        String nomBuscar;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del libro a buscar: ");
        nomBuscar = entrada.nextLine();
        posbuscar = traePosicion(nomBuscar);
        
        //para ahora poder visualizar los datos de ese libro
        
        System.out.println("---------     ------------");
        System.out.println("Nombre: " + listalibros.get(posbuscar).getNombre()
                           + "Autor: " + listalibros.get(posbuscar).getAutor()
                            + "Editorial: " + listalibros.get(posbuscar).getEditorial()
                            + "Precio: " + listalibros.get(posbuscar).getPrecio());
        
        return posbuscar;
               
    }
    
    
    //borar
    public void borrar(){
        Scanner entrada = new Scanner(System.in);
        String libroborrar;
        int posBorrar;
        
        //lo primero que necesito saber si la lista esta vacia
        if(listalibros.isEmpty()){
            System.out.println("No hay libros registrados");
        }else{
            System.out.println("Datos del libro que se va a eliminar");
            posBorrar = buscar();
            
            if(posBorrar<listalibros.size()){
                listalibros.remove(posBorrar);
                System.out.println("Libro eliminado");
            }
        }
    }
    
    //modificar
    public void modificar(){
        int posmodificar = 0;
        int resmod = 0;
        String nomModificar;
        String opcion = "s";
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del libro que desea modificar");
        nomModificar = entrada.nextLine();
        
        while("s".equals(opcion)){
        
            posmodificar = traePosicion(nomModificar);
            
            if(posmodificar <= 0){
            //preguntar la opcion de dato a modificar
                System.out.println("¿Que dato desea modificar del libro?");
                System.out.println("1.-Autor\n"
                        + "2.-Editorial\n"
                        + "3.-Precio\n   ");
                
                resmod = entrada.nextInt();
                
                switch (resmod) {
                    case 1:
                        System.out.println("EL autor es: ");
                        System.out.println("Autor: " + listalibros.get(posmodificar).getAutor());
                        System.out.println("Ingresa el nuevo autor");
                        listalibros.get(posmodificar).setAutor(entrada.next());
                        System.out.println("El dato modificado es:");
                        System.out.println("Autor: " + listalibros.get(posmodificar).getAutor());
                        
                        break;
                        
                    case 2:
                        System.out.println("La editorial es: ");
                        System.out.println("Editorial: " + listalibros.get(posmodificar).getEditorial());
                        System.out.println("Ingresa la nueva editorial");
                        listalibros.get(posmodificar).setEditorial(entrada.next());
                        System.out.println("El dato modificado es:");
                        System.out.println("Editorial: " + listalibros.get(posmodificar).getEditorial());
                        
                        break;   
                        
                    case 3:
                        System.out.println("EL precio es: ");
                        System.out.println("Precio: " + listalibros.get(posmodificar).getPrecio());
                        System.out.println("Ingresa el nuevo precio");
                        listalibros.get(posmodificar).setPrecio(entrada.nextFloat());
                        System.out.println("El dato modificado es:");
                        System.out.println("Precio: " + listalibros.get(posmodificar).getPrecio());
                        
                        break;    
                    
                }
                System.out.println("¿Quieres cambiar algun otro dato? s/n");
                opcion = entrada.nextLine();
            }
            
        }
        
    }

    public ArrayList<CLibro> getListalibros() {
        return listalibros;
    }

    public void setListalibros(ArrayList<CLibro> listalibros) {
        this.listalibros = listalibros;
    }

    public ArchivoL getObjarchivolibros() {
        return objarchivolibros;
    }

    public void setObjarchivolibros(ArchivoL objarchivolibros) {
        this.objarchivolibros = objarchivolibros;
    }
    
    //para grabar el archivo
    public void grabar(){
        getObjarchivolibros().serializar(listalibros);
    }
    
    
    
        
    
}

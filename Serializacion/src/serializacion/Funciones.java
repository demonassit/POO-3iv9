/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author demon
 */
public class Funciones {
    
    //vamos a inicializar todos los objetos y variables que vamos a necesitar
    
    ArrayList<Persona> listaPersonas = new ArrayList();
    String rep = "si";
    String nombre;
    int edad, num_trabajador, boleta;
    //que una persona se transforme en alumno
    Persona alumno = new Alumno();
    //persona que se transforme en profesor
    Persona profesor = new Profesor();
    
    //menu
    
    void menu(){
        while(true){
            //vamos a repetir
            while(rep.equalsIgnoreCase("si")){
                try{
                    //vamos a usar joptionpane
                    String var = JOptionPane.showInputDialog("Ingresa la opcion deseada:"
                            + "\n 1.- Alta de profesor."
                            + "\n 2.- Alta de alumno"
                            + "\n 3.- Consulta de Estudiante"
                            + "\n 4.- Salir");
                    if(var == null){
                        System.exit(0);
                    }
                    int opc = Integer.parseInt(var);
                    
                    switch (opc) {
                        case 1:
                            //crear un metodo para pedir datos del profesor
                            pedirDatosProfesor();
                            //ya sabemos los datos que maneja, simplemente los enviamos
                            profesor = new Profesor(num_trabajador, nombre, edad);
                            //para guaradar ese dato aqui ocupo la serializacion
                            guardarProfesor();
                            break;
                        case 2:
                            //pedir datos
                            pedirDatosEstudiante();
                            //envio los datos
                            alumno = new Alumno(boleta, nombre, edad);
                            //para guardarlo
                            guardarEstudiante();
                            break;
                        case 3:
                            //consultar los estudiantes
                            leerEstudiantes();
                            break;
                        case 4:
                            System.exit(0);
                       
                    }
                    rep = JOptionPane.showInputDialog("¿Deseas repetir?");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
                
                }
            }
        }
    }

    public void pedirDatosProfesor() {
        
        nombre = JOptionPane.showInputDialog("Ingresa el nombre del profesor");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del profesor"));
        num_trabajador = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de trabajador del profesor"));
    }

    public void guardarProfesor() throws IOException {
        listaPersonas.add(profesor);
        //un metodo para todos los archivos
        guardar();
    }

    public void pedirDatosEstudiante() {
        nombre = JOptionPane.showInputDialog("Ingresa el nombre del alumno");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del alumno"));
        boleta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de boleta del alumno"));
        
    }

    public void guardarEstudiante() throws IOException {
        listaPersonas.add(alumno);
        //un metodo para todos los archivos
        guardar();
    }

    private void leerEstudiantes() throws IOException, ClassNotFoundException {
        /*
        vamos a tener que implementar la serializacion del archivo y obtener todos los datos
        ya sea del alumno o del profesor
        */
        FileInputStream archivo = new FileInputStream("archivo.dat");
        //vamos a generar un objeto que se va a encargar de obtener los datos
        //del objeto persona - alumno,  personar - profesor
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        
        //donde se esta guardado esa informacion, en el arraylist
        listaPersonas = (ArrayList)entrada.readObject();
        
        //vamos por los alumnos
        for(int i =0; i<listaPersonas.size(); i++){
            //nuevo objeto de alumno para poderlo guardar
            Alumno obj = (Alumno)listaPersonas.get(i); // estoy obteniendo la boleta que esta guadandose en array
            //mando imprimir los datos
            JOptionPane.showMessageDialog(null, "Datos del alumno:"
                    + "\n Alumno :" + (i+1)+ "\n"
                    + "\n Nombre :" + obj.getNombre()+ "\n"
                    + "\n Edad :" + obj.getEdad()+ "\n"
                    + "\n Boleta :" + obj.getBoleta()+ "\n"
                    + "\n Tipo Persona :" + obj.tipoPersona()+ "\n");
        }
   
    }


    public void guardar() throws FileNotFoundException, IOException{
        //necesito generar una salida no una entrada
        FileOutputStream archivo = new FileOutputStream("archivo.dat");
        //el objeto de salida
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        //lo escriba
        salida.writeObject(listaPersonas);
        salida.close();
     }
}

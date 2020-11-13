/*

Vamos a poner en practica lo visto por parte de herencia
y encapsulamiento para el uso de clases a traves del 
paradigma orientado a objetos


*/


public class Animal{

    //vamos con las variables
    //vamos a utilizar encapsulamiento para proteger el acceso a los datos
    private String nombre, tipo_alimento;
    private int edad;

    /*
    Recordemos que cuando ocupamos encapsulamiento debemos de
    implementar los metodos get y set, para poder tener acceso
    a las variables de la clase
    */

    //constructor de la clase

    public Animal(){
        //este es el metodo que se crea en automatico, con
        //cada una de las clases
    }

    public Animal(String nombre, String tipo_alimento, int edad){

        //la palabra reservada this, que sirve para mandar a llamar a si misma una variable 
        //con su parametro
        this.nombre = nombre;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;

        //es dar el acceso a las variables de acuerdo al parametro con que son llamadas

    }

    //getter y setter

    public String getNombre(){
        //retorno la variable nombre
        return nombre;
    }
    //obtener el parametro nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTipo_alimento(){
        return tipo_alimento;
    }

    public void setTipo_alimento(String tipo_alimento){
        this.tipo_alimento = tipo_alimento;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}
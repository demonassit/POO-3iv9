/*
Esta va a ser la clase principal que hara las invocaciones
de los objetos y metodos


agreguen 

caballos, patos, hamster y tortuguitas *w*

con un metodo para ingresar los datos

*/


public class main{

    //metodo principal
    public static void main(String[] args){

        //y por ahora es todo

        //necesito los objetos de clada una de las clases
        //de aqui mismo puedo pasar los parametros 
        Perro dog = new Perro("Pulgas", "Croquetas", 1, "Pastor aleman");
        Gato cat = new Gato("Gato", "anvorgueza", 2, 9);

        //mostrar los datos

        dog.mostrar();
        System.out.println("uwu");
        cat.mostrar();
        System.out.println("ono");

    }
}
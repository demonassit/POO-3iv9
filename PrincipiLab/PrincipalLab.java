/*
Esta va a ser nuestra clase principal para el ejemplo de
separacion de clases

*/ 

public class PrincipalLab{
    //metodo principal
    public static void main(String[] args){
        //y ahorita no le pondremos nada de nada
        /*
        Para poder hacer uso de los metodos de la segunda clase
        es necesario primero el crear un objeto para invocacion
        de sus metodos u operaciones, y asi
        poder acceder a sus atributos 
        
        */

        Ejercicios obj = new Ejercicios();
        //invocacion
        obj.menu();
    }
}

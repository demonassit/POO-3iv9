/*
Que es una excepcion *w* ?? 

Son para muchas cosas, pero nos van a ayudar a detectar el tipo de error
que puede venir ya sea por parte:

de la clase
del usuario
de la ejecucion
del tipo de dato
de la instruccion

*/ 


public class EjemploExcepciones{

    //metodo principal
    public static void main(String[] args){

        //vamos a realizar un bucle infinito wiiiiiiii
        while(true){

            Otraclase obj1 = new Otraclase();
            obj1.Otrometodo();

            //vamos a realizar una instancia a una clase
            Operaciones obj = new Operaciones();
            //invocamos el metodo
            obj.Otrometodo();
            obj.Ejemplo();

           
        }
    }


}
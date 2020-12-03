/*

un ejemplo de una cadena invertida wiiiii

*/

import java.util.*;

public class cadenainvertida{

    Scanner entrada = new Scanner(System.in);

    public void cadenainvertida(){

        String cadena = "";

        System.out.println("Escribe una oracion para V de vendetta");
        cadena = entrada.nextLine();

        //una variable para guardar la cadena que vamos a invertir

        String cadenainvertida="";

        /*
        para poder invertir una cadena es necesario recorrer la cadena
        que decremente; para que la ultima posicion sea la primera
        y una vez que la hayas recorrido, la vamos a guardar en la 
        cadenainvertida

        v es genial

        */ 

        for(int i = cadena.length()-1; i>=0; i--){
            //voy a tener que obtener caracter por caracter
            char car = cadena.charAt(i); //para obtener cada una de las posiciones
            //debo asignarlo a la cadena invertida
            cadenainvertida = cadenainvertida+car;
            //System.out.println(car);
            //cadenainvertida += car;
        }

        System.out.println("La cadena invertida es: "+ cadenainvertida);


    }
}
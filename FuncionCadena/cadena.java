/*
las funciones de cadena nos sirven para:

poder manipular diferentes tipos de cadenas

aprender a realizar expresiones regulares

*/

import java.util.*;

public class cadena{

    Scanner entrada = new Scanner(System.in);

    //metodo de la cadena
    public void cadena(){

        String s1="Hola como estas, tqm mua mua";

        //saer su longitud
        System.out.println("La longitud es de: " + s1.length());

        // si la cadena inicia con :

        System.out.println(s1.startsWith("Hola"));

        //si la cadena termina con:

        System.out.println(s1.endsWith("mua"));

        //buscar una concurrencia de una subcadena

        System.out.println(s1.indexOf("tq"));

        //sustraer una palabra de una cadena

        String s2 = "Python el nuevo rey de programacion";

        System.out.println(s2.substring(12));
        System.out.println(s2.substring(3, 11));

        //Convertir una cadena a un numero

        String s3 = "125";

        int numero = Integer.parseInt(s3);

        System.out.println("El numero es: "+ numero + "La cadena es: "+ s3);

        //un valor con fraccion

        String s4 = "12.5";
        String s10 = "1";

        double num = Double.parseDouble(s4);

        System.out.println("El numero es: "+ num + "La cadena es: "+ s4);

        String resu = s4+s10;

        System.out.println(resu);

        //vamos a convertir una variable en una cadena

        int valor = 24;

        String s5 = String.valueOf(valor);

        System.out.println("El numero es: "+ valor + "La cadena es: "+ s5);


        //metodo toString que se encarga de convertir un entro a un String

        Integer x = 7;

        System.out.println(x.toString());

        System.out.println(Integer.toString(12));


    }


}
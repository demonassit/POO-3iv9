//vamos a jugar con diferentes operaciones que se hacen con las cadenas

import java.util.*;

public class operacioncadena{

    Scanner entrada = new Scanner(System.in);

    public void OperacionesCadena(){

        String s1 = new String("hola"); //copia de s1
        String s2 = "adios";
        String s3 = "Feliz Cumpleaños";
        String s4 = "feliz cumpleaños";

        char y;

        System.out.println("Escribe la letra del caracter");
        y = entrada.next().charAt(0);

        System.out.println(y);

        String salida = "s1 = " + s1 + "\ns2 = " + s2
                        + "\ns3 = " + s3 + "\ns4 = " +
                        s4 + "\n\n";
                        
        //concatene todo en una sola cadena

        System.out.println(salida);

        //probar la igualdad
        if(s1.equals("hola")){
            salida += "si es igual a \"hola\"\n";
            System.out.println(salida);
        }else{
            salida += "s1 es distinta de \"hola\"\n";
            System.out.println(salida);
        }

        //probar igualdad (ignorando mayusculas)
        if(s3.equalsIgnoreCase(s4)){
            salida += "s3 es igual a s4";
            System.out.println(salida);
        }else{
            salida += "s3 es distinta a s4";
            System.out.println(salida);
        }

        //vamos a comparar

        salida += "\ns1.compareTo(s2) es :" + s1.compareTo(s2) +
                  "\ns1.compareTo(s1) es :" + s1.compareTo(s1) +
                  "\ns2.compareTo(s1) es :" + s2.compareTo(s1) +
                  "\ns3.compareTo(s4) es :" + s3.compareTo(s4) +
                  "\ns4.compareTo(s3) es :" + s4.compareTo(s3);
                  
        System.out.println(salida);

        //longitud de la cadena

        String str = "El primer programa con funciones de cadenitas";
        System.out.println("La longitud es de: "+str.length() );

        //comienza y termina

        System.out.println("Comienza por: El" + str.startsWith("El"));
        System.out.println("Termina con: cadenitas" + str.endsWith("cadenitas"));


        //posicion de un caracter
        int pos = str.indexOf('p');
        System.out.println("Posicion de la letra p : "+pos);

        //otra forma de posicion

        pos = str.indexOf('p', pos+1);
        System.out.println("La segunda posicion de la p :" + pos);

        //subcadenas

        str = "El lenguaje Java";
        System.out.println("Substring : "+ str.substring(12));
        System.out.println("Substring : "+ str.substring(3, 11));

        //eliminar espacios en blanco
        str = " a         a     a   a     12    b  b  b b   porque me engaño disney T_T ";

        System.out.println("Cadena orignal: " + str);
        System.out.println("Cadena sin espacios: " + str.trim());

    }
}

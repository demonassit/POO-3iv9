/*
la sentencia for es un ciclo, en el cual se debe de conocer
hasta cuanto se va a contar

por lo regular se ocupa para poder contar numeros, mas sin encambio
existe una sentencia llamada

foreach el cual da un manejo para poder recorrer y contar
bajo estructuras dinamicas y no estaticas, que mas adelante
veremos que son

*/

import java.util.*;

class forkawaii{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Ingresa el valor para el contador");

        num = entrada.nextInt();

        System.out.println("Ejemplo de un for");
        for(int i=0; i<=num; i++){
            //vamos a tener un cuerpo del problema o de la sentencia
            //instrucciones operaciones 

            System.out.println();
            System.out.println(" -- "+i+" -- ");
            System.out.println();
            for(int j=0; j<=3; j++){
                
                System.out.print(" // "+j+" // ");
                //System.out.println();
                for(int k=0; k<=2; k++){
                    //System.out.print(" ** "+k+" * ");
                    
                }
            }
        }
    }
}
/*

El uso de metodos en java, ayuda al programador
a otorgar diferentes funciones o procesos asociados a
una clase, para subdividir en pequeños fragmentos de tareas


Esto le ayuda al programa a ser mas flexible, rapido,
gastar menos memoria y empezar a optimizar procesos internos
del programa, para asi no generar funciones, o procesos 
repetidos

*/


import java.util.Scanner;

public class metodinValores{

    //variables globales
    //cualquier metodo o funcion o proceso
    //puede hacer uso de ellas
   

    //metodo principal
    public static void main (String[] args){
        /*
        todas las variables que esten adentro de un metodo solo
        pueden ser usadas en el mismo
        
        */ 
        Scanner entrada = new Scanner(System.in);
        //sus variables
        String letra;

        //es donde se ejecutan todas las acciones
        //vamos a realizar una instancia de la clase
        //para acociarla a su metodo de ejecucion
        metodinValores mayormenor = new metodinValores();
        //ya que cree el objeto de la clase, puedo mandar a llamar
        //antes del metodo
        System.out.println("uwu");

        //al metodo que sea necesario
        do{
        mayormenor.cargarValores();
        System.out.println("Deseas repetir?");
        letra = entrada.nextLine();
        }while(letra!="s");
        //despues del metodo
        System.out.println("T_T");
    }

    //metodo que se va encargar de la lectura de los valores
    //de este programa, vamos a hacer una vez mas
    //la comparacion de 3 numeros

    public void cargarValores(){
        //este metodo es vacio, es por eso que se le antepone
        // la palabra reservada void, 
        //¿por que? es vacio, porque no estamos enviando
        //o recibiendo ningun parametro
        Scanner entrada = new Scanner(System.in);
        //variables
        int val1, val2, val3;
        int mayor, menor;

        //aqui metes tu menu con cada opcion
        /*
        
        int opcion

        switch(opcion){

            case 1:
                mandas a llamar al metodo de esta opcion
                calculadora
            case 2:
                mandas a llmar al metodo de esta opcion
                grados a celcius
            case 3:
        }
        
        
        
        
        
        */

        System.out.println("Ingresa el primer numero a comparar");
        val1 = entrada.nextInt();
        System.out.println("Ingresa el segundo numero a comparar");
        val2 = entrada.nextInt();
        System.out.println("Ingresa el tercer numero a comparar");
        val3 = entrada.nextInt();

        //vamos a realizar las operaciones 

        //caso mayor
        //estoy recibiendo 3 parametros de tipo entero
        //antes del metodo
        System.out.println("O.O");
        mayor = CalcularMayor(val1, val2, val3);
        //despues del metodo
        System.out.println("¬¬");
        //caso menor
        menor = calcularmenor(val1, val2, val3);
        System.out.println("El mayor es: "+ mayor);
        System.out.println("El menor es: "+ menor);

    }
    //metodo que se encarga de calcular los numeros y este 
    //es el que se encarga de saber el tipo de dato
                            //parametros
    public int CalcularMayor(int v1, int v2, int v3){
        //la operacion
        //proceso
        //me va a servir para saber quien es el mas grande
        int m;
        //todos los metodos que son de algun tipo de dato
        //deben de retornar un valor 
        //recibir los 3 parametros que son v1, v2, v3
        //en este metodo aqui son variables
        if(v1>v2 && v1>v3){
            //el valor 1 es el mas grande
            m = v1;
        }else{
            if(v2>v3){
                //el valor 2 es el mas grande
                m = v2;
            }else{
                //el valor 3 es el mas grande
                m = v3;
            }
        }
        //fin de las comparaciones
        return m;
    }

    public int calcularmenor(int v1, int v2, int v3){
        //la operacion
        //proceso
        //me va a servir para saber quien es el mas pequeño
        int m;
        //todos los metodos que son de algun tipo de dato
        //deben de retornar un valor 
        //recibir los 3 parametros que son v1, v2, v3
        //en este metodo aqui son variables
        if(v1<v2 && v1<v3){
            //el valor 1 es el mas pequeño
            m = v1;
        }else{
            if(v2<v3){
                //el valor 2 es el mas pequeño
                m = v2;
            }else{
                //el valor 3 es el mas pequeño
                m = v3;
            }
        }
        //fin de las comparaciones
        return m;
    }
}
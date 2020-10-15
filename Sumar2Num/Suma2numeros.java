import java.util.Scanner;

class Suma2numeros{

    //metodo principal
    public static void main(String[] args){
        /*
        Vamos a crear un programa que se encargue de sumar dos numero
        y como tarea  que sume n numeros wiiiii    >:v
        */ 

        //objeto para poder leer los numeros
        Scanner entrada = new Scanner(System.in);

        //variables
        int num1, num2, resultado;


        

        //instrucciones del programa
        System.out.println("Ingresa el primer numero a sumar: ");
        num1 = entrada.nextInt();  //leer el siguiente entero
        System.out.println("Ingresa el segundo numero a sumar: ");
        num2 = entrada.nextInt();  //leer el siguiente entero

        //operacion
        resultado = num1 + num2;

        System.out.println("La suma de los numeros es de: "+resultado);


    }
}
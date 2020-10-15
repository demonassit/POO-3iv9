/*
supongamos que necesitamos obtener diferentes tipos de datos
de un usuario, entonces vamos a necesitar algo mas que solo
leer la consola, sino saber que tipo de dato es el que se
esta introduciendo en la consola

*/

//libreria
import java.util.*; //llamar o instancear todos los objetos de util
import java.util.Scanner;  //solo mandamos a llamar a la que usamos

class ObtenerDatosUsuario{

    public static void main(String[] args){
        //vamos a tener que hacer una instancea de un objeto Scanner
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        float beca;

        System.out.println("Dime tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Dime tu edad: ");
        edad = entrada.nextInt();
        System.out.println("Tu beca es de ¿que monto?: ");
        beca = entrada.nextFloat();

        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu beca es de: "+beca);

    }
}
import java.util.Scanner;

class FiguraMenu{

    public static void main(String[] args){
        /*
        Vamos a realizar un programa el cual
        imprima un menu para calcular perimetro y area 
        de las siguientes figuras geometricas
        cuadrado, triangulo circulo

        lo que quiero de tarea *w* wiiiiii

        1.- Quiero que el menu se repita hasta que yo escriba S o s de salir
        2.- completar el calculo para el perimetro
        3.- Comprobar que todos los numeros sean reales positivos
        4.- Vamos a agregar 3 figuras mas *w*
            Rectangulo, Rombo, Hexagono wiiiiii


        */

        //variables  y objetos
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int altura, base;
        double resultado;


        //la creacion del menu

        System.out.println("Bienvenido al programa de calculo de areas y perimetros");
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1.- Calcular area de un cuadrado");
        System.out.println("2.- Calcular area de un triangulo");
        System.out.println("3.- Calcular area de un circulo");
        System.out.println("Gracias uwu");
        System.out.println("4.- Salir");

        opcion = entrada.nextInt();

        //saber que opcion para que calculo
        switch(opcion){
            case 1:
                System.out.println("Ingresa el valor de un lado");
                base = entrada.nextInt();
                resultado = base*base;
                System.out.println("El area es de: "+resultado);
                //cerrar los casos
                break;

            case 2:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                resultado = (base*altura)/2;
                System.out.println("El area es de: "+resultado);
                break;

            case 3:
                System.out.println("Ingresa el valor del radio");
                base = entrada.nextInt();
                resultado = 3.1416*(base*base);
                System.out.println("El area es de: "+resultado);
                break;

            default:
                System.out.println("Gracias por venir. nwn/");
        }
    }
}
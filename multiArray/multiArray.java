/*
Vamos a realizar un programa en el cual tengo dos arreglos
y una de las matrices se va a llenar con numeros aleatorios entre
el 10 y el 100, una segunda matriz que sera la copia de la primera
una matriz resultante que sera la operacion de multiplicar los valores
de la matriz 1 por la 2, y sera separado por metodos.



*/ 


import javax.swing.JOptionPane;

public class multiArray{

    //metodo principal
    public static void main(String[] args){

        //vamos a hacer mini interfaz kawaii
        String texto = JOptionPane.showInputDialog("Introduce el tamaño del arreglo");

        //ahora vamos a parsear la variable, JOption solo acepto texto
        //hay que utilizar el metodo parseInt, parseFloat, etc

        int tamanio = Integer.parseInt(texto);

        //creamos los arreglos
        int array1[] = new int[tamanio];
        int array2[];

        //esta es una variable con base al mismo tamaño del arreglo

        array1 = new int[tamanio];  


        //vamos a crear un metodo para rellenar de numeros aleatorios a los arreglos
        //se deben de pasar 3 parametros, el array, el inidice inicial, indice final
        rellenarNumAleatorioArray(array1, 20, 100);

        //duplicamos al arreglo 2

        array2 = array1;

        //esta es una variable con base al mismo tamaño del arreglo

        array1 = new int[tamanio];  

        //again
        rellenarNumAleatorioArray(array1, 10, 100);

        //creamos el arreglo de resultado
        //asi mismo un metodo para realizar la operacion
        int array3[] = multiplicador(array1, array2);

        //vamos a crear un metodo para poder visualizar los datos del arreglo

        System.out.println("Los datos del arreglo 1: ");

        mostrarArray(array1);

        System.out.println("Los datos del arreglo 2: ");

        mostrarArray(array2);

        System.out.println("El resultado de la multiplicacion es: ");

        mostrarArray(array3);



    }

    //el metodo que se encar del relleno de numeros aleatorios
    //y vamos a crearlo de forma estatica, para que no tenga cambios

    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        //ahora necesitamos recorrer el tamaño del arreglo e ingresar los datos
        //de los numeros aleatorios
        for(int i = 0; i<lista.length; i++){
            //generamos los numeros aleatorios
            //casteo de operador (transoformar de un tipo de dato a otro en mismo instante)
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }

    //vamos a realizar el metodo que se encarga de visualizar los datos
    public static void mostrarArray(int lista[]){

        //primero tengo que recorrerlo
        for(int i = 0; i<lista.length; i++){
            //imprimimos los valores del arreglo
            System.out.println("La posicion es: "+i+ " esta el valor: "+lista[i]);
        }
    }


    //falta el metodo que se encarga de realizar la operacion de la multiplicacion

    public static int[] multiplicador(int array1[], int array2[]){

        //inicializo mi arrary3
        int array3[] = new int[array1.length];

        //recorrer los valores del arreglo1 y 2 para multiplicarlos
        for(int i = 0; i<array1.length; i++){
            array3[i]=array1[i]*array2[i];
        }
        return array3;
    }
}
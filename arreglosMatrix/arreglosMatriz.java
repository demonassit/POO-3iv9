/*
Como vimos la semana pasada existen diferentes tipos 
de operaciones o modos para declarar un arrglo
y vamos a practicar hoy

*/

import java.util.*;

public class arreglosMatriz{

    //metodo principal
    public static void main(String[] args){
        /*vamos a crear un arreglo unidimensional
        //tipo de dato nombre y el tamaño
        int arreglo[] = new int[10]; 
        //vamos a recorrer el arrglo
        //utilizar un bucle
        for(int i = 5; i<arreglo.length; i++){
            System.out.println("Magia: "+arreglo[i]);
        }
        */

        //vamos con un bidimensional
        Scanner entrada = new Scanner(System.in);
        //arreglo
        int matriz[][] = new int[3][3];

        //vamos a sumar las filas del arreglo y sacar el promedio
        float sumarFilas = 0;
        //filas
        for(int i = 0; i<matriz.length; i++){
            //columnas
            for(int j = 0; j<matriz.length; j++){
                //vamos a llenar nuestra matriz
                System.out.println("Ingresa el valor de la fila: "
                + i + " y la columna : "+ j + " ");
                //tenemos que entregar la posicion
                matriz[i][j]=entrada.nextInt();
            }
        }

        for(int i = 0; i<matriz.length; i++){
            sumarFilas = 0;
            for(int j= 0; j<matriz.length; j++){
                sumarFilas += matriz[i][j];
                System.out.print(String.format("%d", matriz[i][j]));
            }
            System.out.println(String.format("\nSumar de las filas: %f, 
            Promedio de la fila: %f", sumarFilas, sumarFilas/matriz.length ));
        }

        //1+1 = 11    1+1 = 2

        
    }
}
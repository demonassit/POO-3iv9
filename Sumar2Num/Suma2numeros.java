import java.util.Scanner;

class Suma2numeros{

    //metodo principal
    public static void main(String[] args){
        /*
        Vamos a crear un programa que se encargue de sumar dos numero
        y como tarea  que sume n numeros wiiiii que todos sean positivos 
        y sino que imprima mensaje "numero negativo no se acepta"
        y vuelva a pedir un numero positivo   >:v
        */ 

        //objeto para poder leer los numeros
        Scanner entrada = new Scanner(System.in);

        //variables
        int num1; 
        
        int resultado=0;

        do{
            //hacer la accion
            System.out.println("Ingresa el numero a sumar: ");
            num1 = entrada.nextInt();  //leer el siguiente entero

            //como puedo saber si es positivo
            // si (num > 0 ){   que sume} sino {Escribir "el numero es negativo"}
            if(num1 > 0){
                resultado = resultado + num1;
            }else{
                System.out.println("Escribe de nuevo el numero, ya que solo se aceptan positivos");
            }

            
        }while(num1!=0);

        // mientras no sea cero   
       

        //instrucciones del programa
       
        //System.out.println("Ingresa el segundo numero a sumar: ");
        //num2 = entrada.nextInt();  //leer el siguiente entero

        //operacion
        //resultado = num1 + num2;

        System.out.println("La suma de los numeros es de: "+resultado);


    }
}
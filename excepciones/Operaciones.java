
import java.util.*;

public class Operaciones{

    //creamos un Scanner
    Scanner entrada = new Scanner(System.in);

    int y;

    //el metodo de la operacion

    public void Ejemplo(){

        //para las excepciones se usa try catch
        try{
            //intenta
            System.out.println("Ingresa un valor numerico");
            y = entrada.nextInt();
            System.out.println("El valor fue: "+y);
            System.exit(0);
        }catch(Exception e){
            //fallo
            System.out.println("Ingresa solo numeros bonitos por fis uwu/");
            System.out.println("El tipo de error: "+ e.getMessage());
        }
    }

    public void Otrometodo(){
        System.out.println("Hola mundo mundito mundial uwu");
    }
}
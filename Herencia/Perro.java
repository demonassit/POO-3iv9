/*

la clase perro debe de heredar los atributos que viene
por parte de la clase animal, para ello deberemos de utilizar
la palabra reservada

extends

que significa que esta herederando que se extiende de una
super clase o clase padre

*/

public class Perro extends Animal{

    //variable
    private String raza;

    public Perro(){

        //su constructor de la clase
    }

    //metodo para obtener los parametros que vienen por parte
    //de la clase animal

    public Perro(String nombre, String tipo_alimento, int edad, String raza){
        //para obtener esos atributos, tenemos que hacer uso
        //de la palabra reservada super, que significa que
        //vienen de la clase padre y pasar cada parametro
        super(nombre, tipo_alimento, edad);
        //hace falta obtener el parametro propio
        this.raza = raza;
    }

    //get y set de raza

    public String getRaza(){
        //retorno la variable raza
        return raza;
    }
    //obtener el parametro nombre
    public void setRaza(String raza){
        this.raza = raza;
    }

    //y necesito un metodo para poder visualizar los datos del animal perro
    public void mostrar(){
        //y aqui es donde tengo que hacer uso de los get para acceder al dato
        System.out.println("El nombre del perro es: " + getNombre() 
                        + "- el tipo de comida que come es: " + getTipo_alimento()
                        + "- la edad del perro es : " +getEdad() 
                        + "- la raza del perro es: " +getRaza() );
    }
}
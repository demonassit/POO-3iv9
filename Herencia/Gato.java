

public class Gato extends Animal{

    private int num_vidas;

    public Gato(){
        //constructor
    }

    public Gato(String nombre, String tipo_alimento, int edad, int num_vidas){
        super(nombre, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }

    public int getNum_vidas(){
        return num_vidas;
    }

    public void setNum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }

    public void mostrar(){
        System.out.println("El nombre del gato es: " + getNombre() 
                        + "- el tipo de comida que come es: " + getTipo_alimento()
                        + "- la edad del gato es : " +getEdad() 
                        + "- el numero de vidas que tiene es: " +getNum_vidas() );
    }
}
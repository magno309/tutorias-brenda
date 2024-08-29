public class Gato extends Animal{

    String color;

    public Gato(String nombre, String edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    @Override //Sobreescribir logica ya existente
    public void hacerSonido(){
        System.out.println("Miau!");
    }

    @Override
    public String toString(){
        return "Este gato se llama " + nombre + " y es color " + color;
    }

}

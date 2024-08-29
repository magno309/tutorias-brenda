public abstract class Animal {

    String nombre;
    String edad;

    public Animal(String nombre, String edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void hacerSonido();

    @Override
    public String toString(){
        return "Animal generico";
    }

    // Getters y Setters

}

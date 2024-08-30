package Herencia;

public abstract class Animal {

    String nombre;
    String edad;

    public Animal(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println("Sonido generico");
    }

    public abstract void jugar();

    @Override
    public String toString() {
        return "Herencia.Animal generico";
    }

    // Getters y Setters

}

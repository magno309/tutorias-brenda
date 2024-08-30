package Herencia;

public class Perro extends Animal {

    public Perro(String nombre, String edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau!");;
    }

    @Override
    public void jugar() {
        System.out.println("El perro juega con la pelota");
    }
}

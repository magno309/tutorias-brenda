public class Perro extends Animal {

    public Perro(String nombre, String edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau!");;
    }
}

import Interfaces.Coche;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato("Pelusa", "2", "Naranja");
        Perro perro = new Perro("Firus", "4");
        System.out.println(gato.toString());
        perro.hacerSonido();
        gato.hacerSonido();

        Coche coche = new Coche();
        coche.arrancan();


    }
}
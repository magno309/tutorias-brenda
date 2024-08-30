import Herencia.Animal;
import Herencia.Gato;
import Herencia.Perro;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato("Pelusa", "2", "Naranja");
        Perro perro = new Perro("Firus", "4");

        ArrayList<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(gato);
        listaAnimales.add(perro);

        System.out.println(listaAnimales);

        System.out.println(gato.toString());
        perro.hacerSonido();
        gato.hacerSonido();
    }
}
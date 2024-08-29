import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class Colecciones {


    public void usarHashSet() {

        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = new Date();
        System.out.println(dt.format(fecha));


        HashSet<Integer> marcas = new HashSet<>();

        System.out.println("Agregando:");
        System.out.println(marcas.add(1));
        System.out.println(marcas.add(5));
        System.out.println(marcas.add(8));

        System.out.println("Lista:");
        System.out.println(marcas);
        System.out.println("Contiene 1? " + marcas.contains(1));
        System.out.println("Contiene 3? " + marcas.contains(3));

        for (int i = 0; i < marcas.size(); i++) {
            if (marcas.contains(i)) {
                System.out.println(i + " Fue encontrado en el set");
            } else {
                System.out.println(i + " NO fue encontrado en el set");
            }
        }

        for(Integer entero: marcas){
            System.out.println(entero);
        }
    }
}

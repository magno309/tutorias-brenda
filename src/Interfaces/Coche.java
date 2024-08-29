package Interfaces;

public class Coche implements Vehiculo{


    @Override
    public void arrancan() {
        System.out.println("Arrancando motor");
    }

    @Override
    public void frenan() {
        System.out.println("Frenando");
    }

    @Override
    public void claxon() {
        System.out.println("Pipip");
    }

}

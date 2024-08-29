package Interfaces;

public interface Vehiculo {

    void arrancan();
    void frenan();
    default void claxon(){
        System.out.println("Sonar claxon");
    }

}

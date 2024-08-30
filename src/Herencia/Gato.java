package Herencia;

public class Gato extends Animal{

    String color;

    public Gato(String nombre, String edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    @Override // El metodo con diferente implementacion
    public void hacerSonido(){
        System.out.println("Miau!");
    }

    @Override
    public void jugar() {
        System.out.println("EL gato con estambre");
    }

    // Sobre carga:
    // Tener mas de un metodo con el mismo nombre pero diferente firma
    // Diferente cantidad y/o tipo de parametros
    // Firma: [tipo de acceso] [tipo de retorno] [nombre del metodo] ([parametros, ...])
    public void hacerSonido(Integer repeticiones)
    {
        for(int i=0; i<repeticiones; i++){
            System.out.println("Miau!");
        }
    }

    @Override
    public String toString(){
        return "Este gato se llama " + nombre + " y es color " + color;
    }

}

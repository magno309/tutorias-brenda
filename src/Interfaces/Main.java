package Interfaces;

public class Main {

    public static void main(String[] args) {

        TarjetaDeCredito bbva = new TarjetaDeCredito("1234", "Luis", "123");
        Paypal cuentaPaypal = new Paypal("luis@mail.com", "1235");

        bbva.procesarPago(500.0);
        bbva.validarTransaccion();
        bbva.emitirRecibo();

        cuentaPaypal.procesarPago(350.0);
        cuentaPaypal.validarTransaccion();
        bbva.emitirRecibo();

        // Controlador
        // /host/endpoint
        // public ResponseEntity<???> obtenerClientes(){ return servicio.listaClientes(); }

        // Servicio
        // public ArrayList<Clientes> listaClientes() { return repositorio.llamarBaseDeDatos(); }
        // getALl()
        // getOne()
        // create()
        // update()
        // delete()

        // Repositorio
        // public ArrayList<Clientes> llamarBaseDeDatos() { 'SELECT * FROM clientes' }
    }

}

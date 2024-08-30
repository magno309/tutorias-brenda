package Interfaces;

public class Paypal implements ProcesadorDePagos{

    private String email;
    private String contrasenia;

    public Paypal(String email, String contrasenia) {
        this.email = email;
        this.contrasenia = contrasenia;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Paypal");
    }

    @Override
    public boolean validarTransaccion() {
        System.out.println("Validando transaccion en Paypal...");
        return true;
    }

    @Override
    public void emitirRecibo() {
        System.out.println("Emitiendo recibo de Paypal...");
    }
}

package Interfaces;

public class TarjetaDeCredito implements ProcesadorDePagos{

    private String numeroDeTarjeta;
    private String nombreTitular;
    private String cvv;

    public TarjetaDeCredito(String numeroDeTarjeta, String nombreTitular, String cvv) {
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.nombreTitular = nombreTitular;
        this.cvv = cvv;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con tarjeta de credito");
    }

    @Override
    public boolean validarTransaccion() {
        System.out.println("Validando transaccion...");
        return true;
    }

    @Override
    public void emitirRecibo() {
        System.out.println("Emitiendo recibo...");
    }
}

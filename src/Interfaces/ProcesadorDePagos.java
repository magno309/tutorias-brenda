package Interfaces;

public interface ProcesadorDePagos {

    void procesarPago(double monto);

    boolean validarTransaccion();

    void emitirRecibo();
}

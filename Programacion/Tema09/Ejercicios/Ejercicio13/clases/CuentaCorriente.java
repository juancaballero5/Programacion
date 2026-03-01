package Ejercicios.Ejercicio13.clases;

public class CuentaCorriente {
    
    private int numeroCuenta;
    private double saldo;

    public CuentaCorriente() {
        this.saldo = 0;
        this.numeroCuenta = (int) (Math.random() * (99999 - 10000 + 1)) + 10000;
    }

    public CuentaCorriente(double n) {
        this.saldo = n;
        this.numeroCuenta = (int) (Math.random() * (99999 - 10000 + 1)) + 10000;
    }

    public void ingreso(double n) {
        this.saldo += n;
    }

    public void cargo(double n) {
        this.saldo -= n;
    }

    public void tranferencia(CuentaCorriente cuenta, double dinero) {
        cuenta.ingreso(dinero);
        this.cargo(dinero);
    }

    @Override
    public String toString() {
        return String.format("Número de cta: %d Saldo: %.2f €", this.numeroCuenta,this.saldo);
    }

}

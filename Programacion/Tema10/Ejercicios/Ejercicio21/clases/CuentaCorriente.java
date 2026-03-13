package Ejercicios.Ejercicio21.clases;

public class CuentaCorriente {
    
    private String numeroCuenta = "";
    private double saldo;

    public CuentaCorriente() {
        this.saldo = 0;
        this.generarNumero();
    }

    private void generarNumero() {
        for (int i = 0; i < 10; i++) {
            
            int temp = (int) (Math.random() * 10);
            numeroCuenta += temp;

        }
    }

    public CuentaCorriente(double n) {
        this.saldo = n;
        this.generarNumero();;
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

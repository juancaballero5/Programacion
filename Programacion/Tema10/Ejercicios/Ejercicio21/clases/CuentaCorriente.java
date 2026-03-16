package Ejercicios.Ejercicio21.clases;

import java.util.ArrayList;

public class CuentaCorriente {
    
    private String numeroCuenta = "";
    private double saldo;

    private ArrayList<String> movimientos; 

    public CuentaCorriente() {
        this.saldo = 0;
        this.generarNumero();

        this.movimientos = new ArrayList<>();
    }

    private void generarNumero() {
        for (int i = 0; i < 10; i++) {
            
            int temp = (int) (Math.random() * 10);
            numeroCuenta += temp;

        }
    }

    public CuentaCorriente(double cantidad) {
        this.saldo = cantidad;
        this.generarNumero();;

        this.movimientos = new ArrayList<>();
    }

    public void ingreso(double cantidad) {
        this.saldo += cantidad;
        this.movimientos.add(String.format("Ingreso de %.2f Saldo: %.2f€",cantidad,this.saldo));
    }

    public void cargo(double cantidad) {
        this.saldo -= cantidad;
        this.movimientos.add(String.format("Cargo de %.2f Saldo: %.2f€",cantidad,this.saldo));
    }

    public void tranferencia(CuentaCorriente cuenta, double dinero) {
        cuenta.saldo += dinero;
        this.saldo -= dinero;

        // Registramos las transferencias enviadas
        this.movimientos.add(String.format("Trasf. enviada de %.2f de la cuenta %s Saldo. %.2f€",dinero,cuenta.numeroCuenta,this.saldo));

        // Registramos los movimientos en la cuenta destino
        cuenta.movimientos.add(String.format("Trasf. recibida de %.2f de la cuenta %s Saldo. %.2f€",dinero,this.numeroCuenta,this.saldo));

    }

    /**
     */
    public void mostrarMovimientos() {

        System.out.printf("Movimientos de la cuenta %s\n--------------------------------------\n", this.numeroCuenta);
        for (String item: movimientos) {

            System.out.println(item);

        }
    }

    @Override
    public String toString() {
        return String.format("Número de cta: %d Saldo: %.2f €", this.numeroCuenta,this.saldo);
    }

}

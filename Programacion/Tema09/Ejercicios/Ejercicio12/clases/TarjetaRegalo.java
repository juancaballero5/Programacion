package Ejercicios.Ejercicio12.clases;

public class TarjetaRegalo {
    
    private double saldo;
    private int numero;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.numero = (int) (Math.random() * (99999 - 10000 + 1)) + 10000;
    }

    public void gasta(double n) {
        if (n > this.saldo) {
            System.out.printf("No tiene suficiente saldo para gastar %.2f€\n",n);
        } else {
            this.saldo -= n;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t) {

        double total = this.saldo + t.saldo;

        TarjetaRegalo tarjetaNueva = new TarjetaRegalo(total);

        this.saldo = 0;
        t.saldo = 0;

        return tarjetaNueva;
    }

    @Override
    public String toString() {
        return String.format("Tarjeta No %d - Saldo %.2f€", this.numero,this.saldo);
    }
}

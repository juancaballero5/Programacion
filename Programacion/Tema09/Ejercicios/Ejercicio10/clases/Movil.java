package Ejercicios.Ejercicio10.clases;

public class Movil extends TerminalMovil{

    String tarifa;
    double precioTarifa;

    public Movil(String n,String tarifa) {
        super(n);
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return String.format(toString() + " - tarificados %.2d euros", tarifa);
    }
}

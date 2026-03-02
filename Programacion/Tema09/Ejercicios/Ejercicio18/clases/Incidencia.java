package Ejercicios.Ejercicio18.clases;

public class Incidencia {
    
    private static int numero = 1;
    private static int pendientes = 0;
    private int numeroIncidencia;
    private int puesto;
    private String estado;
    private String problema;

    public Incidencia(int puesto, String problema) {
        this.puesto = puesto;
        this.problema = problema;
        this.numeroIncidencia = numero;
        numero++;
        this.estado = "Pendiente";
        pendientes++;
    }

    public void resuelve(String solucion) {
        this.estado = "Resuelta";
        pendientes--;
        System.out.println(toString() +" - " + solucion);
    }

    public static int getPendientes() {
        return pendientes;
    }

    @Override
    public String toString() {
        return String.format("Incidencia %d - Puesto: %d - %s - %s", this.numeroIncidencia, this.puesto, this.problema, this.estado);
    }

}

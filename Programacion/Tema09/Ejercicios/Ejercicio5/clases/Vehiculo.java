package Ejercicios.Ejercicio5.clases;

public abstract class Vehiculo {
    
    private static int vehiculosCreados = 0;
    protected int kilometrosTotales;
    protected int kilometrosRecorridos;

    public Vehiculo() {
        vehiculosCreados++;
    }

    public int getKilometrosTotales() {
        return this.kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

}

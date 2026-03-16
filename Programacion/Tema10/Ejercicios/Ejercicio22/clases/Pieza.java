package Ejercicios.Ejercicio22.clases;

import java.util.ArrayList;

public class Pieza {

    
    ArrayList<String> capturadas = new ArrayList<>();

    private String nombre;
    private int valor;
    private int cantidad; 

    public Pieza(String nombre, int valor, int cantidad) {
        this.nombre = nombre;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public boolean puedoCapturar() {
        return this.cantidad > 0;
    }

    public void capturar() {
        this.cantidad--;
    }

    /**
     * @return
     */
    public int getValor() {
        return this.valor;
    }

    /*
     */
    @Override
    public String toString() {
        return String.format("%s (%d peones)",this.nombre, this.valor);
    }

}

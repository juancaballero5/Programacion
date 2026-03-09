package Ejercicios.Ejercicio7;

import java.util.ArrayList;

import Ejercicios.Ejercicio7.clases.Moneda;

public class Main {
    
    public static void main(String[] args) {
        
        Moneda moneda;
        Moneda anterior;
        String posicion;
        String cantidad;
        String posicionAnterior;
        String cantidadAnterior;

        // Generamos el aaraylist para almacenar las monedas
        ArrayList<Moneda> monedas = new ArrayList<>();

        // generamos la moneda
        anterior = new Moneda();

        monedas.add(anterior);

        // consultamos la posición y valor de la moneda anterior
        posicionAnterior = anterior.getPosicion();
        cantidadAnterior = anterior.getCantidad();

        System.out.println("Primera moneda:" + anterior);

        for (int i = 0; i <= 6; i++) {
            
            do {
                moneda = new Moneda();
                System.out.println(moneda);
            } while (moneda.getCantidad().equals(cantidadAnterior) && moneda.getPosicion().equals(posicionAnterior));
            
            // encontramos la moneda, la guardamos
            monedas.add(moneda);
    
            posicionAnterior = moneda.getPosicion();
            cantidadAnterior = moneda.getCantidad();

        }

        for (Moneda item: monedas ) {
            System.out.println(item);
        }

    }
}

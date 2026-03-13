package Ejercicios.Ejercicio12;

import java.util.HashSet;

import Ejercicios.Ejercicio12.clases.Carta;

public class MainA {

    public static final int MAX_CARTAS = 5;

    public static void main(String[] args) {

        int puntuacion = 0;
        
        HashSet<Carta> baraja = new HashSet<>();
        
        do {
            baraja.add(new Carta());
        } while (baraja.size() < MAX_CARTAS);
        
        for (Carta item: baraja) {
            System.out.println(item);
            puntuacion+= item.valor();
        }

        // mostramos la puntuación total
        System.out.printf("Tienes %d puntos\n",puntuacion);

    }
}

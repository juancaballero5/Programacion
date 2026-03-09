package Ejercicios.Ejercicio8;

import java.util.ArrayList;

import Ejercicios.Ejercicio8.clases.Carta;

public class Main {
    
    public static void main(String[] args) {
        
        Carta carta;
        ArrayList<Carta> baraja = new ArrayList<>();

        carta = new Carta();
        baraja.add(carta);

        for (int i = 0; i <= 10; i++) {
            
            do {
                
                carta = new Carta();

            } while (baraja.contains(carta));
    
                baraja.add(carta);
            
        }

        // mostramos todas las cartas
        for(Carta item : baraja) {
            System.out.println(item);
        }
    }
}

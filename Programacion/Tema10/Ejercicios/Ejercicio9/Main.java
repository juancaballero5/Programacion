package Ejercicios.Ejercicio9;

import java.util.ArrayList;
import java.util.Comparator;

import Ejercicios.Ejercicio9.clases.Carta;

public class Main {
    
    public static void main(String[] args) {
        
        Carta carta;
        ArrayList<Carta> baraja = new ArrayList<>();
        ArrayList<Carta> barajaOrdenada = new ArrayList<>();

        carta = new Carta();
        baraja.add(carta);

        for (int i = 0; i <= 10; i++) {
            
            do {
                
                carta = new Carta();

            } while (baraja.contains(carta));
    
                baraja.add(carta);
            
        }

        // // mostramos todas las cartas
        // for(Carta item : baraja) {
        //     System.out.println(item);
        // }

        if (carta.compareTo(carta) > 0) {
            barajaOrdenada.add(carta);
        }

        if (carta.compareTo(carta) == 0) {
            barajaOrdenada.add(carta);
        } 

        if (carta.compareTo(carta) < 0) {
            barajaOrdenada.add(carta);
        } 

        // mostramos todas las cartas
        for(Carta item : barajaOrdenada) {
            System.out.println(item);
        }

    }
}


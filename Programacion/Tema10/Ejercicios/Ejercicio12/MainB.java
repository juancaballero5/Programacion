package Ejercicios.Ejercicio12;

import java.util.ArrayList;
import java.util.HashMap;

import Ejercicios.Ejercicio12.clases.Carta;

public class MainB {

    public static final int MAX_CARTAS = 5;

    public static void main(String[] args) {

        Carta carta;
        
        int puntuacion = 0;
        ArrayList<Carta> mazo = new ArrayList<>();
        HashMap<String,Integer> cartas = new HashMap<>();
        
        // Inicializamos el valor de las cartas
        inicializarValores(cartas);

        for (int i = 0; i < MAX_CARTAS; i++) {
            
            do {
                carta = new Carta();
            } while (mazo.contains(carta));
            
            mazo.add(carta);

        }

        for(Carta item: mazo) {
            System.out.println(item);
            puntuacion = cartas.get(item.getFigura().toLowerCase());
        }

    }

    /**
     * @param cartas
     */
    public static void inicializarValores(HashMap<String,Integer> cartas) {
        cartas.put("As", 11);
        cartas.put("dos", 0);
        cartas.put("tres", 10);
        cartas.put("cuatro", 0);
        cartas.put("cinco", 0);
        cartas.put("seis", 11);
        cartas.put("siete", 11);
        cartas.put("Sota", 2);
        cartas.put("Caballo", 3);
        cartas.put("Rey", 4);
    }

}

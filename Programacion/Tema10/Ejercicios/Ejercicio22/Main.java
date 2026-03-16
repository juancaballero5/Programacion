package Ejercicios.Ejercicio22;

import java.util.ArrayList;
import java.util.HashMap;

import Ejercicios.Ejercicio22.clases.Pieza;

public class Main {
    
    public static void main(String[] args) {

        int totalCapturas; 
        int totalPeones = 0; 
        Pieza item;

        ArrayList<Pieza> piezas = new ArrayList<>();

        piezas.add(new Pieza("dama", 9, 1));
        piezas.add(new Pieza("torre", 5, 2));
        piezas.add(new Pieza("alfil", 3, 2));
        piezas.add(new Pieza("caballo", 2, 2));
        piezas.add(new Pieza("peon", 1, 8));
        
        // Determinar el numero de capturas 
        totalCapturas = (int) (Math.random() * 16);
        
        while (totalCapturas > 0) {
            
            item = piezas.get((int) (Math.random() * piezas.size()));
            if (item.puedoCapturar()) {
                item.capturar();
                totalPeones += item.getValor();
                System.out.println(item);
                
                totalCapturas--;
            }

        }

        System.out.printf("Puntos totales: %d peones\n",totalPeones);
    }
}

package Ejercicios.Ejercicio16;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        HashMap<String,String> capitales = new HashMap<>();
        String pais;
        String fin;
        String capital;

        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "Paris");

        do {
            
            System.out.print("Escribe el nombre del país y te diré su capital:");
            pais = System.console().readLine();
            fin = pais;
    
            if (capitales.containsKey(pais)) {
                System.out.println("La capital de " + pais + " es " + capitales.get(pais) );
            } else  if (pais == "salir") {
                System.out.print("No conozco la respuesta ¿cuál es  la capital de " + pais + "?:");
                capital = System.console().readLine();
    
                capitales.put(pais, capital);
            }

        } while (!pais.equals("salir"));

    }
}

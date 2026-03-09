package Ejercicios.Ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> compañeros = new ArrayList<>();

        compañeros.add("Antonio");
        compañeros.add("Jose Antonio");
        compañeros.add("Laura");
        compañeros.add("Andres");
        compañeros.add("Sergio");
        compañeros.add("Javier");

        for (String item: compañeros) {
            System.out.println(item);
        }
    }
}

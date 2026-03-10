package Ejercicios.Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> palabras = new ArrayList<>();
        String palabra;

        System.out.println("Introduzca 10 palabras:");

        for (int i = 0; i < 10; i++) {
            palabra = System.console().readLine();

            palabras.add(palabra);
        }

        System.out.println("");

        // Palabras en orden de introducción

        System.out.println("Palabras en orden de introducción:");
        for (String item: palabras) {
            System.out.println(item);
        }

        System.out.println("");

        Collections.sort(palabras);

        // Palabras en orden alfabetico
        System.out.println("Palabras en orden alfabetico:");
        for (String item : palabras) {
            System.out.println(item);
        }
    }
}

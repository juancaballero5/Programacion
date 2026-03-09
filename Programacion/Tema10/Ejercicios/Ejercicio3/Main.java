package Ejercicios.Ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;

        System.out.println("Introduzca 10 numeros:");

        for (int i = 0; i < 10; i++) {
            numero = Integer.parseInt(System.console().readLine());

            numeros.add(numero);
        }

        for (Integer item: numeros) {
            System.out.println(item);
        }
    }
}

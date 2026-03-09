package Ejercicios.Ejercicio2;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();

        int media;
        int maximo = 0;
        int minimo = 0;
        int total = 0;
        int longitud = (int) ((Math.random() * 20 - 10 + 1) + 10);

        for (int i = 0; i <= longitud; i++) {
            numeros.add((int) (Math.random() * 101));
            total += numeros.get(i);

            if (numeros.get(i) > maximo) {
                maximo = numeros.get(i);
            }

            if (numeros.get(i) < minimo) {
                minimo = numeros.get(i);
            }
        }

        media = total / longitud;

        System.out.printf("SUMA: %d\nMAXIMO: %d\nMINIMO: %d\nMEDIA: %d",media,maximo,minimo,media);

    }
}

package Ejercicios.Ejercicio15;

import Ejercicios.Ejercicio14.clases.FichaDomino;

public class Main {
    
    final static int MAXIMO = 8;
    public static void main(String[] args) {
        
        int izq = (int) (Math.random() * 7);
        int der = (int) (Math.random() * 7);
        int reserva = der;

        FichaDomino[] fichas = new FichaDomino[MAXIMO];
        fichas[0] = new FichaDomino(izq, der);

        for (int i = 1; i < MAXIMO; i++) {
            izq = reserva;
            der = (int) (Math.random() * 7);
            reserva = der;

            fichas[i] = new FichaDomino(izq, der);
        }

        for (int i = 0; i < MAXIMO; i++) {
            System.out.print(fichas[i]);
        }
    }
}

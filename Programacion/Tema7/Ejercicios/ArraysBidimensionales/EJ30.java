package Ejercicios.ArraysBidimensionales;

import java.util.Scanner;

public class EJ30 {
    
    public static final int HOR = 3;
    public static final int VERT = 3;

    public static void main(String[] args) {
    

        int[][] tabla = new int[VERT][HOR];

        String posicion;

        int columna; 
        int fila;
        int jugador = 1;

        Scanner entrada = new Scanner(System.in);

        try {

            do {
                
                mostrarTablero(tabla,jugador);
    
                System.out.print("Escriba  las coordenadas, por ejemplo b2:");
                posicion = entrada.nextLine();
    
                columna = (int) posicion.charAt(0) - 97;  
    
                fila = (int) posicion.charAt(1) - 48;
            
            } while (1 == 1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            entrada.close();
        }

    }

    public static void mostrarTablero(int[][] tabla ,int jugador) {

        escribirLinea();

        for (int i = 0; i < HOR; i++) {

            System.out.printf("%c \u2592 ",i + 97);

            for (int j = 0; j < VERT; j++) {
                
                if ((tabla[i][j] != 0) && (jugador%2 != 0)) {
                    System.out.println("x\u2592");
                } else if ((tabla[i][j] != 0) && (jugador%2 == 0)) {
                    System.out.println("o\u2592");
                } else {
                    System.out.println(" \u2592");
                }

            }

            escribirLinea();

            
        }
    }

    public static void escribirLinea() {

        System.out.printf("  \u2592\u2592\u2592\u2592\u2592\u2592\u2592\n");
    }
}

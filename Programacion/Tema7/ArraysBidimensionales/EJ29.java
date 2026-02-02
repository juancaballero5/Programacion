package Ejercicios.ArraysBidimensionales;

import java.util.Scanner;

public class EJ29 {

    public static final int FIlS = 8;
    public static final int COlS = 8;

    public static void main(String[] args) {
        
        int[][] tabla1 = new int[FIlS][COlS];

        String posicion;

        int columna; 
        int fila;

        Scanner entrada = new Scanner(System.in);

        try {

            System.out.print("Introduzca la posición del alfil:");
            posicion = entrada.nextLine();

            columna = (int) posicion.charAt(0) - 97;  

            fila = (int) posicion.charAt(1) - 48;

            System.out.println("El alfil se puede mover a las siguientes posiciones:");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }

    }

    public static int posiciones(int[][] tabla) {

        

    }
}

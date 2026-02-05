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
            posiciones(fila, columna);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }

    }

    public static void posiciones(int fila, int columna) {
        posicioneArribaDer(fila, columna);
        posicioneArribaIzq(fila, columna);
        posicioneAbajoDer(fila, columna);
        posicioneAbajoIzq(fila, columna);
    }

    public static void posicioneArribaDer(int fila, int columna) {

        int fil = fila + 1;
        int colu = columna + 1;

        while (fil >= 0 && fil <= FIlS && colu >= 0 && colu <= COlS) {
        
            System.out.printf("%c%c ",colu + 97, fil + 48);

            fil++;
            colu++;
        }   

    }

    public static void posicioneArribaIzq(int fila, int columna) {

        int fil = fila - 1;
        int colu = columna + 1;

        while (fil >= 0 && fil <= FIlS && colu >= 0 && colu <= COlS) {
        
            System.out.printf("%c%c ",colu + 97, fil + 48);

            fil--;
            colu++;
        }

    }

    public static void posicioneAbajoIzq(int fila, int columna) {

        int fil = fila - 1;
        int colu = columna - 1;

        while (fil >= 0 && fil <= FIlS && colu >= 0 && colu <= COlS) {
        
            System.out.printf("%c%c ",colu + 97, fil + 48);

            fil--;
            colu--;
        }

    }

    public static void posicioneAbajoDer(int fila, int columna) {

        int fil = fila - 1;
        int colu = columna + 1;

        while (fil >= 0 && fil <= FIlS && colu >= 0 && colu <= COlS) {
        
            System.out.printf("%c%c ",colu + 97, fil + 48);

            fil++;
            colu++;
        }
    }
}

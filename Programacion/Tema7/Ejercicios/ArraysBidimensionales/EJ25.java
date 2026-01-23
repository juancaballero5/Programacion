package Ejercicios.ArraysBidimensionales;

import java.util.Scanner;

public class EJ25 {
    
    public static void main(String[] args) {
        
        final int FILA = 3;
        final int COLUMNA = 3;

        int elemento;

        int fila = 0;
        int columna = 0;

        int [][]tabla = new int[FILA][COLUMNA];

        Scanner esc = new Scanner(System.in);

        try {
            
            System.out.println("Introduzca el valor de cada valor del Array");

            for (int i = 0; i < FILA * COLUMNA; i++) {
                
                System.out.printf("Valor %d:",i+1);
                elemento = esc.nextInt();

                if (columna > COLUMNA - 1) {
                    columna = 0;
                    fila++;
                }

                tabla[fila][columna] = elemento;

                columna++;
            
            }

            System.out.printf("------------------\n");
            System.out.printf("|%3d | %3d | %3d |\n",tabla[0][0],tabla[0][1],tabla[0][2]);
            System.out.printf("------------------\n");
            System.out.printf("|%3d | %3d | %3d |\n",tabla[1][0],tabla[1][1],tabla[1][2]);
            System.out.printf("------------------\n");
            System.out.printf("|%3d | %3d | %3d |\n",tabla[2][0],tabla[2][1],tabla[2][2]);
            System.out.printf("------------------\n");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            esc.close();
        }

    }
}

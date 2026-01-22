package ArraysBidimensionales;

import java.util.Scanner;

public class EJ26 {
    
    public static void main(String[] args) {
        
        final int FILA = 4;
        final int COLUMNA = 5;

        int[][] tabla = new int[FILA][COLUMNA];

        int elemento;
        
        int suma = 0;

        Scanner entrada = new Scanner(System.in);

        try {
            
            System.out.println("Por favor, introduzca los números (enteros) en el array");

            for (int i = 0; i < FILA; i++) {

                for (int j = 0; j < COLUMNA; j++) {
                
                    System.out.printf(" Fila %d, columna %d:",i,j);
                    elemento = entrada.nextInt();

                    tabla[i][j] = elemento;
                
                }

            }

            for (int i = 0; i < FILA; i++) {

                for (int j = 0; j < COLUMNA; j++) {
                
                    System.out.printf("%3d",tabla[i][j]);
                
                }

                System.out.printf("| %3d\n",tabla[i][0] + tabla[i][1] + tabla[i][2] + tabla[i][3] + tabla[i][4]);

            }

            for (int i = 0; i < COLUMNA; i++) {

                System.out.printf("%3d",tabla[0][i] + tabla[1][i] + tabla[2][i] + tabla[3][i]);

            }

            System.out.printf("| %3d \n",suma);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }

    }
}

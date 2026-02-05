package Ejercicios.ArraysBidimensionales;

public class EJ28 {

    public static final int FILAS = 4;
    public static final int COLUMNAS = 5;

    public static final char VACIO = ' ';

    public static void main(String[] args) {
        
        char[][] tablero = new char[FILAS][COLUMNAS];

    }

    public static void iniciarTablero(char[][] tablero) {

        for (int fil = 0; fil < FILAS; fil++) {
            
            for (int col = 0; col < COLUMNAS; col++) {
                tablero[fil][col] = VACIO;
            }

        }
    }

    public static void dibujarTablero(char[][] tablero) {
        
        for (int fil = 0; fil < FILAS; fil++) {

            System.out.printf("%d|",fil);
            
            for (int col = 0; col < COLUMNAS; col++) {
                System.out.printf("%c ",tablero[fil][col]);
            }

            System.out.println();

        }

        // Dibujamos pie de pagina
        System.out.print(" ");

        // mostrar linea de separación

        // mostrar la linea de separación
        System.out.print("\n  ");

        for (int i = 0; i < tablero.length; i++) {
            
        }
    }
}

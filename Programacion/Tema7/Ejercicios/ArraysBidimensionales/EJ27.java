package Ejercicios.ArraysBidimensionales;

import java.util.Scanner;

public class EJ27 {

    public static final int FILA = 4 ;
    public static final int COLUMNA = 5 ;
    
    public static void main(String[] args) {
        

        int minaX = (int) (Math.random() * COLUMNA + 1);
        int minaY = (int) (Math.random() * FILA + 1);
        int tesoroX = (int) (Math.random() * COLUMNA + 1);
        int tesoroY = (int) (Math.random() * FILA + 1);
        int fila;
        int columna;

        int diferenciador = 0;

        int[][] tabla = new int[FILA][COLUMNA];

        Scanner entrada = new Scanner(System.in);

        try {
            
            System.out.println("¡BUSCA EL TESORO!");

            // Mostramos el mapa cada vez
            mostrarMapa();

            do {    

                System.out.print("Coordenadas de x: ");
                columna = entrada.nextInt();

                System.out.print("Coordenadas de y:");
                fila = entrada.nextInt();

                if (tabla[tesoroY][tesoroX] == tabla[fila][columna]) {
                    System.out.println("¡ENHORABUENA! ¡Has encontrado el tesoro!");

                    diferenciador += 1;
                }

                if (tabla[minaY][minaX] == tabla[fila][columna]) {
                    System.out.println("¡BOOOOOOM! Lo siento, has perdido");

                    diferenciador += 1;
                }

            } while (diferenciador==0); 
            

        } catch (Exception e) {

            System.out.println(e.getMessage());
        
        }

    }

    public static void mostrarMapa() {
        for (int i = FILA; i > 0; i--) {
            
            System.out.printf("%d|         \n",i);
        }
        System.out.printf("  ----------\n");

        System.out.printf("  ");
        for (int i = 0; i < COLUMNA; i++) {
            
            System.out.printf("%d ",i);
        }
        System.out.println("");
    }

    /**
     * 
     * @param tabla
     * @param fila
     * @param columna
     */
    public static void mostrarMapaDespues(int[][] tabla, int fila, int columna) {
        for (int i = FILA; i > 0; i--) {
            
            System.out.printf("%d|",i);

            for (int j = 0; j < FILA ; j++) {

                for (int h = 0; h < COLUMNA ; h++) {

                    if (tabla[j][h] == tabla[fila][columna]) {
                        System.out.println("x ");
                    } else {
                        System.out.println("  ");

                    }

                }

            }
        }
        System.out.printf("  ----------\n");

        System.out.printf("  ");
        for (int i = 0; i < COLUMNA; i++) {
            
            System.out.printf("%d ",i);
        }
        System.out.println("");
    }
}

package Nivel2;

public class EJ6 {
    public static void main(String[] args) {
        
        int[][] numeros = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int total = 0;

        System.out.println("Diagonal principal");
        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("|");

            for (int j = 0; j < numeros.length; j++) {
                if (i == j) {
                    System.out.printf("%d |",numeros[i][j]);
                } else {
                    System.out.printf("  |");
                }
            }

            System.out.println("");

        }

        System.out.println("Original");
        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("|");

            for (int j = 0; j < numeros.length; j++) {
                System.out.printf("%d |",numeros[i][j]);
            }

            System.out.println("");

        }

    }
}

package Nivel2;

public class EJ4 {
    public static void main(String[] args) {
        
        int[][] numeros = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int total = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("|");

            for (int j = 0; j < numeros.length; j++) {
                System.out.printf("%d |",numeros[i][j]);
                total += numeros[i][j];
            }

            System.out.println("");

        }

        System.out.printf("TOTAL: %d",total);

    }
}

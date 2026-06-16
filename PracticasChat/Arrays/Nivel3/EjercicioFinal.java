package Nivel3;

public class EjercicioFinal {
    public static void main(String[] args) {

        int total = 0;
        
        char[][] tablero = {
            {'.', '*', '.'},
            {'*', '*', '.'},
            {'.', '.', '*'}
        };

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.printf("%s",tablero[i][j]);

                if(tablero[i][j] == '*') {
                    total++;
                }

            }

            System.out.println("");
        }

        System.out.printf("Total de asteriscos: %d\n",total);
        
    }
}

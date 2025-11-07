package Ejercicios;

public class EJ9 {
    public static void main(String[] args) {
        int i ;
        int numeroLinea = 0;

        while (numeroLinea <= 10) {
            int numeroSimbolo = (int) (Math.random() * (40 - 1 + 1) + 1);
            for (i = 0; i <= numeroSimbolo; i++) {
                int simbolo = (int) (Math.random() * (6 - 1 + 1) + 1);
                if (simbolo == 1) {
                    simbolo = 42;
                    System.out.print(simbolo + " ");
                }else if (simbolo == 2 ) {
                    simbolo = 45;
                    System.out.print(simbolo + " ");
                }else if (simbolo == 3 ) {
                    simbolo = 61;
                    System.out.print(simbolo + " ");
                }else if (simbolo == 4 ) {
                    simbolo = 46;
                    System.out.print(simbolo + " ");
                }else if (simbolo == 5 ) {
                    simbolo = 124;
                    System.out.print(simbolo + " ");
                }else if (simbolo == 6 ) {
                    simbolo = 64;
                    System.out.print(simbolo + " ");     
            }
            System.out.printf("%c ",simbolo);

            }
            System.out.printf("\n ");    
            numeroLinea ++;
        }
    }
}

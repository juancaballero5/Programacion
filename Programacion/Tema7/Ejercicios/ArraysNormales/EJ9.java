package Ejercicios.ArraysNormales;

import java.util.Scanner;

public class EJ9 {
    
    public static void main(String[] args) {
        
        final int MAXIMO = 20;

        int []numero = new int[MAXIMO];
        int []modificado = new int[MAXIMO];

        int contador = 0;

        Scanner esc = new Scanner(System.in);

        try {
            
            System.out.println("Array Original:");

            for (int i = 0; i < MAXIMO; i++) {
                
                numero[i] = (int) (Math.random() * 100 + 1);

                System.out.printf("%d ",numero[i]);

            }

            System.out.println("");

            System.out.println("Array con los pares al principio:");

            for (int i = 0; i < MAXIMO; i++) {
                
                if (numero[i]%2 == 0) {

                    modificado[contador] = numero[i];
                    contador++;

                }

                
            }

            for (int i = 0; i < MAXIMO; i++) {

                if (numero[i]%2 != 0) {

                    modificado[contador] = numero[i];
                    contador++;

                }

            }

            for (int i = 0; i < MAXIMO; i++) {
                
                numero[i] = modificado[i];

            }

            for (int i = 0; i < MAXIMO; i++) {
                
                System.out.printf("%d ",numero[i]);

            }

            System.out.println("");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            esc.close();
        }

    }
}

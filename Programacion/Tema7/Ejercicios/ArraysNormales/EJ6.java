package Ejercicios.ArraysNormales;

import java.util.Scanner;

public class EJ6 {
    
    public static void main(String[] args) {
        
        final int MAXIMO = 15;

        int []numero = new int[MAXIMO];

        Scanner esc = new Scanner(System.in);

        try {
            
            System.out.println("Vaya introduciendo números enteros y pulse INTRO:");

            // Leemos los numeros de teclado
            for (int i = 0; i < MAXIMO;i++) {
                numero[i] = esc.nextInt();
            }

            System.out.println("Array original:");

            // Mostramos el Array original
            for (int i = 0; i < MAXIMO;i++) {
                System.out.printf(" %1-1d |",i);
            }

            System.out.println("");

            for (int i = 0; i < MAXIMO;i++) {
                System.out.printf("-----",i);
            }

            System.out.println("");

            for (int i = 0; i < MAXIMO;i++) {
                System.out.printf(" %1-1d |",numero[i]);
            }

            System.out.println("");

            // Mostramos el Array invertido

            System.out.println("Array rotado a la derecha una posición:");

            for (int i = 0; i < MAXIMO;i++) {
                System.out.printf(" %1-1d |",i);
            }

            System.out.println("");

            for (int i = 0; i < MAXIMO;i++) {
                System.out.printf("-----",i);
            }

            System.out.println("");

            for (int i = 0; i < MAXIMO ;i++) {

                if (i == 0) {

                    System.out.printf(" %1-1d |",numero[MAXIMO - 1]);

                } else if (i == MAXIMO - 1) {

                    System.out.printf(" %1-1d |",numero[MAXIMO - 2]);

                } else {

                    System.out.printf(" %1-1d |",numero[i-1]);

                }

            }

            System.out.println("");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } finally {

            esc.close();

        }

    }

}

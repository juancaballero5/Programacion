package Ejercicios.ArraysNormales;

import java.util.Scanner;

public class EJ5 {

    public static void main(String[] args) {
        
        final int MAXIMO = 10 ;

        int max = 0;
        int min = 0;


        int []numero = new int[MAXIMO];

        Scanner esc = new Scanner(System.in);

        try {

            System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");

            for (int i = 0; i < MAXIMO; i++) {

                // Guardamos los números
                numero[i] = esc.nextInt();

                // Comprobamos el máximo
                if (numero[i] > max) {
                    max = numero[i];
                }

                // Comprobamoa el mínimo
                if (numero[i] < min) {
                    min = numero[i];
                }

            }

            System.out.println("");

            System.out.println("A continuación se mostraran los valores indicando el mínimo y el máximo:");

            for (int i = 0; i < MAXIMO; i++) {
                
                
                if (numero[i] == max) {

                    // Escribimos el máximo 
                    System.out.printf("%d máximo \n",max);

                } else if (numero[i] == min) {

                    // Escribimos el mínimo
                    System.out.printf("%d mínimo \n",min);

                } else {

                    System.out.printf("%d \n",numero[i]);

                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            esc.close();
        }

    }
}
package Ejercicios.ArraysNormales;

import java.util.Scanner;

public class EJ7 {
    
    public static void main(String[] args) {
        
        final int MAXIMO = 100;
        
        int numeroCambiar;
        int numeroSeleccionado;

        int []numero = new int[MAXIMO];

        Scanner esc = new Scanner(System.in);

        try {

            for (int i = 0; i < MAXIMO; i++) {
                
                numero[i] = (int) (Math.random() * 20 + 1);

                System.out.printf("%d\t",numero[i]);

            }

            System.out.println("");

            System.out.print("Introduzca un número de los que se han mostrado:");
            numeroSeleccionado = esc.nextInt();

            System.out.print("Introduzca el valor por el que quiere sutituirlo:");
            numeroCambiar = esc.nextInt();

            for (int i = 0; i < MAXIMO; i++) {

                if (numero[i] == numeroSeleccionado) {
                    System.out.printf("\"%d\"\t",numeroCambiar);
                }

                System.out.printf("%d\t",numero[i]);

            }

        } catch (Exception e){

            System.out.println(e.getMessage());

        } finally {

            esc.close();

        }

    }
}

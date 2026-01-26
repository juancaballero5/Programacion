package Ejercicios.ArraysNormales;

import java.util.Scanner;

public class EJ8 {
    
    public static void main(String[] args) {
        
        final int MAXIMO = 12;

        String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};

        int [] temperatura= new int[MAXIMO];

        Scanner esc = new Scanner(System.in);

        try {
            
            for (int i = 0; i < MAXIMO; i++) {
                
                // System.out.printf("Introduzca la temperatura media de %s:",meses[i]);
                // temperatura[i] = esc.nextInt();
                temperatura[i] = (int) (Math.random() * 20 + 1);

            }

            for (int i = 0; i < MAXIMO; i++) {
                
                System.out.printf("%10s |",meses[i]);

                for (int j = 0; j < temperatura[i]; j++) {
                    System.out.printf("▄");
                }

                System.out.printf(" %dºC \n",temperatura[i]);

            }   

        } catch (Exception e) {

            System.out.println(e.getMessage());
        } finally {

            esc.close();

        }

    }
}

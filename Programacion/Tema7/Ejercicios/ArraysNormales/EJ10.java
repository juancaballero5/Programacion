package Ejercicios.ArraysNormales;

import java.util.Scanner;

public class EJ10 {
    
    public static int ASIENTOS = 4;
    public static int MAXIMO_MESAS = 10;

    public static void main(String[] args) {

        int eleccion;
        int fin = 0;
        int contador = 0;

        int []mesas = new int[MAXIMO_MESAS];

        Scanner esc = new Scanner(System.in);

        try {
            
            for (int i = 0; i < MAXIMO_MESAS ; i++) {
                
                mesas[i] = (int) (Math.random() * 4 + 1);

            }

            mostrarMesas(mesas);

            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa):");
            eleccion = esc.nextInt();

            switch (eleccion) {
                case -1:
                    
                    System.out.println("Gracias. Hasta pronto.");

                break;

                case 1:
                    
                    contador = mesaLibre(eleccion, mesas);

                    System.out.printf("Por favor, siéntese en la mesa %d.",contador);

                break;

                case 2:
                    
                    System.out.println("Gracias. Hasta pronto.");

                break;

                case 3:
                    
                    System.out.println("Gracias. Hasta pronto.");

                break;

                case 4:
                    
                    System.out.println("Gracias. Hasta pronto.");

                break;
            
                default:
                    break;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * 
     * @param mesas
     */
    public static void mostrarMesas(int mesas[]) {

        
        escribirLineas();

        System.out.printf("|  Mesa nº  |");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("     %d     |",i);
        };
        System.out.println("");

        
        escribirLineas();
        
        System.out.printf("| Ocupación |");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("     %d     |",mesas[i]);
        };
        System.out.println("");

        escribirLineas();

    }

    public static void escribirLineas() {

        for (int i = 0; i < 10; i++) {
            System.out.printf("--------------");
        };
        System.out.println("");


    }

    public static int mesaLibre(int eleccion, int[] mesas) {

        int numero = 0;
        int contador = 0;
        int fin = 0;

        for (int j = 0; j < 4 - eleccion; j++) {
            
            for (int i = 0; (i < MAXIMO_MESAS ) || (fin == 0); i++) {
                if (mesas[i]==j) {
                    contador = i;
                    fin = 1;
                }
            }
        }

        return contador;

    }
}

//Juan Caballero Castillo

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("\033[1mVolumen de un Toroide\033[0m");
        System.out.println("\033[1m---------------------\033[0m");

        double radio1; 
        double radio2; 
        float volumen;
        Scanner escaner =new Scanner(System.in);
 

        System.out.print("Introduzca el radio mayor (cms) :");
        radio1 = escaner.nextDouble();
        
        System.out.print("Introduzca el radio menor (cms) :");
        radio2 = escaner.nextDouble();
        
        volumen = (float) (2 * (3.1416 * 3.1416) * radio1 * (radio2 * radio2));

        System.out.printf("Es volumen del toroide es de \033[1m\033[31m%.4f\033[0m\033[1mcm\u00B3\033[0m",volumen);
        
    }
}

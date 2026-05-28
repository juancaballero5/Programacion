package Ejercicio3;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        
        int edad; 
        double sueldo; 
        char categoria;

        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Edad: ");
            edad = sc.nextInt();

            System.out.print("Sueldo: ");
            sueldo = sc.nextDouble();

            System.out.print("Categoria (A/B/C):");
            categoria = sc.next().toLowerCase().charAt(0);

            System.out.printf("Edad en meses: %d\n",(edad*12));
            System.out.printf("Sueldo anual: %.2f\n",(sueldo*12));
            System.out.printf("Edad en meses: %s\n",categoria);

            sc.close();

        } catch (Exception e) {
            System.out.println("**ERROR: El programa ha fallado.");
        }

    }
}

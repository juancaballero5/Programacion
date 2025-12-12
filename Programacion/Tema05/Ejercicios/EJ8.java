package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        
        //final String BORRAR = "\u001b[2j\u001b[H";

        int numero;
        int cuadrado;
        int cubo;

        Scanner escaner = new Scanner(System.in);

        try {

            //System.out.println(BORRAR);

            System.out.print("Introduzca un número :");
            numero = escaner.nextInt();

            System.out.println("  n  |    n2   |    n3 ");
            System.out.println("-------------------------");

            for (int i = 0;i < 5;i++) {

                cuadrado = numero * numero;

                cubo = cuadrado * numero;

                System.out.printf("  %d  |    %d   |    %d \n",numero,cuadrado,cubo );

                numero += 1;
            }

        } catch (InputMismatchException e) {
            System.out.println("**Error: Debe ser introducido un valor de tipo numérico.");
        } catch (Exception e ) {
            System.out.println("**ERROR: El programa a fallado.");
        } finally {
            escaner.close();
        }
    }
}

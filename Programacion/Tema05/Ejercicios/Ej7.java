package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        
        final String BORRAR = "\u001b[2J\u001b[H";

        int numero = 0;
        int cantidadNum = 0;
        int total = 0;
        float media;

        Scanner escaner = new Scanner(System.in);

        try {

            System.out.println(BORRAR);

            System.out.println("Este programa calcula la media de los números positivos introducidos.");
            System.out.println("Para parar, introduzca un número negativo.");
            System.out.println("Vaya introduciendo numeros:");

            while (numero >= 0) {
                numero = escaner.nextInt();

                total += numero;

                cantidadNum++;
            }

            media = total / cantidadNum;

            System.out.printf("La media de los numeros introducidos es %f",media);


        } catch (InputMismatchException e) {
            System.out.println("**Error: Debe introducir un valor numérico de tipo entero.");
        } catch (Exception e ) {
            System.out.println("**ERROR: Algo ha fallado.");
        } finally {
            escaner.close();
        }

    }
}

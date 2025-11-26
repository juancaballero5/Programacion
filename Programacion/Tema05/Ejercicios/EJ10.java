package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        
        final String BORRAR = "\u001b[2J\u001b[H";

        int numero;
        int positivo = 0;
        int negativo = 0;

        Scanner escaner = new Scanner(System.in);

        try {

            System.out.println("Introduce 10 número enteros: ");

            for (int i = 0; i < 10;i++) {

                numero = escaner.nextInt();

                if (numero > 0) {
                    positivo++;
                } else if (numero < 0) {
                    negativo++;
                }

            }

            System.out.printf("Has introducido %d positivos y %d negativos",positivo,negativo);

        } catch (InputMismatchException e) {
            System.out.println("**Error Se debe introducir un valor de tipo númerico entero");
        } catch (Exception e) {
            System.out.println("**Error Algo ha salido mal");
        }finally {
            escaner.close();
        }

    }
}

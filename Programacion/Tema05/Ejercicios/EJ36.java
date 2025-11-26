package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ36 {
    public static void main(String[] args) {
        
        final String BORRAR = "\u001b[2J\u001b[H";

        int numero;
        int exponente = 1;
        int resultado = 1;
        int multiplicador = 1;

        Scanner escaner = new Scanner(System.in);

        try {

            System.out.println(BORRAR);

            System.out.print("Introduce un número entero positivo: ");
            numero = escaner.nextInt();

            for (int i = 0; i < numero; i++) {

                resultado  = exponente * multiplicador;

                System.out.printf("%d! = %d \n",exponente,resultado);
              
                multiplicador = resultado;
                exponente++;

            }


        } catch (InputMismatchException e) {
            System.out.println("**Error Se debe introducir un número entero positivo");
        } catch (Exception e) {
            System.out.println("**Error Algo a salido mal");
        } finally {
            escaner.close();
        }

    }
}

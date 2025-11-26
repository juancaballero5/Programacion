package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ30 {
    public static void main(String[] args) {
        
        final String BORRAR = "\u001b[2J\u001b[H";

        int altura;

        Scanner escaner = new Scanner(System.in);

        try {

            System.out.println(BORRAR);

            System.out.print("Introduzca la altura de la U: ");
            altura = escaner.nextInt();

            for (int i = 0; i < altura ; i++) {

                if (i == altura - 1) {
                    System.out.println("  * * *  ");
                } else {
                    System.out.println("*       *");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("**Error debe introducirse un número entero");
        } catch (Exception e) {
            System.out.println("**Error algo ha salido mal");
        } finally {
            escaner.close();
        }
    }
    
}
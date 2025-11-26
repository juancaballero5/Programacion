package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ28 {
    public static void main(String[] args) throws InputMismatchException {

        final String BORRAR = "\u001b[2J\u001b[H";

        int altura;

        Scanner escaner = new Scanner(System.in);

        try {

            System.out.println(BORRAR);

            System.out.print("Introduzca la altura de la L: ");
            altura = escaner.nextInt();

            for (int i = 0 ; i < altura; i++) {

                if (i == altura - 1) {
                    System.out.println("* * *");
                } else {
                    System.out.println("*");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("**ERROR debe introducirse un valor numerico entero");
        } catch (Exception e) {
            System.out.println("**ERROR algo ha fallado");
        }finally {
            escaner.close();
        }
    }
}

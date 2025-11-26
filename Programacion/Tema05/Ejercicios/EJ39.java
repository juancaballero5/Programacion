package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ39 {
    public static void main(String[] args) {
        
        final String BORRAR = "\u001b[2J\u001b[H";

        int numero;
        int incremento = 0;
        int resultado = 0;

        Scanner escaner = new Scanner(System.in);

        try {

            System.out.println(BORRAR);

            System.out.print("Introduzca un número entero positivo: ");
            numero = escaner.nextInt();

            incremento = numero;

            while (resultado < numero + 5) {

                if ((incremento%incremento == 0) && (incremento%1 == 0)) {
                    System.out.printf("%d es primo \n",incremento);
                }else{
                    System.out.printf("%d no es primo\n",incremento);
                }
                incremento++;
                resultado = incremento;
            }

        } catch (InputMismatchException e) {

            System.out.println("**Error Se debe introducir un valor de tipo numérico entero positivo");

        } catch (Exception e) {

            System.out.println("**Error Algo ha salido mal");

        } finally {
            escaner.close();
        }


    }
}

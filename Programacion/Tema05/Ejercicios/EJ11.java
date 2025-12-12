package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        
        final String BORRAR = "\u001b[2J\u001b[H";

        int base = 0;
        int exponente = 0;
        int resultado = 0;
        int numero;

        Scanner escaner = new Scanner(System.in);   

        try {
            System.out.println("Cálculo la potencia");

            System.out.print("Introduzca la base:");
            base = escaner.nextInt();

            numero = base;

            System.out.print("Introduzca el exponente:");
            exponente = escaner.nextInt();

            for(int i = 0; i < exponente - 1; i++) {

                resultado = numero * base;

                numero = resultado;
            }

            System.out.printf("%d\u02C4%d = %d",base,exponente,resultado );

        } catch (InputMismatchException e) {

        }catch (Exception e) {

        } finally {
            escaner.close();
        }
    }
}

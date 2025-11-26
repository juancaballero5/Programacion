package Ejercicios;

import java.util.Scanner;

public class EJ60 {
    public static void main(String[] args) {
        
        final String BORAR = "\u001b[2J\u001b[H";

        long numero;

        Scanner escaner = new Scanner(System.in);

        try {
            
            System.out.print("Introduzca un número: ");
            numero = escaner.nextLong();

            

        } catch (Exception e) {
            System.out.println("**Error Algo ha salido mal");
        } finally {
            escaner.close();
        }

    }
}

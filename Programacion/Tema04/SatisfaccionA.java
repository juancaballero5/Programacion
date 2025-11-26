package Tema04;

import java.util.Scanner;

public class SatisfaccionA {
    public static void main(String[] args) {

        int opcion;
        Scanner escaner = new Scanner(System.in);

        System.out.println("Encuenta de satisfacción con el servicio ofrecido:");
        System.out.println("1. Insatisfecho");
        System.out.println("2.Satisfecho");
        System.out.println("3. Muy satisfecho");

        System.out.print("Introduzca tu opcion (1-3):");
        opcion = escaner.nextInt();

        if (opcion == 1) {
            System.out.println("Lamentamos que no este satisfecho. Trabajaremos paa mejorar");
        }else if (opcion == 2) {
            System.out.println("Gracias por su opinión. ¡Nos alegra que este satisfecho!");   
        }else if (opcion == 3){
            System.out.println("¡Excelente! Nos alegra mucho de que este satisfecho");
        }else {
            System.out.println("Opcion no correcta");
        }

        escaner.close();

    }
}

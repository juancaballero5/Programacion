package Ejercicios;

import java.util.Scanner;

public class EJ43 {
     public static void main(String[] args) {

        int altura;
        int anchura;

        Scanner entrada = new Scanner (System.in);

        try {

            System.out.print("Introduce la altura del rectangulo (como minimo 2): ");
            altura = entrada.nextInt();

            System.out.print("Introduce la anchura del rectangulo (como minimo 2): ");
            anchura = entrada.nextInt();

            if ((anchura <= 2) || (altura <= 2)) {
                System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la altura y la anchura es de 2.");

            } else {
                for (int j = 0 ;j < altura ; j++) {
                    for (int i = 0;i< anchura; i++) {
                        if ((j == altura - 1) || (j == 0) || (i == 0) || ( i == anchura - 1 )) {
                            System.out.print("* ");
                        }else {
                            System.out.print("  ");
                        }
                    }

                    System.out.println("");
                }
            }

        }
        catch (Exception excepcion) {
            System.out.println("**ERROR: la aplicación ha fallado.");
        }
     }
}

package Ejercicios;

import java.util.Scanner;

public class EJ60 {
    public static void main(String[] args) {
        
        final String BORRAR = "\u001b[2J\u001b[H";

        long numero;

        long volteado = 0 ;

        Scanner escaner = new Scanner(System.in);

        try {
            
            System.out.print("Introduzca un número: ");
            numero = escaner.nextLong();

            System.out.printf("Dislocando el %d obtenemos el ",numero);

            while (numero > 0) {
                volteado = (volteado * 10) + (numero%10);
                numero /= 10;

                if (volteado%10==9) {
                    volteado --;
                } else {
                    volteado++;
                }
            }

            System.out.printf("%d\n",volteado);

        } catch (Exception e) {
            System.out.println("**Error Algo ha salido mal");
        } finally {
            escaner.close();
        }

    }

    /**
     * Gira un valor numérico
     * @param numero
     * @return
     */
    public static long girarNumero(long numero) {

        long volteado = 0 ;

        while (numero > 0) {
            volteado = (volteado * 10) + (volteado%10);
            numero /= 10;
        }

        return volteado ;
    }

}

package Ejercicios;

import java.util.Scanner;

public class EJ43b {
     public static void main(String[] args) {
        
        static final String SECUENCIA_COLOR = "\033[%dm";
        final String BORRAR = "\u001b[2J\u001b[H";
        final int MINIMO = 3 ;

        int lado;
        int temporal;
        int color;

        Scanner entrada = new Scanner (System.in);

        try {

            System.out.println(BORRAR);

            System.out.print("Introduce la anchura máxima del cuadrado (como minimo 3): ");
            lado = entrada.nextInt();

            temporal = lado;

            //System.out.print("Introduce un color (32-37) : ");
            //color = entrada.nextInt();

            if (lado <= MINIMO) {
                System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la altura y la anchura es de 2.");

            } else {

                while (true) {
                    do {
                        dibujarCuadrado(lado--);
                        Thread.sleep(450);
                        System.out.println(BORRAR);
                    } while (lado >= MINIMO );

                    do {
                        dibujarCuadrado(lado++);
                        Thread.sleep(450);
                        System.out.println(BORRAR);
                    } while (lado < temporal );
                } 
                    
            }
        }
        catch (Exception excepcion) {
            System.out.println("**ERROR: la aplicación ha fallado.");
        }

    
    }

    public static void elegirColor (int color) {

        System.out.printf("\033[%dm",color);

    }


    
    public static void dibujarCuadrado (int lado) {

        for (int j = 0 ;j < lado ; j++) {
            for (int i = 0;i< lado; i++) {
                if ((j == lado - 1) || (j == 0) || (i == 0) || ( i == lado - 1 )) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }
    }
        
    }


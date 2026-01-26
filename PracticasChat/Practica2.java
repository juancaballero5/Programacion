import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {
        
        int numero;
        int opcion;

        Scanner escaner = new Scanner(System.in);

        try {

            do {
                System.out.println("MENÚ");
                System.out.println("===========================================");
                System.out.println("1. Mostrar un numero aleatorio del 1 al 10.");
                System.out.println("2. Mostrar un numero aleatorio del 1 al 20.");
                System.out.println("3. Salir                                  .");
                System.out.println("===========================================");
                System.out.print("Introduzca su opción: ");
                opcion = escaner.nextInt();

                switch (opcion) {
                    case 1:
                        numero = (int) (Math.random() * (10 - 1 + 1)) + 1;

                        System.out.printf("%d \n",numero);

                        break;
                
                    case 2:
                        numero = (int) (Math.random() * (20 - 1 + 1 )) + 1;
                        
                        System.out.printf("%d \n",numero);

                        break;
                
                    case 3:
                        
                        break;
                
                    default:
                        System.out.println("Debe introducir un número del 1 al 3.");
                        break;
                }

            } while (opcion != 3);

        } catch (InputMismatchException e) {
            System.out.println("**Error. Debe introducir un número de tipo entero.");
        } catch (Exception e) {
            System.out.println("**ERROR. El programa ha fallado");
        } finally {
            escaner.close();
        }

    }
}

import java.util.Scanner;
import java.util.InputMismatchException;

public class Practica1 {
    
    public static void main(String[] args) {
        
        int numero = (int) (Math.random() * 11);
        int elegido;

        Scanner escaner = new Scanner (System.in);

        try {

        System.out.println("Adivina el numero (0-10):");
        elegido = escaner.nextInt();

        while (elegido != numero) {
            
            System.out.println("Has fallado, intentelo de nuevo");
            elegido = escaner.nextInt();

        }

        System.out.println("Has acertado el número , muchas gracias por usar este programa.");

        } catch (InputMismatchException e) {
            System.out.println("**Error. Debe introducirse un número entero");
        } catch (Exception e) {
            System.out.println("**ERROR. El programa ha surgido un fallo");
        } finally {
            escaner.close();
        }

    }
}

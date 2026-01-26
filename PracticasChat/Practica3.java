import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {
        
        int numero;
        int veces;

        int suma = 0;
        int par = 0;
        int impar = 0;

        Scanner escaner = new Scanner(System.in);

        try {
            
            System.out.println("¿Cuantos numeros quiere generar?");
            veces = escaner.nextInt();

            for (int i = 0; i != veces; i++) {

                numero = (int) (Math.random() * (100 - 1 + 1)) + 1;

                System.out.printf("%d \n",numero);

                if (numero%2 == 0) {
                    par++;
                } else {
                    impar++;
                }

                suma += numero; 
            }

            System.out.printf("Suma total: %d\n",suma);
            System.out.printf("Numero de pares: %d\n",par);
            System.out.printf("Numero de impares: %d\n",impar);

        } catch (InputMismatchException e) {
            System.out.println("**Error. Debe introducir un número de tipo entero.");
        } catch (Exception e) {
            System.out.println("**ERROR. El programa ha fallado");
        } finally {
            escaner.close();
        }

    }
}
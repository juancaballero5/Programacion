import java.util.Scanner;

public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        int []numero;

        numero = new int[10];

        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduzca 10 valores numericos");

        for( int i = 0; i < 10;i++) {

            System.out.print("Intruduzca el número: ");
            numero[i] = escaner.nextInt();

        } 

        for (int i = 9; i >= 0; i--) {
            System.out.println(numero[i]);
        }

    }

}

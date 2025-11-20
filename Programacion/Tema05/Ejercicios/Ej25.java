package Ejercicios;

public class Ej25 {
    public static void main(String[] args) {

        int numero;
        int temporal;
        int factorial = 1;

        
        System.out.print("Por favor, introduzca un numero entero: ");
        numero = Integer.parseInt(System.console().readLine());

        temporal = numero;

        while (temporal > 1) {
            factorial = factorial * temporal;
            temporal--;
        }


        System.out.printf("%d! = %d\n",numero,factorial);
    }
}

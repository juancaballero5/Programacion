package Fibonacci;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        int repeticiones;
        int numeroAnterior = 0;
        int temp;
        int numero = 1;
        int contador = 0;

        try {

            System.out.println("¿Cuantos terminos de Fibonacci quiere ver?");
            repeticiones = Integer.parseInt(System.console().readLine());

            do {                

                System.out.printf("%d, ",numero + numeroAnterior);
                
                temp = numeroAnterior + numero;

                numeroAnterior = numero;

                numero = temp;

                contador++;

            } while (contador != repeticiones);
            
        } catch (Exception e) {
            System.out.println("**ERROR: El programa ha fallado.");
        }

    }
}

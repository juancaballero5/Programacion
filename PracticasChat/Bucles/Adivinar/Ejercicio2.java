package Adivinar;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        int intentos = 1;
        int numero;
        int codigo = (int) (Math.random() * (100 - 1 + 1) + 1);

        try {

            System.out.println("Adivine el número (1-100)");
            
            do {
                
                System.out.print("Introduzca el numero: ");
                numero = Integer.parseInt(System.console().readLine());

                if (numero != codigo) {
                    System.out.println("Incorrecto.");
                    intentos ++;

                    if (numero > codigo) {
                        System.out.println("El numero que debe adivinar es menor.");
                    } else {
                        System.out.println("El numero que debe adivinar es mayor.");
                    }
                }

            } while (numero != codigo);

            System.out.println("CORRECTO");

        } catch (Exception e) {
            System.out.println("**ERROR: El progama ha fallado.");
        }

    }
}

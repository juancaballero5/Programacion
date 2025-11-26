package Ejercicios;
public class EJ6 {
    public static void main(String[] args) {
        int i = 5;
        int numero = (int) (Math.random() * (100 - 0 + 1)) + 0;
        int intento;

        System.out.println("Estoy pensando un numero del 0 al 100. Tienes 5 intentos para adivinarlo.");
        System.out.print("Introduce un numero: ");
        intento = Integer.parseInt(System.console().readLine());

        while ((intento != numero) || (i < 0)) {
            if (intento < 0 || intento > 100) {
                System.out.println("**Error numero introducido no valido");

                if (intento < numero) {
                    System.out.printf("El numero en el que estoy pensando es mayor que %d \n", intento);
                } else if (intento > numero) {
                    System.out.printf("El numero en el que estoy pensando es menor que %d \n", intento);
                }

                System.out.printf("Te quedan %d intentos.\n", i);
                System.out.print("Introduce un numero: ");
                intento = Integer.parseInt(System.console().readLine());
                i--;
            }
        }
        if (i == 0) {
            System.out.printf("Lo siento, no has adivinado el numero. Era el %d\n", numero);
        } else {
            System.out.printf("Enhorabuena! Has adivinado el numero %d\n", numero);
        }

    }
}

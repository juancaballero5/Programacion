import java.util.Scanner;

public class Saludo {

    public static void main(String[] args) {
        // 1. Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir al usuario que ingrese su nombre
        System.out.print("Por favor, introduce tu nombre: ");

        // 3. Leer el nombre ingresado por el usuario
        String nombre = scanner.nextLine();

        // 4. Mostrar un saludo personalizado
        System.out.println("¡Hola, " + nombre + "!");

        // 5. Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
package Ejercicios.EJ11;

public class Portero {
    public static void main(String[] args) {
        
        int edad;
        String nombre;

        if (args.length == 2) {
            
            nombre = args[0];
            edad = Integer.parseInt(args[1]);
            
            System.out.printf("Hola " + nombre + " tienes " + edad + " años. ");

            if (edad > 18) {
                System.out.printf("Puedes pasar.\n");
            } else {
                System.out.printf("Lo siento, no puedes pasar.\n");
            }

        } else {
            System.out.println("ERROR: debes introducir dos argumentos.");
            System.out.println("USO: java Portero <nombre> <edad>");
        }

    }
}

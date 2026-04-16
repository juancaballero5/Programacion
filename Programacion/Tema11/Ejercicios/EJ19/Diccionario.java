package Ejercicios.EJ19;

import java.io.File;

public class Diccionario {
    public static void main(String[] args) {

        String fichero = "";

        if (args.length == 1) {
            
            fichero = args[0];

            

        } else {
            System.out.println("ERROR: debe introducirse solo un argumento con el nombre del fichero.");
        }
    }

    public void menu() {
        System.out.println("1. Buscar palabra");
        System.out.println("2. Añadir palabra");
        System.out.println("3. Salir");
    }
}

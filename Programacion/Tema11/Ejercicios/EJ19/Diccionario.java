package Ejercicios.EJ19;

import java.io.BufferedReader;
<<<<<<< HEAD
import java.io.File;
=======
import java.io.Console;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
>>>>>>> 9e71472cee988e354381ddb5b56c89e6bce3b120

public class Diccionario {
    public static void main(String[] args) {

        String fichero = "";
        String linea = "";
        String palabra;
        String traducción;
        int eleccion = 0;

        if (args.length == 1) {
            
            fichero = args[0];

<<<<<<< HEAD
            BufferedReader 
=======
            while (eleccion != 3) {

                menu();
                eleccion = Integer.parseInt(System.console().readLine());
                
                switch (eleccion) {
                    case 1:

                    try {
                
                        BufferedReader br = new BufferedReader(new FileReader(fichero));
                        
                        HashMap<String,String> traducciones = new HashMap<>();

                        while ( linea  != null) {

                            linea = br.readLine();
                            String[] palabrasLinea = linea.split("\\s+");

                            for(String item : palabrasLinea) {
                                System.out.println(item);
                            }

                            traducciones.put(palabrasLinea[0], palabrasLinea[3]);
                        }

                        // System.out.print("Palabra:");
                        // palabra = System.console().readLine();
        
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                
                    default:
                        System.out.println("ERROR: los unicos valores validos son 1,2 o 3.");
                        break;
                }
            }

            try {
                
                BufferedReader br = new BufferedReader(new FileReader(fichero));

            } catch (Exception e) {
                // TODO: handle exception
            }
>>>>>>> 9e71472cee988e354381ddb5b56c89e6bce3b120

        } else {
            System.out.println("ERROR: debe introducirse solo un argumento con el nombre del fichero.");
        }
    }

    public static void menu() {
        System.out.println("1. Buscar palabra");
        System.out.println("2. Añadir palabra");
        System.out.println("3. Salir");
        System.out.print("Elección:");
    }
}

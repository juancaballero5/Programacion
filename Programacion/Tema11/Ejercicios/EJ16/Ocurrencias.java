package Ejercicios.EJ16;

import java.io.*;

public class Ocurrencias {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("ERROR: debes introducir dos argumentos.");
            System.out.println("Uso: java Ocurrencias <nombre_fichero> <palabra>");
            return;
        }

        String nombreFichero = args[0];
        String palabra = args[1];
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String p : palabras) {
                    if (p.equalsIgnoreCase(palabra)) {
                        contador++;
                    }
                }
            }
            System.out.println("La palabra \"" + palabra + "\" aparece " + contador + " vez/veces en el fichero.");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: no se encontró el fichero \"" + nombreFichero + "\".");
        } catch (IOException e) {
            System.out.println("ERROR: al leer el fichero: " + e.getMessage());
        }
    }
}

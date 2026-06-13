package Ejercicio4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej4 {
    public static void main(String[] args) {

        String archivo;
        int numeroLineas = 0;
        int numeroPalabras = 0;
        int numeroCaracteres = 0;

        try {
            
            System.out.print("Introduzca el archivo: ");
            archivo = System.console().readLine();

            BufferedReader br = new BufferedReader(new FileReader(archivo));

            String linea = "";

            do {
                linea = br.readLine();
                
                if (linea !=null) {
                    numeroLineas++;
                    numeroCaracteres += linea.length();
                }

                if ((linea != null) && (!linea.trim().isEmpty())) {
                numeroPalabras += linea.trim().split("\\s+").length;
                }

            } while (linea !=null);

            System.out.printf("Total de líneas leídas: %d\n",numeroLineas);
            System.out.printf("Total de palabras: %d\n",numeroPalabras);
            System.out.printf("Total de caracteres: %d\n",numeroCaracteres);

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("**ERROR: El archivo no ha sido encontrado.");
        } catch  (IOException e) {
            System.out.println("**ERROR: El archivo no ha sido posible de leer.");
        }
    }
}

package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EJ2 {
    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea = "";

            do {
                System.out.println(linea);
                linea = br.readLine();
            } while (linea != null);
            
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("**ERROR: El archivo no ha sido encontrado.");
        } catch (IOException ioe) {
            System.out.println("**ERROR: El archivo no hapodio ser leido.");
        } catch (Exception e) {
            System.out.println("**ERROR: El programa ha fallado.");
        }
    }
}

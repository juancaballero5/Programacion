package Ejercicios.EJ2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        try {
            
            FileReader archivo = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(archivo);

            String linea = "";

            do {
                System.out.println(linea);
                linea = br.readLine();
            } while (linea !=null);

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) {
            System.out.println("No se puede leer el fichero datos.txt");
        }
    }
}

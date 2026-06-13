package Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EJ3 {
    public static void main(String[] args) {

        String archivo;

        try {

            System.out.print("Introduzca el archivo que quiere copiar:");
            archivo = System.console().readLine();
            
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            BufferedWriter bw = new BufferedWriter(new FileWriter("destino.txt"));

            String linea = "";

            do {
                if (linea != null && linea != "") {
                    bw.write(linea + "\n");
                }

                linea = br.readLine();
                
            } while (linea != null);

            bw.close();
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("**ERROR: El archivo no ha sido encontrado.");
        } catch (IOException e) {
            System.out.println("**ERROR: El archivo no ha podido leerse.");
        }
    }
}

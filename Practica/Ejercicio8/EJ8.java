package Ejercicio8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class EJ8 {
    public static void main(String[] args) {
        
        String nombreArchivo;

        try {
            
            System.out.print("Introduzca el nombre del archivo que quiere ordenar (sin .txt): ");
            nombreArchivo = System.console().readLine();

            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo + ".txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo+ "_sort.txt"));

            ArrayList<String> palabras = new ArrayList<>();

            do {
                palabras.add(br.readLine());

            } while (br.readLine() != null);

            Collections.sort(palabras);

            for (String item : palabras) {
                bw.write(item + "\n");
            }

            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("**ERROR: El archivo no ha sido encontrado.");
        } catch (IOException e) {
            System.out.println("**ERROR: El archivo no ha podido ser encontrado.");
        }
    }
}

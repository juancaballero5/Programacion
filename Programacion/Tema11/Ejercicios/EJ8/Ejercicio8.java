package Ejercicios.EJ8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio8 {
    public static void main(String[] args) {

        String nombre;

        System.out.print("Introduzca el fichero que quiere ordenar de manera alfabetica:");
        nombre = System.console().readLine();
        
        try {

            BufferedReader br = new BufferedReader(new FileReader(nombre + ".txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombre + "_sort.txt"));

            String linea = "";
            ArrayList<String> palabras = new ArrayList<>();

            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {       
                    palabras.add(linea.trim());
                }
            }

            Collections.sort(palabras, String.CASE_INSENSITIVE_ORDER);

            for (String palabra : palabras) {
                bw.write(palabra);
                bw.newLine();
            }

            br.close();
            bw.close();
            
        } catch (FileNotFoundException  e) {
            System.out.println("**ERROR, el fichero no ha sido encontrado.");
        } catch (IOException e) {
            System.out.println("**ERROR, el fichero no ha podido leerse correctamente.");
        }
    }
}

package Ejercicios.EJ8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

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

            while (linea != null) {
                linea = br.readLine();
                palabras.add(linea);
            }

            
            
        } catch (Exception e) {
            
        }
    }
}

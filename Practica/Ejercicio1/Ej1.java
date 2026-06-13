package Ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ej1 {
    public static void main(String[] args) {
        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt"));

            bw.write("Hola, este es un archivo de prueba.\n");
            bw.write("Estamos aprendiendo a escribir archivos en Java.\n");
            bw.write("Cada linea representa un dato diferente.\n");

            bw.close();

        } catch (Exception e) {
            System.out.println("**ERROR: El programa ha fallado.");
        }
    }
}

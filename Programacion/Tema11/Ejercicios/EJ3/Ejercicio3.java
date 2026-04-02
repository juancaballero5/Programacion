package Ejercicios.EJ3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio3 {
    public static void main(String[] args) {

        String nombre ;
        String linea = "" ;

        try {

            System.out.print("Introduzca el nombre del archivo:");
            nombre = System.console().readLine();
            nombre = nombre + ".txt";

            FileWriter archivoDestino = new FileWriter("destino.txt");
            FileReader archivoACopiar = new FileReader(nombre );
            BufferedWriter bw = new BufferedWriter(archivoDestino);
            BufferedReader br = new BufferedReader(archivoACopiar);

            do {
                bw.write(linea);
                linea = br.readLine();
                bw.write("\n");
            } while (linea !=null);

            br.close();
            bw.close();
            
        } catch (Exception e) {
            System.out.println("**ERRROR");
        }
    }
}

package Ejercicio7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej7 {
    public static void main(String[] args) {
        try {

            BufferedReader brOrigen1 = new BufferedReader(new FileReader(args[0])); 
            BufferedReader brOrigen2 = new BufferedReader(new FileReader(args[1]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));

            String linea1 = "";
            String linea2 = "";

            do {

                linea1 = brOrigen1.readLine();
                linea2 = brOrigen2.readLine();

                bw.write(linea1 + "\n");
                bw.write(linea2 + "\n");
                
            } while (linea1 != null && linea2 != null);
            
            bw.close();
            brOrigen1.close(); 
            brOrigen2.close(); 

        } catch (FileNotFoundException e) {
            System.out.println("**ERROR: Algun archivo origen no ha sido encontrado.");
        } catch (IOException e) {
            System.out.println("**ERROR: No ha podido ser leido algun archivo origen.");
        }
    }
}

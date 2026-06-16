package Ejercicio16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EJ16 {
    public static void main(String[] args) {
        
        String palabra;
        String linea = "";
        String[] palabras;
        int ocurrencias = 0;

        try {
            
            if (args.length != 2) {
                System.out.println("ERROR: Debes introducir dos argumentos.");
                System.out.println("Uso: java Ocurrencias <nombre_fichero> <palabra>");
            } else {
                
                BufferedReader br = new BufferedReader(new FileReader(args[0]));
                palabra = args[1];

                while ((linea = br.readLine()) != null) {
                    palabras = linea.trim().split("\\s+");

                    for (int i = 0; i < palabras.length; i++) {
                        
                        if (palabras[i].equalsIgnoreCase(palabra)) {
                            ocurrencias++;
                        }
                    }
                    
                }

                System.out.printf("El numero de ocurrencias de las palabras %s son : %d",palabra,ocurrencias);

                br.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("**ERROR: El archivo no ha sido encontrado.");
        } catch (IOException e) {
            System.out.println("**ERRROR: El archivo no ha podido ser leido.");
        }
    }
}

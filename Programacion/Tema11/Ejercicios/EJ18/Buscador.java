package Ejercicios.EJ18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buscador {
    public static void main(String[] args) {
        
        String palabra;
        String fichero;
        
        if (args.length == 2) {

            palabra = args[0];
            fichero = args[1];

            if (!palabra.contains(" ")) {
                try {
                    
                    String linea = "";
                    int contador = 0;

                    BufferedReader br = new BufferedReader(new FileReader(fichero));

                    while (linea != null) {
                        
                        linea = br.readLine();
                        contador++;

                        if (linea.contains(palabra)) {
                            System.out.printf("Linea %d: %s \n",contador,linea);
                        }

                    }

                    br.close();

                } catch (FileNotFoundException  e) {
                    System.out.println("**ERROR, el fichero no ha sido encontrado.");
                } catch (IOException e) {
                    System.out.println("**ERROR, el fichero no ha podido leerse correctamente.");
                }

            } else {
                System.out.println("ERROR: debe introducir una palabra estrictamente");
            }


        } else {

            System.out.println("ERROR: debe introducir 2 argumentos por linea de comadno.");
            System.out.println("Uso: java Buscador <palabra> <fichero>.");

        }


    }
}

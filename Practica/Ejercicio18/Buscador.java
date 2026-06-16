package Ejercicio18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Buscador {
    public static void main(String[] args) {

        int contador = 0;
        
        if (args.length != 2) {
            System.out.println("**Error: debe introducirse 2 argumentos");
            System.out.println("Ejemplo: java Buscador.java \"<Palabra>\" <archivo> .");
        } else {
            
            try {
            
                BufferedReader br = new BufferedReader(new FileReader(args[1]));
                String linea = "";
                String patron = ".*\\b" + Pattern.quote(args[0]) + "\\b.*";

                while ((linea = br.readLine()) != null) {
                    contador++;
                    if (linea.matches(patron)) {
                        System.out.printf("Línea %d: %s\n", contador, linea);
                    }
                }

                br.close();

            } catch (FileNotFoundException e) {
                System.out.println("**Error: El archivo no existe o no ha sido encontrado.");
            } catch (IOException e) {
                System.out.println("**Error: El archivo no ha podido ser leido.");
            }

        }
    }
}

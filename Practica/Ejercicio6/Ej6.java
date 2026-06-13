package Ejercicio6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej6 {
    public static void main(String[] args) {
        try {
            
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
            BufferedWriter bwPar = new BufferedWriter(new FileWriter("pares.dat"));
            BufferedWriter bwImpar = new BufferedWriter(new FileWriter("impares.dat"));

            String linea = "";
            int numero;

            do {

                linea = br.readLine();

                if (linea != null) {
                    
                    numero = Integer.parseInt(linea);
    
                    if (par(numero)) {
                        bwPar.write(numero+ "\n");
                    } else {
                        bwImpar.write(numero + "\n");
                    }

                }

            } while (linea != null);

            br.close();
            bwImpar.close();
            bwPar.close();

        } catch (FileNotFoundException e) {
            System.out.println("**ERROR: El archivo no ha sido encontrado.");
        } catch (IOException e) {
            System.out.println("**ERROR: El archivo no ha podido ser leido.");
        }
    }

    public static boolean par(int numero) {

        boolean resultado = false;

        if (numero % 2 == 0) {
            resultado = true;
        }

        return resultado;

    }

}

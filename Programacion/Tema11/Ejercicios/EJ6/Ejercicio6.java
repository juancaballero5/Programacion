package Ejercicios.EJ6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio6 {
    public static void main(String[] args) {

        String linea = "";
        
        try {
            
            FileReader primos = new FileReader("primos.dat");
            BufferedReader br = new BufferedReader(primos);
            BufferedWriter bwPares = new BufferedWriter(new FileWriter("pares.dat"));
            BufferedWriter bwImpares = new BufferedWriter(new FileWriter("impares.dat"));

            while ((linea = br.readLine()) != null) { // ← lee y comprueba null a la vez
                
                if (!linea.isEmpty()) {
                    int numero = Integer.parseInt(linea.trim());

                    if (esPar(numero)) {
                        bwPares.write(numero + "\n");
                    } else {
                        bwImpares.write(numero + "\n");
                    }
                }
            }

            bwImpares.close();
            bwPares.close();
            br.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean esPar(int numero) {

        boolean respuesta = false;

        if (numero % 2 == 0) {
            respuesta = true;
        }

        return respuesta;
    }
}

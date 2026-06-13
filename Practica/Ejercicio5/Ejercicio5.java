package Ejercicio5;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5 {

    static int MAXIMO = 500;
    public static void main(String[] args) {
        
        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

            for (int i = 0; i < MAXIMO; i++) {
                if (esPrimo(i)) {
                    bw.write(i + "\n");
                }
            }

            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("**ERROR: El archivo no ha sido encontrado.");
        } catch (IOException e) {
            System.out.println("**ERROR: El archivo no ha sido leido.");
        }

    }

    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

package Ejercicios.EJ5;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ejercicio5 {
    
    public final static int MAX = 500;
    public static void main(String[] args) {
        
        int numero;

        try {

            FileWriter archivo = new FileWriter("primos.dat");
            BufferedWriter bw = new BufferedWriter(archivo);

            for (int i = 2; i <= MAX; i++) {
                if (esPrimo(i)) {
                    bw.write(i + "\n");
                }
            }

            bw.close();

        } catch (Exception e) {
            System.out.println("**ERROR" + e.getMessage());
        }

    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;

        for (int j = 2; j <= Math.sqrt(numero); j++) {  // ← empieza en 2, no en 1
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }
}

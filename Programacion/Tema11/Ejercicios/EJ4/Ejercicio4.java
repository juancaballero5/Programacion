package Ejercicios.EJ4;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        String linea = "";
        int totalLineas = -1;
        int palabras = 0;
        int totalCaracteres = 0;
        int caracter;
    
        try {
            
            FileReader archivo = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(archivo);

            do {
                totalLineas++;
                linea = br.readLine();

                if (linea !=null) {
                    totalCaracteres += linea.length();
                }

                if ((linea != null) && (!linea.trim().isEmpty())) {
                palabras += linea.trim().split("\\s+").length;
                }

            } while (linea !=null);


            System.out.printf("Total líneas leídas : %d\n",totalLineas);
            System.out.printf("Total de palabras : %d\n",palabras);
            System.out.printf("Total de caracteres : %d\n",totalCaracteres);

        } catch (Exception e) {
            System.out.println("**ERROR");
        }

    }    
}
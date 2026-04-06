package Ejercicios.EJ7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio7 {
    public static void main(String[] args) {

        try {
            
            BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
            BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));

            String linea1 = "";
            String linea2 = "";

            while ((linea1 != null || linea2 != null )) {
                
                linea1 = br1.readLine();
                linea2 = br2.readLine();

                if (linea1 != null) {
                    bw.write(linea1 + "\n");
                }

                if (linea2 != null) {
                    bw.write(linea2 + "\n");
                }

            }

            bw.close();
            br1.close();
            br2.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

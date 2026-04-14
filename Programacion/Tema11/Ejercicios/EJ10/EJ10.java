package Ejercicios.EJ10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EJ10 {
    public static void main(String[] args) {

        String urlCopia = "";
        String urlDestino = "";
        String respuesta = "";
        String linea = "";

        System.out.print("Introduzca la ruta del directorio que desee copiar:");
        urlCopia = System.console().readLine();

        System.out.print("Introduzca la ruta del directorio que desee introducir la copia:");
        urlDestino = System.console().readLine();

        try {
            
            File f1 = new File(urlCopia);
            File f2 = new File(urlDestino);

            if (f1.exists()) {
                
                if (f2.exists()) {
                    
                    System.out.println("El fichero de copia que ha introducido ya tiene contenido, ¿Desea sobreescribir? (Si/No):");
                    respuesta = System.console().readLine();

                    if (respuesta.toLowerCase().charAt(0) == 's') {
                        
                        BufferedReader br = new BufferedReader(new FileReader(f1));
                        BufferedWriter bw = new BufferedWriter(new FileWriter(f2));

                        while ((linea = br.readLine()) != null) {
                            if (!linea.trim().isEmpty()) {       
                                bw.write(linea);
                            }
                        }

                        bw.close();
                        br.close();

                    } else {
                        System.out.println("La copia ha sido cancelada. El archivo de destino no se ha modificado.");
                    }
                }

            } else {
                System.out.println("Lo sentimos, no se enncuentra el directorio origen.");
            }

        } catch (FileNotFoundException  e) {
            System.out.println("**ERROR, el fichero no ha sido encontrado.");
        } catch (IOException e) {
            System.out.println("**ERROR, el fichero no ha podido leerse correctamente.");
        }
    }
}

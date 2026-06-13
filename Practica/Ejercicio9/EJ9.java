package Ejercicio9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class EJ9 {
    public static void main(String[] args) {
        
        String ruta;
        String respuesta;
        String archivo;
        
        // try {

            System.out.println("Introduzca la ruta del directorio: ");
            ruta = System.console().readLine();

            File f = new File(ruta);

            if (!f.exists()) {
                System.out.println("Lo sentimos, pero la ruta introducida no existe");
            } else {
                String[] listado = f.list();

                System.out.println("Listado de elementos: ");
    
                for (String item : listado) {
                    System.out.println(item.contains(".")? item + " Archivo": item + " carpeta");
                }

                System.out.println("¿Desea borrar algun archivo?(s/n)");
                respuesta = System.console().readLine().toLowerCase();

                if (respuesta.contains("n")) {
                    System.out.println("Okay, saliendo del programa.");
                } else {
                    
                    System.out.print("Introduzca el archivo que quiere borrar: ");
                    archivo = System.console().readLine();

                    if (!archivo.contains(".")) {
                        System.out.println("Lo sentimos, ese archivo no es un archivo, es una carpeta.");
                    } else {

                        File fBorrar = new File(ruta + archivo);
                        
                        fBorrar.delete();
                        System.out.println("El archivo ha sido borrado correctamente.");
                        
                    }
                    

                }

            }

        // } catch (Exception e) {
        //     System.out.println("**ERROR: El archivo no ha sido encontrado.");
        // } catch (IOException e) {
        //     System.out.println("**ERROR: El archivo no se ha podido leer.");
        // }
    }

}
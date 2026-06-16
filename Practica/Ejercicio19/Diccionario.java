package Ejercicio19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    public static void main(String[] args) {

        boolean salir = false;
        String linea = "";
        String palabra;
        String palabraAnadir;
        String traduccionAnadir;
        int respuesta;
        String[] palabras;

        ArrayList<String> palabrasArchivo = new ArrayList<>();
        HashMap<String,String> traduccion = new HashMap<>();
        
        if (args.length < 1 || args.length > 3) {
            System.out.println("Error: El programa solo puede recibir un argumento por linmea de comando.");
            System.out.println("Ejemplo de uso: java Diccionario <archivo>");
        } else if(args.length == 1 ) {

            try {

                BufferedReader br = new BufferedReader(new FileReader(args[0]));

                while ((linea = br.readLine()) != null) {
                    palabras = linea.trim().split("-");
                    palabrasArchivo.add(palabras[0]);

                    traduccion.put(palabras[0],palabras[1]);

                }

                br.close();
                
            } catch (FileNotFoundException e) {
                System.out.println("ERROR: el archivo indicado no existe.");
            } catch (IOException e) {
                System.out.println("ERROR: El archivo no ha podido ser leido.");
            }

            while (!salir) {
                
                menu();
                respuesta = Integer.parseInt(System.console().readLine());

                switch (respuesta) {
                    case 1:
                        // Función de buscar palabra
                        System.out.print("Palabra: ");
                        palabra = System.console().readLine().toLowerCase();

                        if (traduccion.get(palabra) != null) {
                            System.out.println("Traducción: " + traduccion.get(palabra));
                        } else {
                            System.out.printf("Lo siento, no se ha encontrado la palabra \"%s\" en el diccionario\n",palabra);
                        }

                        break;
                    case 2:
                        // Función de añadir palabra
                        
                        System.out.print("Palabra español: ");
                        palabraAnadir = System.console().readLine();
                        System.out.print("Traducción al ingles: ");
                        traduccionAnadir = System.console().readLine();

                        if (traduccion.containsKey(palabraAnadir)) {
                            System.out.printf("La palabra \"%s\" ya existe en el disccionario.\n",palabraAnadir);
                        } else {
                            traduccion.put(palabraAnadir,traduccionAnadir);
                            System.out.println("La palabra se ha guardado correctamente en el diccionario");
                        }

                        break;
                    case 3:
                        // Función de salir
                        try {
                            
                            BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]));
                            
                            for (Map.Entry pareja: traduccion.entrySet()) {
                                
                                bw.write(pareja.getKey() + "-" + pareja.getValue() + "\n");
                                
                            }

                            bw.close();
                            
                        } catch (FileNotFoundException e) {
                            System.out.println("**Error: El archivo no ha sido encontrado.");
                        } catch (IOException e) {
                            System.out.println("**Error. El archivo no ha sido leido.");
                        }

                        salir = true;

                        break;
                
                    default:
                        System.out.println("Opción erronea.");
                        break;
                }

            }

        } else {

            try {

                BufferedReader br = new BufferedReader(new FileReader(args[0]));

                while ((linea = br.readLine()) != null) {
                    palabras = linea.trim().split("-");
                    palabrasArchivo.add(palabras[0]);

                    traduccion.put(palabras[0],palabras[1]);

                }

                if (traduccion.containsKey(args[1])) {
                    System.out.printf("La palabra \"%s\" ya existe en el disccionario.\n",args[1]);
                } else {
                    traduccion.put(args[1],args[2]);
                    System.out.println("La palabra se ha guardado correctamente en el diccionario");
                }

                br.close();
                
            } catch (FileNotFoundException e) {
                System.out.println("ERROR: el archivo indicado no existe.");
            } catch (IOException e) {
                System.out.println("ERROR: El archivo no ha podido ser leido.");
            }

        }

    }

    public static void menu() {
        System.out.println("1. Buscar palabra");
        System.out.println("2. Añadir palabra");
        System.out.println("3. Salir");
        System.out.print("Opción: ");
    }
}

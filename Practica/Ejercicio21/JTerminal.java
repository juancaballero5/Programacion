package Ejercicio21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JTerminal {
    public static void main(String[] args) {

        String linea;

        if (args.length < 2 || args.length > 3) {
            System.out.println("Error: debe introducir entre 2 o 3 argumentos.");
            System.out.println("Ejemplo: JTerminal.java <orden> <ruta>.");
        } else {

            try {

                File f = new File(args[1]);

                if (args.length == 2) {
                    
                    switch (args[0]) {
                        case "info":
    
                            if (!f.exists()) {
                                System.out.println("[ERROR] La ruta especificada no existe.");
                            } else {
    
                                System.out.printf("[INFO] Nombre: %s\n",f.getName());
                                
                                if (f.isFile()) {
                                    System.out.println("[INFO] Tipo: Archivo");
                                } else {
                                    System.out.println("[INFO] Tipo: Carpeta");
                                }
    
                                System.out.println("[INFO] Tamaño: " + f.length() + " bytes");
                                System.out.printf("[INFO] Permisos: Lectura (%s) | Escritura (%s)\n",f.canRead()?"SI":"NO",f.canWrite()?"SI":"NO");
    
                            }
    
    
                            
                            
                            break;
                        case "creardir":
                            
                            if (f.exists()) {
                                System.out.println("[ERROR] La carpeta especificada ya existe.");
                            } else {
                                f.mkdir();
                                System.out.println("[ÉXITO] Carpeta creada correctamente.");
                            }
                            
                            break;
                        case "leer":
                            
                            if (!f.exists()) {
                                System.out.println("[ERROR] La ruta especificada no existe.");
                            } else {
                                if (!f.isFile()) {
                                    System.out.println("[ERROR] El archivo de la ruta especificada no es un archivo de texto ");
                                } else {
                                    BufferedReader br = new BufferedReader(new FileReader(f));
                                    linea = "";
    
                                    System.out.printf("--- CONTENIDO DE %s ---\n",f.getName());
    
                                    while ((linea = br.readLine()) != null) {
                                        System.out.println(linea);
                                    }
    
                                    System.out.println("---------------------------");

                                    br.close();
    
                                }
                            }
    
                            break;
                        
                        default:
                            System.out.println("ERROR: Comnado no reconocido.");
                            break;
                    }
                } else {

                    BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                    
                    if (args[0] != "escribir") {
                        System.out.println("Los comandos disponibles son :info, creardir, escribir y leer");
                    } else {
                        if (f.exists()) {
                            BufferedReader br = new BufferedReader(new FileReader(f));

                            while ((linea = br.readLine()) != null) {
                                
                                bw.write(linea);

                            }

                            br.close();

                        } 

                        bw.write(args[2]);

                        System.out.printf("[ÉXITO] Texto añadido a %s correctamente.\n",f.getName());

                        bw.close();

                    }

                }

            
            } catch (FileNotFoundException e) {
                System.out.println("**ERROR: El programa no ha encontrado el archivo.");
            } catch (IOException e){
                System.out.println("***ERROR: El archivo no ha podido ser leido.");
            }
            
        }

    }
}

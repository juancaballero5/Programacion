
/**
 * EvilRank (examen 04/06/26)
 *
 * Este fichero contiene la estructura base de la aplicación principal.
 * Debes completarlo según el enunciado. 
 * Requisitos previos: clases Villano y Mision en el paquete clases.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import Villano;
import Mision;

public class EvilRank {

    private static final String BORRAR_PANTALLA = "\033[H\033[2J";

    /**
     * Método principal.
     * 
     * @param args
     */
    public static void main(String[] args) {

        if (args.length <= 0 || args.length > 2) {
            System.out.println("EvilRank necesita parámetros: colsulta ayuda.");
        } else {

            if (args[0] == "--ayuda") {
                mostrarAyuda();
            } else {
                
                try {
                    
                    BufferedReader br = new BufferedReader(new FileReader(args[0]));
                    ArrayList<Villano> villanosDisponibles = new ArrayList<>();
                    ArrayList<Mision> misiones = new ArrayList<>();

                    String linea = "";
                    int contador = 1;

                    while ((linea = br.readLine()) != null) {
                        String[] partes = linea.split(";");

                        villanosDisponibles.add(new Villano(partes[0],partes[1],partes[2],Integer.parseInt(partes[3])));
                    }
                
                    Scanner sc = new Scanner(System.in);
                    boolean salir = false;

                    String codigo;
                    String aliasVillano;
                    String titulo;
                    int dificultad;
                    boolean existeMision = false;
                    boolean existeVillano = false;
            
                        while (!salir) {
            
                            // Limpiar la pantalla
                            System.out.print(BORRAR_PANTALLA);
            
                            // Mostrar el menú
                            mostrarMenu();
            
                            // Solicitar la opción al usuario
                            System.out.print("Opción: ");
                            String opcion = sc.nextLine().trim();
            
                            switch (opcion) {
                                case "1":   
                                
                                if (villanosDisponibles.size() < 0) {
                                    System.out.println("No hay villanos registrados.");
                                } else {
                                    for (Villano item:villanosDisponibles) {
                                        System.out.println(contador + ". " + item);
                                        contador++;
                                    }
                                    contador = 1;
                                }
                                    break;
                                case "2":
                                    System.out.println("\033[1m CREAR MISIÓN \033[0m");
                                    System.out.print("Código de la misión: ");
                                    codigo = sc.nextLine();
                                    System.out.print("Título de la misión: ");
                                    titulo = sc.nextLine();
                                    System.out.print("Código de la misión: ");
                                    dificultad = sc.nextInt();

                                    if (dificultad > 5 || dificultad < 1) {
                                        System.out.println("Error: la dificultad debe estar entre 1 y 5.");
                                        System.out.println("La misión no se ha creado.");
                                    } else {
                                        misiones.add(new Mision(codigo, titulo, dificultad));
                                        System.out.println("Misión creada correctamente.");
                                    }

                                    break;
                                case "3":
                                    if (misiones.size() < 0) {
                                        System.out.println("No hay misiones registradas.");
                                    } else {
                                        System.out.println("\033[1mMISIONES REGISTRADAS\033[0m");
                                        for (Mision item : misiones) {
                                            System.out.println(contador + ". " + item);
                                            contador++;
                                        }
                                        contador = 1;
                                    }
                                    break;
                                case "4":
                                    System.out.println("AÑADIR VILLANO A MISIÓN");
                                    System.out.print("Código de la misión: ");
                                    codigo = sc.nextLine();
                                    System.out.print("Alias del villano: ");
                                    aliasVillano = sc.nextLine();

                                    for (Mision item : misiones) {
                                        if (item.getCodigo() == codigo) {
                                            existeMision = true;
                                        } 
                                    }

                                    if (!existeMision) {
                                        System.out.println("Error: no existe ninguna misión con ese código.");
                                    } else {
                                        for (Villano villano : villanosDisponibles) {
                                            if (villano.getAlias() == aliasVillano) {
                                                existeVillano = true;
                                            }
                                        }

                                        if (!existeVillano) {
                                            System.out.println("Error: no existe ningún villano con ese alias.");
                                        } else {
                                            for (Mision item : misiones) {
                                                if (item.getCodigo() == codigo) {
                                                    for (Villano villano : villanosDisponibles) {
                                                        if (villano.getAlias() == aliasVillano) {
                                                            item.anadirVillano(villano);
                                                        }
                                                    }
                                                } 
                                            }
                                        }

                                    }
                                    break;
                                case "5":
                                    
                                    System.out.println("RESUMEN DE MISIONES - EVILRANK");
                                    System.out.print("Código: ");
                                    codigo = sc.nextLine();

                                    for (Mision item : misiones) {
                                        if (item.getCodigo() == codigo) {
                                            existeMision = true;
                                        } 
                                    }

                                    if (!existeVillano) {
                                        System.out.println("Error: no existe ninguna misión con ese código.");
                                    } else {
                                        for (Mision item : misiones) {
                                            if (item.getCodigo() == codigo) {
                                                System.out.println("Título: " + item.getTitulo());
                                                System.out.println("Dificultad: " + item.getDificultad());
                                                System.out.println("Estado: " + item.getEstado());
                                                System.out.println("Villanos asignados:");
                                                item.mostrarParticipantes();
                                                System.out.println("Media de maldad:" + item.calcularMediaMaldad());
                                            } 
                                        }
                                    }

                                    break;
                                case "6":
                                    
                                    if (args[1].contains(".txt")) {
                                        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
                                        ArrayList<Villano> participantes = new ArrayList<>();

                                        for (Mision item : misiones) {
                                            
                                            participantes = item.getParticipantes();

                                            bw.write("Código:" + item.getCodigo() + "\n");
                                            bw.write("Título: " + item.getTitulo() + "\n");
                                            bw.write("Dificultad: " + item.getDificultad() + "\n");
                                            bw.write("Estado: " + item.getEstado() + "\n");
                                            bw.write("Villanos asignados: \n");
                                            for(Villano villano : participantes) {
                                                bw.write(villano + "\n");
                                            }
                                            bw.write("Media de maldad:" + item.calcularMediaMaldad()+ "\n");
                                            
                                        }

                                    } else {
                                        BufferedWriter bw = new BufferedWriter(new FileWriter("resumen_misiones.txt"));
                                        ArrayList<Villano> participantes = new ArrayList<>();

                                        for (Mision item : misiones) {
                                            
                                            participantes = item.getParticipantes();

                                            bw.write("Código:" + item.getCodigo() + "\n");
                                            bw.write("Título: " + item.getTitulo() + "\n");
                                            bw.write("Dificultad: " + item.getDificultad() + "\n");
                                            bw.write("Estado: " + item.getEstado() + "\n");
                                            bw.write("Villanos asignados: \n");
                                            for(Villano villano : participantes) {
                                                bw.write(villano + "\n");
                                            }
                                            bw.write("Media de maldad:" + item.calcularMediaMaldad()+ "\n");
                                            
                                        }
                                        
                                    }
                                    

                                    salir = true;
                                    break;
            
                                default:
                                    System.out.println("Opción no válida.");
                                    System.out.println();
                            }
            
                            if (!salir) {
                                pausa(sc);
                            }
                        }
                        sc.close();

                } catch (FileNotFoundException e) {
                    System.out.println("**ERROR: El archivo no ha sido encontrado ser leido.");
                } catch (IOException e) {
                    System.out.println("**ERROR: El archivo no ha podido ser leido.");
                } 

            }

        }

    }

    /**
     * Muestra el menú principal por pantalla.
     * 
     * @return
     */
    private static void mostrarMenu() {
        System.out.println();
        System.out.println("--- MENÚ PRINCIPAL EVILRANK ---");
        System.out.println("1. Listar villanos disponibles");
        System.out.println("2. Crear misión");
        System.out.println("3. Listar misiones");
        System.out.println("4. Añadir villano a una misión");
        System.out.println("5. Mostrar detalle de una misión");
        System.out.println("6. Guardar resumen y salir");
    }

    /**
     * Muestra la ayuda del programa (--ayuda).
     * 
     * @return
     */
    private static void mostrarAyuda() {
        System.out.println("EvilRank - Escuela Superior de Supervillanía");
        System.out.println();
        System.out.println("Opciones de ejecución:");
        System.out.println();
        System.out.println("java EvilRank --ayuda");
        System.out.println("Muestra la ayuda del programa.");
        System.out.println();
        System.out.println("java EvilRank entrada.txt [salida.txt]");
        System.out.println("Carga los villanos desde el fichero de entrada y abre el menú interactivo.");
        System.out.println("El segundo parámetro (salida.txt) es opcional: fichero donde guardar el resumen al salir.");
        System.out.println("Si no se indica, se usará resumen_misiones.txt por defecto.");
        System.out.println();
        System.out.println("Formato del fichero de villanos:");
        System.out.println("nombre;alias;poder;maldad");
        System.out.println();
    }

    /**
     * Espera a que el usuario pulse Enter y limpia la pantalla.
     * 
     * @param sc
     * @return
     */
    private static void pausa(Scanner sc) {
        System.out.println();
        System.out.println("PULSA ENTER PARA CONTINUAR...");
        sc.nextLine();
    }

}

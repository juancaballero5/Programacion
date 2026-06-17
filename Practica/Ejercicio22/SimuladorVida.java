package Ejercicio22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SimuladorVida {

    public static String BORRAR_PANTALLA = "\033[H\033[2J";
    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.println("[ERROR] Número de argumentos incorrecto.");
            System.out.println("El programa de SimuladorVida necesita exactamente 4 parámetros para funcionar.");
            System.out.println("");
            System.out.println("Uso correcto: \n java SimuladorVida <archivo_entrada> <generaciones> <velocidad> <archivo_salida>");
            System.out.println("");
            System.out.println("Parámetros:\n1.<archivo_entrada>: Ruta del archivo .txt con el estado inicial del tablero.\n2.<generaciones>   : Número entero de turnos simular.");
            System.out.println("3.<velocidad_ms>   : Tiempo de pausa en milisegundos entre cada fotograma.\n4.<archivo_salida> : Ruta del archivo .txt donde se guardará el tablero final.");
            System.out.println("\nEjemplo de uso:\njava SimuladorVida semilla.txt 50 300 resultado.txt\n(Simula 50 turnos de 'semilla.txt a 300ms por turno y guarda en 'resultado.txt')");
        } else {

            try {
                ArrayList<String> lineas = new ArrayList<>();
                BufferedReader br = new BufferedReader(new FileReader(args[0]));
                BufferedWriter bw = new BufferedWriter(new FileWriter(args[3]));
                String linea;

                while ((linea = br.readLine()) != null) {

                    lineas.add(linea);

                }
                br.close();
                char[][] tablero = new char[lineas.size()][lineas.get(1).length()];
                char[][] tableroNuevo = new char[lineas.size()][lineas.get(1).length()];

                for (int i = 0; i < lineas.size(); i++) {
                    for (int j = 0; j < lineas.get(i).length(); j++) {
                        tablero[i][j] = lineas.get(i).charAt(j);
                    }
                }

                
                System.out.println(tablero.length);
                
                for (int i = 0; i < Integer.parseInt(args[1]); i++) {

                    System.out.println(BORRAR_PANTALLA);
                    
                    for (int j = 0; j < tablero.length; j++) {
                        for (int j2 = 0; j2 < lineas.get(0).length(); j2++) {
                            
                            int celulasAlrededor = 0;
                            
                            celulasAlrededor = contadorCelulas(tablero, j, j2, lineas);
                            
                            if (tablero[j][j2] == '*') {
                                
                                if (celulasAlrededor < 2) {
                                    tableroNuevo[j][j2] = '.';
                                } else if (celulasAlrededor > 3) {
                                    tableroNuevo[j][j2] = '.';
                                } else {
                                    tableroNuevo[j][j2] ='*';
                                }
                                
                            } else {
                                if (celulasAlrededor == 3) {
                                    tableroNuevo[j][j2] = '*';
                                } else {
                                    tableroNuevo[j][j2] = '.';
                                }
                            }
                            
                        }
                    }

                    tablero = tableroNuevo;
                    
                    for (int i2 = 0; i2 < lineas.size(); i2++) {
                        for (int h = 0; h < lineas.get(i2).length(); h++) {
                            System.out.printf("%s",tablero[i2][h]);
                        }
    
                        System.out.println("");
                    }

                    if (i == Integer.parseInt(args[1]) - 1) {
                        for (int i2 = 0; i2 < lineas.size(); i2++) {
                            for (int h = 0; h < lineas.get(i2).length(); h++) {
                                bw.write(tablero[i2][h]);
                            }
        
                            bw.write("\n");
                        }
                        bw.close();
                    }

                    Thread.sleep(Long.parseLong(args[2]));

                }



            } catch (FileNotFoundException e) {
                System.out.println("**ERROR: El archivo no ha sido encontrado.");
            } catch (IOException e) {
                System.out.println("**ERROR: El archivo no ha podido ser leido.");
            } catch (InterruptedException e) {
                System.out.println("**ERROR: El programa ha sido interrumpido.");
            }

        }
    }

    public static int contadorCelulas(char[][] tablero,int fila,int colum,ArrayList<String> lineas) {

        int celulas = 0;

        if (comprobarArribaIzq(tablero, fila, colum)) {
            celulas++;
        }

        if (comprobarArribaCentr(tablero, fila, colum)) {
            celulas++;
        }

        if (comprobarArribaDer(lineas, tablero, fila, colum)) {
            celulas++;
        }

        if (comprobarIzq(tablero, fila, colum)) {
            celulas++;
        }

        if (comprobarDer(lineas, tablero, fila, colum)) {
            celulas++;
        }

        if (comprobarAbajoIzq(tablero, fila, colum)) {
            celulas++;
        }

        if (comprobarAbajoCentr(tablero, fila, colum)) {
            celulas++;
        }
        
        if (comprobarAbajoDer(lineas, tablero, fila, colum)) {
            celulas++;
        }

        return celulas;

    }

    public static boolean comprobarArribaIzq(char[][] tablero,int fila, int colum) {

        boolean resultado = false;

        if (fila > 0 && colum > 0) {
            if (tablero[fila-1][colum-1] == '*') {
                resultado = true;
            }
        }

        return resultado;

    }

    public static boolean comprobarArribaCentr(char[][] tablero,int fila, int colum) {

        boolean resultado = false;

        if (fila > 0) {
            if (tablero[fila-1][colum] == '*') {
                resultado = true;
            }
        }

        return resultado;

    }

    public static boolean comprobarArribaDer(ArrayList<String> lineas,char[][] tablero,int fila, int colum) {

        boolean resultado = false;

        if (fila > 0 && colum < lineas.get(0).length() - 1) {
            if (tablero[fila-1][colum+1] == '*') {
                resultado = true;
            }
        }

        return resultado;

    }

    public static boolean comprobarIzq(char[][] tablero,int fila, int colum) {

        boolean resultado = false;

        if (colum > 0 ) {
            if (tablero[fila][colum-1] == '*') {
                resultado = true;
            }
        }

        return resultado;

    }

    public static boolean comprobarDer(ArrayList<String> lineas,char[][] tablero,int fila, int colum) {

        boolean resultado = false;

        if (colum < lineas.get(0).length() - 1) {
            if (tablero[fila][colum+1] == '*') {
                resultado = true;
            }
        }

        return resultado;

    }

    public static boolean comprobarAbajoIzq(char[][] tablero,int fila, int colum) {

        boolean resultado = false;

        if (colum > 0 && fila < tablero.length - 1) {
            if (tablero[fila+1][colum-1] == '*') {
                resultado = true;
            }
        }

        return resultado;

    }

    public static boolean comprobarAbajoCentr(char[][] tablero,int fila, int colum) {

        boolean resultado = false;

        if (fila < tablero.length - 1) {
            if (tablero[fila+1][colum] == '*') {
                resultado = true;
            }
        }

        return resultado;

    }

    public static boolean comprobarAbajoDer(ArrayList<String> lineas,char[][] tablero,int fila, int colum) {

        boolean resultado = false;

        if (colum < lineas.get(1).length() - 1 && fila < tablero.length - 1) {
            if (tablero[fila+1][colum+1] == '*') {
                resultado = true;
            }
        }

        return resultado;

    }
}

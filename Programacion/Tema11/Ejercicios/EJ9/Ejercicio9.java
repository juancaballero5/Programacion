package Ejercicios.EJ9;

import java.io.File;

public class Ejercicio9 {
    public static void main(String[] args) {

        String url = "";
        String borrado = "";

        System.out.print("Introduzca la ruta del directorio que desee:");
        url = System.console().readLine();

        try {
            
            File f = new File(url);

            if (f.exists()) {
                
                String[] listaDirectorio = f.list();

                for (String item: listaDirectorio) {
                    System.out.println(item);
                }

                System.out.println("¿Cual desea borrar?:");
                borrado = System.console().readLine();

                File fichero = new File(borrado);

                if (fichero.exists()) {
                    fichero.delete();
                    System.out.println("El fichero ha sido borrado correctamente.");
                } else {
                    System.out.println("No se ha podido borrar el fichero.");
                }

            } else {
                System.out.println("Lo sentimos, no se enncuentra el directorio introducido.");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

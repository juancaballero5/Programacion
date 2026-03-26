import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {

            FileWriter archivo = new FileWriter("datos.txt");
            BufferedWriter bw = new BufferedWriter(archivo);

            bw.write("Hola, este es un archivo de prueba.\n");
            bw.write("Estamos aprendiendo a leer archivos en Java.\n");
            bw.write("Cada línea representa un dato diferente.\n");
            bw.write("Puedes añadir más líneas para probar el programa.\n");
            bw.write("La lectura de archivos es fundamental en programación.\n");
            bw.write("¡Sigue practicando y mejorando tus habilidades!\n");
            bw.close();

        } catch (Exception e) {

            System.out.println("**ERROR");

        }
    }
}

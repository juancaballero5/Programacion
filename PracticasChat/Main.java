import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        char[][] estanteria = null;
        int totalOcupadas = 0;
        int totalLibres = 0;

        try {
            
            BufferedReader br = new BufferedReader(new FileReader("almacen.txt"));
            ArrayList<String> lineas = new ArrayList<>();
            String linea = "";

            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }

            estanteria = new char[lineas.size()][lineas.get(0).length()];

            for (int i = 0; i < estanteria.length; i++) {
                for (int j = 0; j < estanteria.length; j++) {
                    estanteria[i][j] = lineas.get(i).charAt(j);
                    totalLibres++;
                }
            }

            totalOcupadas = numeroOcupadas(estanteria, lineas);
            totalLibres -= totalOcupadas;

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("**ERROR: El archivo no ha sido encontrado.");
        } catch (IOException e) {
            System.out.println("**ERROR: El archivo no ha podido ser leido.");
        }

        
    }

    public static int numeroOcupadas(char[][] estanteria,ArrayList<String> lineas) {

        int ocupadas = 0;

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < lineas.get(0).length(); j++) {
                if (estanteria[i][j] == 'O') {
                    ocupadas++;
                }
            }
        }

        return ocupadas;

    }
}

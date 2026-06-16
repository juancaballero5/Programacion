package Ejercicio22;

public class SimuladorVida {

    private String BORRAR_PANTALLA = "\033[H\033[2J";
    public static void main(String[] args) {

        
        if (args.length != 4) {
            
        } else {
            System.out.println("[ERROR] Número de argumentos incorrecto.");
            System.out.println("El programa de SimuladorVida necesita exactamente 4 parámetros para funcionar.");
            System.out.println("");
            System.out.println("Uso correcto: \n java SimuladorVida <archivo_entrada> <generaciones> <velocidad> <archivo_salida>");
        }
    }
}

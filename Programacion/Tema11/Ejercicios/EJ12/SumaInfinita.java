package Ejercicios.EJ12;

import java.util.ArrayList;

public class SumaInfinita {
    public static void main(String[] args) {

        try {
            
            Double total = 0.0;
    
            for (int i = 0; i < args.length; i++) {

                String argumento = args[i];

                if (!esNumero(argumento)) {

                    System.out.println("Aviso: '" + argumento + "' no es un número válido y será ignorado.");
                    
                } else {

                    Double numero = Double.parseDouble(args[i]);
                    
                    total += numero;
                }
    
            }
    
            System.out.printf("El total de la suma es : %.1f",total);
            
        } catch (Exception e) {
            System.out.println("");
        }

    }

    public static boolean esNumero(String argumento) {

        boolean respuesta = true;

        try {
            Double.parseDouble(argumento);
        } catch (NumberFormatException e) {
            respuesta = false;
        }

        return respuesta;
    }
}

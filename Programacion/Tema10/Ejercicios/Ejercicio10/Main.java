package Ejercicios.Ejercicio10;

import java.util.HashMap;

public class Main {
    
    public static final HashMap<String,String> diccionario = new HashMap<>();

    public static void main(String[] args) {

        String palabra;
        String respuesta ;

        darValores();

        System.out.println("Introduzca una palabra y la traducimos");
        System.out.print("Palabra:");
        palabra = System.console().readLine().toLowerCase();

        if (diccionario.containsKey(palabra)) {

            respuesta = diccionario.get(palabra);

            if (respuesta == null) {
                System.out.println("Lo siento la traducción de su palabra no la tenemos almacenada.");
            } else {
                System.out.println(respuesta);
            }
        }

    }
    
    /**
     */
    public static void darValores() {
        
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("libro", "book");
        diccionario.put("agua", "water");
        diccionario.put("comida", "food");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("coche", "car");
        diccionario.put("puerta", "door");
        diccionario.put("ventana", "window");
        diccionario.put("árbol", "tree");
        diccionario.put("flor", "flower");
        diccionario.put("escuela", "school");
        diccionario.put("maestro", "teacher");
        diccionario.put("niño", "child");
        diccionario.put("ciudad", "city");
        diccionario.put("mar", "sea");

    }
}

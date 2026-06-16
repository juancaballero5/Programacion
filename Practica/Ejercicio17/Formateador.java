package Ejercicio17;

public class Formateador {
    public static void main(String[] args) {
        

        if (args.length < 1 || args.length > 2) {
            System.out.println("**Error: debe introducir 1 o 2 parametros.");
        } else {
            if (args.length == 1) {
                System.out.println(args[0]);
            } else {
                
                switch (args[0]) {
                    case "-m":
                        System.out.println(args[1].toUpperCase());
                        break;
                    case "-min":
                        System.out.println(args[1].toLowerCase());
                        break;
                    
                    default:
                        System.out.println("Los flags deben ser -m o -min");
                        break;
                }

            }
        }
    }
}

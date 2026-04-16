package Ejercicios.EJ17;

public class Formateador {
    public static void main(String[] args) {
        
        String flag;
        String texto = ;

        if (args.length <= 0) {

            System.out.println("ERROR: debe introducir al menos un argumento por linea de comando.");
            System.out.println("Uso: java Formateador <\"texto\">.");

        } else if (args.length == 1) {
            
            texto = args[0];

            System.out.println(texto);

        } else if (args.length == 2) {
            
            flag = args[0];
            texto = args[1];

            switch (flag) {
                case "-m":
                    System.out.println(texto.toUpperCase());
                    break;

                case "-min":
                    System.out.println(texto.toLowerCase());
                    break;
            
                default:
                    System.out.println("ERROR: los valores validos son \"-m\" o \"-min\".");
                    break;
            }

        }

    }
}

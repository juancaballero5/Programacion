package Ejercicios.EJ13;

public class Rango {
    public static void main(String[] args) {
        

        int  num1 ;
        int  num2 ;

        if (args.length == 2) {
            
            // Obtenemos los argume ntos y los parseamos a entero

            try {
                
                num1 = Integer.parseInt(args[0]);
                num2 = Integer.parseInt(args[1]);

                System.out.print("Secuencia: ");

                // escribimos los valores

                for (; num1 <= num2; num1++) {
                    System.out.printf("%d ",num1);
                }

            } catch (NumberFormatException e) {
                System.out.println("**ERROR, los argumentos no pueden ser palabras.");
            }    

        } else {
            System.out.println("**ERROR, introduzca 2 numeros enteros.");
        }

    }
}

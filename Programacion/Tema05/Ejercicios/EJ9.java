package Ejercicios;

public class EJ9 {
    public static void main(String[] args) {
        
        //Serie de FIBONACCI [fib(n) = fib(n-1) + fib (n-2)]


        int numero;
        int temporal;
        int ant = 0;   //El valor de anterior (ant) y actual (act) son inicialmente
        int act = 1;   // los indicados por definición de la serie Fibonacci

        System.out.println("\033[1mN PRIMEROS TÉRMINOS DE LA SERIE DE FIBONACCI\033[0m");
        System.out.print("Introduce un numero entero: ");
        numero = Integer.parseInt(System.console().readLine());

        while (numero > 1) {
            
            System.out.println(ant + " ");
            
            temporal = ant + act;
            ant = act;
            act = temporal;

            numero--;
        }


    }
}

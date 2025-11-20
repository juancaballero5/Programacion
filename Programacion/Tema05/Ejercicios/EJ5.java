package Ejercicios;

public class EJ5 {
    public static void main(String[] args) {
        int i = 0;
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;

        System.out.print("Intoduce un número y te mostraré su tabla de multiplicar: ");
        numero1 = Integer.parseInt(System.console().readLine());

        for (i = 0; i <= 10;i++) {

            resultado = numero1 * numero2 ;

            System.out.printf("%d x %d = %d \n",numero1,numero2,resultado);
            
            numero2++;
        }
    }
}

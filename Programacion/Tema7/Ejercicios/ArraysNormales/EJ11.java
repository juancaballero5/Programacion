package Ejercicios.ArraysNormales;

public class EJ11 {

    public static int MAXIMO = 8;

    public static void main(String[] args) {
        
        int numero;

        int []valores = new int[MAXIMO];

        System.out.println("Introduzca 8 números enteros, pulse INTRO después de cada número:");

        for (int i = 0; i < MAXIMO; i++) {
            
            numero = Integer.parseInt(System.console().readLine());

            valores[i] = numero;

        }

        pares(valores);
        
    }

    public static void pares(int []valores) {

        for (int i = 0; i < MAXIMO; i++) {
            
            if (valores[i]%2 == 0) {
                System.out.printf("%d par \n",valores[i]);
            } else {
                System.out.printf("%d impar \n",valores[i]);
            }

        }

    }

}

package Ejercicios;
public class EJ8 {
    public static void main(String[] args) {
        int objetivo = 0;
        int cantidad = 0;

        for (cantidad = 0; objetivo != 24; cantidad++) {
            int numero = (int) (Math.random() * (100 - 0 + 1)) + 0;
            System.out.print(numero + " ");
            objetivo = numero;
        }
        System.out.printf("\nSe han generado %d números", cantidad);
    }
}

package Ejercicios;

public class EJ13 {
    public static void main(String[] args) {
        
        int numero;
        int i = 2 ;
        boolean primo = false;

        System.out.print("Introduzca un numero: ");
        numero = Integer.parseInt(System.console().readLine());

        while ((i < numero) && (!primo) ) {
            if (numero%i == 0) {
                primo = true;
            }
            i++;
        }

        if (primo) {
            System.out.println("El numero es primo");
        } else{
            System.out.println("El número no es primo");
        }
    }
}

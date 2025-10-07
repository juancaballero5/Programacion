package Ejercicio01;

public class HorarioColores {
    public static void main (String args[]) {
        System.out.printf("%.2f a %.2f\t \033[31m Programación\033[0m\n", 8.15,9.15);
        System.out.printf("%.2f a %.2f\t \033[31m Programación\033[0m\n", 9.15,10.15);
        System.out.printf("%.2f a %.2f\t \033[31m Programación\033[0m\n", 10.15,11.15);
        System.out.printf("%.2f a %.2f\t \033[32mSistemas Informáticos\033[0m\n", 11.45,12.45);
        System.out.printf("%.2f a %.2f\t \033[32mSistemas Informáticos\033[0m\n", 12.45,13.45);
        System.out.printf("%.2f a %.2f\t \033[35mLenguaje de Marcas\033[0m\n", 13.45,14.45);
    }
}

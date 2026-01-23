import java.util.Scanner;

public class ejercicio6relacional {
    public static void main(String[] args) {
        Integer base;
        Integer altura;
        Double area;
        Scanner escaner;

        escaner = new Scanner(System.in);

        System.out.printf("Área de triangulo \n -------------------\n");

        System.out.println("Introduzca la longitud de la base (cm)");
        base = escaner.nextInt();

        System.out.println("Introduzca la altura (cm)");
        altura = escaner.nextInt();

        area = 0.5 * base * altura;

        System.out.printf("El área de un triangulo es %.1f cm\u00B2 \n",area);
    }
}

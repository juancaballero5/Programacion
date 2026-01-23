import java.util.Scanner;

public class ejercicio3relacion {
    public static void main(String[]args) {
        Integer pesetas;
        Double euros;
        Scanner escaner;

        escaner = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de pesetas que quiere convertir");
        pesetas = escaner.nextInt();
        
        euros = (pesetas / 166.386);

        System.out.printf("%d pesetas son %.2f euros",pesetas,euros);
        
    }
}

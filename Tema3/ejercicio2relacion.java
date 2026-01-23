import java.util.Scanner;

public class ejercicio2relacion {
    public static void main (String[]args){

        Integer euros;
        Integer peseta;
        Scanner escaner;

        escaner = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de euros que quiere convertir");
        euros = escaner.nextInt();

        peseta = (int) (euros * 166.386);

        System.out.printf("%d euros son %d",euros,peseta);
    }
}

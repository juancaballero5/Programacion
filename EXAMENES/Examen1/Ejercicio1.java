//Juan Caballero Castillo


import java.util.Scanner;


public class Ejercicio1{
    public static void main(String[] args) {


        System.out.println("\033[1mAceleración según la segunda ley de Newton\033[0m");
        System.out.println("\033[1m------------------------------------------\033[0m");

        double masa;
        double fuerza;
        double aceleracion;
        Scanner escaner =new Scanner(System.in);


            System.out.print("Ingrese la masa del objeto (kg):");
            masa= escaner.nextDouble();

            System.out.print("Ingrese la fuerza neta aplicada (N) :");
            fuerza = escaner.nextDouble();
        



        aceleracion = fuerza / masa;

        System.out.printf("La aceleración del objeto es aproximadamente \033[1m %.2f m/s\u00B2 \033[0m",aceleracion);

    }

    
}
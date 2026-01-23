//Juan Caballero Castillo

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("\033[1m     TANGO MODAS     \033[0m");
        System.out.println("\033[1m---------------------\033[0m");
        
        String codigo;
        double precio;
        double unidades;
        double total;
        int descuento;
        Scanner escaner =new Scanner(System.in);

        System.out.print("Introduce código del artículo : ");
        codigo = escaner.nextLine();

        System.out.print("Introduce precio : ");
        precio = escaner.nextDouble();

        System.out.print("Introduce unidades vendidas : ");
        unidades = escaner.nextInt();

        System.out.print("Introduce descuento (%) : ");
        descuento = escaner.nextInt();

        System.out.println("\033[1m     TANGO MODAS     \033[0m");
        System.out.println("\033[1m---------------------\033[0m");

        System.out.printf("%s \t\t %.2f ",codigo,precio);

        total =  (precio * unidades) ;

        System.out.printf("%s \t\t %.2f€ \n",codigo,precio);
        System.out.printf("%.0f uds \t\t %.2f€ \n",unidades,total);
        System.out.printf("%s \t\t %.2f€ \n",codigo,precio);
        System.out.printf("%s \t\t %.2f€ \n",codigo,precio);
        System.out.printf("TOTAL \t\t %.2f€ \n",codigo,precio);








    }
}

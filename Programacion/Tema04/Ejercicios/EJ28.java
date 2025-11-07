import java.util.Scanner;

public class EJ28 {
    public static void main(String[] args) {
        String nombre;
        char fiesta;
        double precioNo;
        double precioSi;
        int IVA;
        int unidades;
        int descuento;
        Scanner escaner;

        escaner = new Scanner(System.in);

        try {
        System.out.print("Introduzca el nombre del articulo: ");
        nombre = escaner.nextLine().toLowerCase();

        System.out.print("Introduzca el precio del articulo :");
        precioNo = escaner.nextDouble();

        System.out.print("Introduzca el número de unidades vendidas: ");
        unidades = escaner.nextInt();

        System.out.print("¿Aplicamos descuento en IVA por fiesta? (s/n): ");
        fiesta = escaner.nextLine().charAt(1);

        

        }catch (Exception e) {
            System.out.println("Error Datos introducidos erroneos");
        }
    }
}

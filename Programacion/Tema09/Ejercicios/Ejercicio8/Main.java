package Ejercicios.Ejercicio8;

import java.net.CacheRequest;

import Ejercicios.Ejercicio8.clases.Zona;

public class Main {
    public static void main(String[] args) {
        
        int eleccion;
        int eleccionZona;
        int cantidadVendida;

        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        do {
            System.out.println("");
            menu();
            System.out.print("Elige una opción: ");
            eleccion = Integer.parseInt(System.console().readLine());

            switch (eleccion) {
                case 1 :
                    menuEntradas(principal, compraVenta, vip);
                    break;
                case 2 :
                    menuVender();
                    System.out.print("Elige la zona la zona para la que quieres comprar las entradas: ");
                    eleccionZona = Integer.parseInt(System.console().readLine());
                    System.out.println("¿Cuántas entradas quieres?");
                    cantidadVendida = Integer.parseInt(System.console().readLine());

                    switch (eleccionZona) {
                        case 1 :
                            principal.vender(cantidadVendida);
                            break;
                        case 2 :
                            compraVenta.vender(cantidadVendida);
                            break;
                        case 3 :
                            vip.vender(cantidadVendida);
                            break;
                    }

                    break;
                case 3 :
                    
                    break;
            }
        } while (eleccion !=3);

    }

    public static void menu() {
        System.out.println("EXPOCOCHES MÁLAGA");
        System.out.println("1. Mostrar número de entradas libres");
        System.out.println("2. Vender entradas");
        System.out.println("3. Salir");
    }

    public static void menuEntradas(Zona principal,Zona compraVenta,Zona vip) {
        System.out.println("En la zona principal hay " + principal.getEntradasPorVender());
        System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());
        System.out.println("En la zona vip hay " + vip.getEntradasPorVender());
    }
    
    public static void menuVender() {
        System.out.println("1. Principal");
        System.out.println("2. Compra-venta");
        System.out.println("3. Vip");
    }
}

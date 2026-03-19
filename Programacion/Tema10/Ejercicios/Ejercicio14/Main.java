package Ejercicios.Ejercicio14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public final static HashMap<String,Float> productos = new HashMap<>();
    public static void main(String[] args) {
        
        HashMap<String,Float> productosEscogidos = new HashMap<>();
        ArrayList <Integer> cantidades = new ArrayList<>();

        String producto = "";
        float precio;
        int cantidad;
        int cantidadProductos = 0;

        establecerProductos(productos);


        System.out.println("Bienvenido a tu Supermercado de confianza, ¿Que desea comprar?");

        do {
            
            System.out.print("Producto (Introduzca fin para terminar la compra):");
            producto = System.console().readLine().toLowerCase();

            if (!productos.containsKey(producto) && !producto.equals("fin")) {
                System.out.println("Lo sentimos, este producto no esta disponible.");
            } else {

                precio = productos.get(producto);

                
                System.out.print("Cantidad:");
                cantidad = Integer.parseInt(System.console().readLine());

                cantidades.add(cantidad);
                
                productosEscogidos.put(producto, precio);

                cantidadProductos ++;

            }


        } while (!producto.equals("fin"));

        if (cantidadProductos > 0) {
            recibo(productosEscogidos,cantidades,cantidadProductos);
        }

    }

    /**
     * @param productosEscogidos
     * @param cantidades
     * @param cantidadProductos
     */
    public static void recibo(HashMap<String,Float> productosEscogidos ,ArrayList <Integer> cantidades, int cantidadProductos) {

        Object[] productos;
        Object[] precios;

        float total = 0;

        System.out.println("Producto Cantidad Precio Subtotal");
        System.out.println("---------------------------------");
        productos = productosEscogidos.keySet().toArray();
        precios = productosEscogidos.values().toArray();

        for (int i = 0; i < cantidadProductos; i++) {

            total += productosEscogidos.get(productos[i]) * cantidades.get(i);

            System.out.printf("%-4s", productos[i]);
            System.out.printf("%.2-4f", precios[i]);
            System.out.printf("%-4d",cantidades.get(i));
            System.out.printf("%.2-4f",productosEscogidos.get(productos[i]) * cantidades.get(i));
        }

        System.out.println("---------------------------------");
        System.out.printf("TOTAL: %.2f",total);
        
    }

    public static void establecerProductos(HashMap<String,Float> productos) {
        productos.put("avena", 2.21f);
        productos.put("garbanzos", 2.39f);
        productos.put("tomate", 1.59f);
        productos.put("jengibre", 3.13f);
        productos.put("quinoa", 4.50f);
        productos.put("guisantes", 1.60f);
    }
}
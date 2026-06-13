package Condicionales.ClasificadorTriangulos;

public class Ejercicio2 {
    public static void main(String[] args) {
        double lado1;
        double lado2;
        double lado3;

        try {
            
            System.out.print("Primer lado: ");
            lado1 = Double.parseDouble(System.console().readLine());

            System.out.print("Segundo lado: ");
            lado2 = Double.parseDouble(System.console().readLine());

            System.out.print("Tercer lado: ");
            lado3 = Double.parseDouble(System.console().readLine());

            if (validarTriangulo(lado1, lado2, lado3)) {
                
                if (iguales(lado1, lado2) && iguales(lado2, lado3)) {
                    System.out.println("El triángulo es equilátero.");
                } else if (iguales(lado1, lado2) && !iguales(lado2, lado3)) {
                    System.out.println("EL triángulo es isósceles.");
                } else {
                    System.out.println("El triángulo es escaleno.");
                }

            } else {

                System.out.println("**ERROR: Lo sentimos pero eso no forma un triangulo valido.");

            }

        } catch (Exception e) {
            System.out.println("**ERROR: El programa ha fallado.");
        }

    }

    public static boolean validarTriangulo(double lado1 ,double lado2, double lado3) {

        boolean resultado = false;

        if (((lado1 + lado2) < lado3) || ((lado2 + lado3) < lado1)) {

        } else {
            resultado = true;
        }

        return resultado;

    }

    public static boolean iguales(double lado1, double lado2) {

        boolean resultado = false;

        if (lado1 == lado2) {
            resultado = true;
        }

        return resultado;

    }

}

package Condicionales.Bisiestos;

public class Ejercicio3 {
    public static void main(String[] args) {
        int anio;

        try {

            System.out.print("Año: ");
            anio = Integer.parseInt(System.console().readLine());

            if (anio % 100 != 0) {
                
                if (anio % 4 == 0) {
                    
                    System.out.printf("El año %s es bisiesto.",anio);

                } else {

                    System.out.printf("El año %s no es bisiesto.",anio);
                }

            } else {

                if (anio % 400 == 0) {
                    
                    System.out.printf("El año %s es bisiesto.",anio);

                } else {

                    System.out.printf("El año %s no es bisiesto.",anio);
                }

            }
            
        } catch (Exception e) {
            System.out.println("**ERROR: El programa ha fallado.");
        }
    }
}

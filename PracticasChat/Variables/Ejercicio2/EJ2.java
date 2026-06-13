package Ejercicio2;

public class EJ2 {
    public static void main(String[] args) {
        
        double celsius;
        double fahrenheit;
        double kelvin;

        try {

            System.out.print("Introduzca la temperatura(Celsius):");
            celsius = Double.parseDouble(System.console().readLine());

            fahrenheit = (celsius * (9/5) + 32);
            kelvin = celsius + 273.15;

            System.out.printf("Fahrenheit: %.2f\n",fahrenheit);
            System.out.printf("Kelvin: %.2f",kelvin);
            
        } catch (Exception e) {
            System.out.println("**ERROR: El programa ha fallado");
        }

    }
}

public class ejercicio4relacion {
    public static void main(String[]args) {

        Double numero1;
        Double numero2;
        Double suma;
        Double resta;
        Double multiplicacion;
        Double division;

        System.out.println("Introduzca el primer número");
        numero1 = Double.parseDouble(System.console().readLine()) ;
        System.out.println("Introduzca el segundo número");
        numero2 = Double.parseDouble(System.console().readLine());

        System.out.printf("x = %.1f \n",numero1);
        System.out.printf("y = %.1f \n",numero2);
        
        suma = numero1 + numero2;
        System.out.printf("x + y = %.1f \n",suma);

        resta = numero1 - numero2;

        System.out.printf("x - y = %.1f \n",resta);
        
        division = numero1 / numero2;

        System.out.printf("x / y = %.17f \n",division);

        multiplicacion = numero1 * numero2;

        System.out.printf("x * y = %.1f \n",multiplicacion);

    }
}

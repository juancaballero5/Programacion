public class Ejercicio1Ejemplo {
    public static void main(String[]args) {
        
        Integer numero1;
        Integer numero2;
        Integer multiplicacion;

        System.out.println("Este programa multiplica dos números enteros");
        System.out.println("Por favor, introduzca el primer número");
        numero1 = Integer.parseInt(System.console().readLine()) ;
        
        System.out.println("Introduzca el segundo número");
        numero2 = Integer.parseInt(System.console().readLine()) ;

        multiplicacion = numero1 * numero2 ; 

        System.out.printf("%d * %d = %d",numero1,numero2,multiplicacion);

    }
}

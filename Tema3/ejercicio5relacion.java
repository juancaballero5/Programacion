public class ejercicio5relacion {
    public static void main(String[]args) {

        Double longitud;
        Double altura;
        Double area;

        System.out.println("Área de un rectángulo");
        System.out.println("-------------------");

        System.out.println("Introduzca la longitud de la base (cm)");
        longitud = Double.parseDouble(System.console().readLine()) ;

        System.out.println("Introduzca la altura (cm)");
        altura = Double.parseDouble(System.console().readLine());

        area = longitud * altura;

        System.out.printf("El área del rectangulo es %.1f cm\u00B2",area);
    }
}

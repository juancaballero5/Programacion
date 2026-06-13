

public class Ejercicio1 {
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        int resultado;
        char operador;

        try {
            
            System.out.print("Introduzca el primer número: ");
            numero1 = Integer.parseInt(System.console().readLine());

            System.out.print("Introduzca el segundo número: ");
            numero2 = Integer.parseInt(System.console().readLine());

            System.out.print("Operación(+,-,*,/): ");
            operador = System.console().readLine().charAt(0);

            switch (operador) {
                case '+':
                    resultado = numero1 + numero2;

                    System.out.printf("Resultado: %d",resultado);
                    break;
            
                case '-':
                    resultado = numero1 - numero2;

                    System.out.printf("Resultado: %d",resultado);
                    break;
            
                case '*':
                    resultado = numero1 * numero2;

                    System.out.printf("Resultado: %d",resultado);
                    break;
            
                case '/':

                if (numero2 <= 0) {
                    System.out.println("**ERROR: No se puede dividir con 0 o inferior.");
                } else {
                    resultado = numero1 / numero2;

                    System.out.printf("Resultado: %d",resultado);
                }
                    break;
            
                default:
                    System.out.println("**ERROR: Introduzca un operador correcto (+,-,*,/)");
                    break;
            }

        } catch (Exception e) {
            System.out.println("**ERROR: El programa ha fallado.");
        }

    }
}

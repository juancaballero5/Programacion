package Tema04;

public class Ejercicio2ejemplo {
    public static void main(String[] args) {
        int nota;

        System.out.print("Introduzca la nota del examen :");
         
        nota = Integer.parseInt(System.console().readLine());

        if (nota >= 0 && nota <= 10) {
            if (nota >= 5) {
                if (nota == 5) {
                    System.out.println("Has \033[1m\033[32maprobado\033[0m por los pelos");
                }else{
                    System.out.println("¡Has \033[1m\033[32maprobado\033[0m! ¡Eres un crack!");
                }
            }else{
                System.out.println("Has \033[1m\033[31msuspendido\033[0m, haber estudiado");
            }
            } else {
            System.out.println("No puede userse ese numero");    
            }

        double dinero;

        System.out.print("Cuanto dinero tiene en el banco :");
        dinero = Double.parseDouble(System.console().readLine());

        if (dinero >= 0) {
            if (dinero ==0) {

            System.out.println("No tienes dinero en tu cuenta");

            }else{

                System.out.printf("Tiene \033[1m%.2f € \033[0m en la cuenta",dinero);

            }
        }else{
            System.out.println("Debe dinero al banco");
        }
    }
}

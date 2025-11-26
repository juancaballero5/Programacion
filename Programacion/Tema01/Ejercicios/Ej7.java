package Ejercicios;
public class Ej7 {
    public static void main(String[] args) {
        int i = 0;
        int cantidad = 1;
        int local;
        int visitante;

        try {
            for (i = 0; i < 14; i++) {
                int numero1 = (int) (Math.random() * (2 - 0 + 1)) + 0;
                int numero2 = (int) (Math.random() * (2 - 0 + 1)) + 0;
                int numero3 = (int) (Math.random() * (2 - 0 + 1)) + 0;

                if (numero1 == 0) {
                    numero1 = 'X';
                } else if (numero2 == 0) {
                    numero2 = 'X';
                } else if (numero3 == 0) {
                    numero3 = 'X';
                }

                System.out.printf("%d: |%d | %d | %d |\n", cantidad, numero1, numero2, numero3);
                cantidad++;

            }

            System.out.print(" Pleno al 15 - ");
            System.out.print("Local ...");
            local = Integer.parseInt(System.console().readLine());
            if (local < 0) {
                System.out.println("**Error numero introducido no valido");
            }
            if (local >= 0 && local <= 2) {
                System.out.printf("%d |", local);
            } else if (local > 2) {
                System.out.print("M |");
            }

            System.out.print(" Visitante ...");
            visitante = Integer.parseInt(System.console().readLine());
            if (visitante < 0) {
                System.out.println("**Error numero introducido no valido");
            }
            if (visitante >= 0 && visitante <= 2) {
                System.out.printf("%d \n", visitante);
            } else if (visitante > 2) {
                System.out.println("M");
            }

        } catch (Exception e) {
            System.out.println("**Error");
        }
    }
}

public class EJ1 {
    public static void main(String[] args) {
        
        int dia;

        System.out.print("Introduce un día de la semana y te dire qué asignatura toca a primera hora de ese día (1-5) :");
        dia = Integer.parseInt(System.console().readLine());

        switch (dia) {
            case 1,5:
                System.out.println("\033[1m PROGRAMACIÓN \033[0m");
                break;
            case 2,4:
                System.out.println("\033[1m SISTEMAS INFORMÁTICOS \033[0m");
                break;
            case 3:
                System.out.println("\033[1m BASE DE DATOS \033[0m");
                break;
            default:
                System.out.println("**Error Numero no valido ");
                break;
        }

    }
}

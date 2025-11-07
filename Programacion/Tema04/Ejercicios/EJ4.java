

public class EJ4 {
    public static void main(String[] args) {

        double a;
        double b;
        double x;

        System.out.println("Este programa resuelve ecuaciones de primer grado");
        System.out.print("Introduce el valor de a :");
        a = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce el valor de b :");
        b = Double.parseDouble(System.console().readLine());

        if (a > 0) {
            x = -b / a;
            System.out.printf("x = %.2f \n",x);
        }else {
            System.out.println("Esta ecuación no tiene solucion real");
        }
    }
}

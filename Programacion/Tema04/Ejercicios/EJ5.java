

public class EJ5 {
    public static void main(String[] args) {
        double g;
        double h;
        double tiempo;
        g = 9.81 ;

        System.out.println("Cálculo el tiempo de caída de un objeto");

        System.out.print("Introduce la altura (en metros) desde la que cae un objeto :");
        h = Double.parseDouble(System.console().readLine());

        if (h > 0) {
            tiempo = Math.sqrt(2*h/g);
            System.out.printf("El objeto tarda %.2f segundos \n",tiempo);
        }else{
            System.out.println("**Error valor no valido, la altura no puede ser negativa");
        }
    }
}

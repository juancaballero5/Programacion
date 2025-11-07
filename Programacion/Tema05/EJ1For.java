public class EJ1For {
    public static void main(String[] args) {
        int i;
        int edad;

        System.out.print("Introduce tu edad : ");
        edad = Integer.parseInt(System.console().readLine());

        for (i = 1;i<= edad ; i++){
            System.out.printf("%d ",i);
        }
    }
}

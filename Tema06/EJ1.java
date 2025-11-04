public class EJ1 {
    public static void main(String[] args) {

        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        int dado3 = (int) (Math.random() * 6) + 1;
        int suma;

        System.out.printf("Tirada de dados: %d, %d, %d%n", dado1, dado2, dado3);

        suma = dado1 + dado2 + dado3;

        System.out.printf("Suma: %d%n", suma);
    }

}

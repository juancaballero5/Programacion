public class EJ5 {
    public static void main(String[] args) {

        int total = 0;
        int cantidad = 0;
        int media;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < 50; i++) {
            int numero = (int) (Math.random() * (199 - 100 + 1)) + 100;
            total += numero;
            cantidad++;
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }
            System.out.print(numero + " ");
        }
        media = total / cantidad;
        System.out.printf("Media: %d\n", media);
        System.out.printf("Mínimo: %d\n", minimo);
        System.out.printf("Máximo: %d\n", maximo);

    }
}

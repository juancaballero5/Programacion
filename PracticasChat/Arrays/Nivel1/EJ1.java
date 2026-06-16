package Nivel1;

public class EJ1 {
    public static void main(String[] args) {

        int total = 0;
        int mayor = 0;
        int[] numeros = new int[5];

        numeros[0] = 3;
        numeros[1] = 4;
        numeros[2] = 7;
        numeros[3] = 11;
        numeros[4] = 9;

        for (int i = 0; i < numeros.length; i++) {
            total += numeros[i];

            if (mayor < numeros[i]) {
                mayor = numeros[i];
            }

        }

        System.out.println(total);
        System.out.println("Mayor: " + mayor);

    }
}

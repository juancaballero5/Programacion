import java.util.HashSet;

public class EJ1 {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        int aciertos = 0;
        int eleccion;

        while (numeros.size() < 6) {
            int numero = (int) (Math.random() * (49 - 1 + 1)) + 1;
            numeros.add(numero);

        }

        System.out.println("Introduzca 6 numeros(1 - 49)");

        for (int i = 0; i < numeros.size(); i++) {
            System.out.print("Introduzca numero:");
            eleccion = Integer.parseInt(System.console().readLine());
            
            if (numeros.contains(eleccion)) {
                aciertos++;
            }

        }

        System.out.printf("Has acertado %d veces.",aciertos);

    }
}

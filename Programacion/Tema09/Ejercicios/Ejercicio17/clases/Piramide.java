package Ejercicios.Ejercicio17.clases;

public class Piramide {
    
    private int altura;
    private static int piramidesCreadas = 0;

    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString() {
        String resultado = "";

        for (int i = 0; i <= this.altura; i++) {

            // Espacios
            for (int j = 0; j < this.altura - i; j++) {
                resultado += " ";
            }

            // Asteriscos
            for (int k = 0; k < 2 * i - 1; k++) {
                resultado += "*";
            }

            resultado += "\n";
        }

        return String.format("%s", resultado);
    }
}

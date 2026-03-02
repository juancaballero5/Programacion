package Ejercicios.Ejercicio17.clases;

public class Rectangulo {
    
    private int base;
    private int altura;
    private static int rectangulosCreados = 0;

    public Rectangulo(int base,int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    @Override
    public String toString() {

        String resultado = "";

        for (int i = 0; i < this.altura; i++) {
            
            // Asteriscos
            for (int j = 0; j < base; j++) {
                resultado += "*";
            }

            resultado += "\n";
        }

        return String.format("%s", resultado);
    }
}

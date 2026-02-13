package clases;

public class Rectangulo implements Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }


    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2.0 / (this.base * this.altura);
    }

}

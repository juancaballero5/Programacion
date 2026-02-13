package clases;

public class Circulo implements Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 2 * radio * radio * Math.PI;
    }
    
    @Override
    public double calcularPerimetro() {
        return 0;
    }
}

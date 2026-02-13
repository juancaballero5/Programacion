package interfaces;
import interfaces.clases.Diablo;
import interfaces.clases.FIFA;
import interfaces.clases.Rectangulo;

public class Main2 {
    public static void main(String[] args) {
        
        FIFA fifa = new FIFA();
        Diablo diablo = new Diablo();
    
        fifa.pulsarX();
        diablo.pulsarX();
    
        Rectangulo rectangulo = new Rectangulo(2, 2);
    
        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());

    }
}

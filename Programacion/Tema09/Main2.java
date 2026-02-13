import clases.Diablo;
import clases.FIFA;
import clases.Rectangulo;

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

package Ejercicios.Ejercicio12.clases;

public class Carta {
    private final String FIGURA[] = {"As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
    private final String PALOS[] = {"Oros", "Bastos", "Espadas", "Copas"};

    private String figura;
    private String palo;

    /**
     * 
     */
    public Carta() {
        this.figura = FIGURA[(int) (Math.random() * 10)];
        this.palo = PALOS[(int) (Math.random() * 4)];
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return this.figura + " de " + this.palo;
    }
}

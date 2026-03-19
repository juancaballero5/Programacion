package Ejercicios.Ejercicio9.clases;

public class Carta implements Comparable<Carta> {
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

    public String getFigura() {
        return figura;
    }

    public String getPalo() {
        return palo;
    }



    /**
     * 
     */
    @Override
    public String toString() {
        return this.figura + " " + this.palo;
    }

    /**
     * 
     */
    @Override
    public boolean equals(Object objeto) {

        Carta b = (Carta) objeto;

        return (this.figura.equals( b.figura)) && (this.palo.equals(b.palo)) ;

    }

    @Override
    public int compareTo(Carta o) {
        return this.palo.compareTo(o.palo);
    }

}

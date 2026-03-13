package Ejercicios.Ejercicio12.clases;

public class Carta {
    private final String FIGURA[] = {"As", "dos", "tres", "cuatro", "cinoc", "seis", "siete", "Sota", "Caballo", "Rey"};
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
        return this.figura;
    }

    public int valor() {

        int puntos = 0;

        switch (this.figura.toLowerCase()) {
            case "as":
                puntos = 11;
                break;
            case "tres":
                puntos = 10;
                break;
            case "sota":
                puntos = 2;
                break;
            case "caballo":
                puntos = 3;
                break;
            case "rey":
                puntos = 4;
                break;
        }

        return puntos;
    }

    @Override
    public boolean equals(Object obj) {
        Carta carta = (Carta) obj;
        return carta!= null && this.palo.equals(carta.palo) && this.figura.equals(carta.figura);
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return this.figura + " de " + this.palo;
    }
}

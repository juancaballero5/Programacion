package Ejercicios.Ejercicio7.clases;

public class Moneda {

    private final String[] CANTIDADES = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos" , "1 euro", "2euros"};
    private final String[] POSICIONES = {"cara", "cruz"};
    
    
    // las propiedades indican el estado de la moneda
    private String cantidad ;
    private String posicion;

    /**
     * 
     */
    public Moneda() {

        // determinamos la cantidad de la moneda
        this.cantidad = CANTIDADES[(int) (Math.random() * 7)];

        // determinamos la posición de la moneda 
        this.posicion = POSICIONES[(int) (Math.random() * 2)]; 
    }

    /**
     * @return
     */
    public String getCantidad() {
        return this.cantidad;
    }

    /**
     * @return
     */
    public String getPosicion() {
        return this.posicion;
    }

    /**
     * 
    */
    @Override
    public String toString() {
        return this.cantidad + " - " + this.posicion + "\n";
    }

}

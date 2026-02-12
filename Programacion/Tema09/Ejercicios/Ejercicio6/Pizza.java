package Ejercicios.Ejercicio6;

public class Pizza {
    
    private String tipo;
    private String tamaño;
    private String estado;
    private static int totalPedidas;
    private static int totalServidas;
    
    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        totalPedidas++;
        this.estado = "pedida";
    }

    public void sirve() {
        if (estado != "servida") {
            estado = "servida";
            totalServidas++;
        } else {
            System.out.println("esa pizza ya se ha servido");
        }
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    @Override
    public String toString() { 
        return String.format("pizza %s %s, %s", tipo, tamaño, estado);
    }

}

package Ejercicios.Ejercicio16.clases;

import java.util.HashMap;

public class Pais {
    
    HashMap<String,String> capitales = new HashMap<>();

    private String pais;
    private String capital;

    public Pais(String pais, String capital) {
        this.pais = pais;
        this.capital = capital;
        capitales.put(pais, capital);
    }
}

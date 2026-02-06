package Ejercicios.Ejercicio3.Clases;

public class Mamiferos extends Animal {

    public Mamiferos(String nombre) {
        super(nombre);
    }

    public void nose(){
        System.out.println("Toma mi patita");
    }
    
    public void pecho() {
        System.out.println("Toma pecho, hazte grande.");
    }
}

package Cases;

/**
 * La clase GATO extiende las caracteristicas y comportamientos
 * de la clase ANIMAL. Independientemente, define sus propios 
 * atributos y métodos.
 */
public class Gato extends Animal {

    // métodos (comportamientos)
    public Gato(String nombre) {
        super(nombre);
    }

    public Gato(String nombre,int edad) {
        super(nombre,edad);
    }

    
    void maulla(){
        System.out.println("Miiiaaau");
    }

    void ronronea(){
        System.out.println("Brrrrrrr");
    }

}

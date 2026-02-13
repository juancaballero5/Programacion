package animal.Clases;

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

    
    public void maulla(){
        System.out.println("Miiiaaau");
    }

    public void ronronea(){
        System.out.println("Brrrrrrr");
    }

}

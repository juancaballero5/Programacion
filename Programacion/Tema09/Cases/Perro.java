package Cases;

/**
 * La clase PERRO extiende las caracteristicas y comportamientos
 * de la clase ANIMAL. Independientemente, define sus propios 
 * atributos y métodos.
 */
public class Perro extends Animal {

    private boolean caza;

    public Perro (String nombre){
        super(nombre);
    }

    public boolean getCaza() {
        return this.caza;
    }

    public void setCaza(boolean caza) {
        this.caza = caza;
    }

    public void ladra() {
        System.out.println("Guau!");
    }

    public void gruñe() {
        System.out.println("Grrrrr..");
    }

    public void caza() {
        if (this.caza) {
            System.out.println("Cobra la pieza...");
        }
    }

    /**
     * El método existe en la clase Object, de la que heredan
     * todas las clases. Cómo vamos a redefinir su comportamiento en 
     * la clase Perro, decimos que estamos SOBRECARGANDO el metodo
     */
    @Override
    public String toString() {
        return this.getNombre() + "\n" +
                this.getEdad() + "\n";
    }

}

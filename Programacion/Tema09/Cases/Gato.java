package Cases;

public class Gato {
    private String nombre;
    private String raza;
    private int edad;

    // métodos (comportamientos)
    Gato(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de la propiedad NOMBRE
     * @return
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Setter de la propiedad EDAD
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    void maulla(){
        System.out.println("Miiiaaau");
    }

    void ronronea(){
        System.out.println("Brrrrrrr");
    }

    void cumple(int anios){
        this.edad+=anios;
    }

    /**
     * @param comida
     */
    void come(String comida){
        System.out.println("Me gusta comer "+ comida + "!!!");
        System.out.println("Ñam");
    }

    void pelea(Gato gato){
        System.out.println("Voy a pelearme con " + gato.nombre   + "!!");
    }
}

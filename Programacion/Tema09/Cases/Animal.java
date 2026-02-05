package Cases;

public abstract class Animal {
    
    
    protected String nombre;
    private String raza;
    private int edad;

    private Sexo sexo;

    public Animal (String nombre){
        this.nombre = nombre;
    }

    public Animal (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

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

    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }

    public void cumple(int anios){
        this.edad +=anios;
    }

    /**
     * @param comida
     */
    public void come(String comida){
        System.out.println("Me gusta comer "+ comida + "!!!");
        System.out.println("Ñam");
    }

}

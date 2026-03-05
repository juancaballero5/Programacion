public class Alumno implements Comparable<Alumno> {

    private String dni;
    private String nombre;
    private String apellido;
    private int edad;


    /**
     * @param dni
     * @param nombre
     * @param apellido
     * @param edad
     */
    public Alumno(String dni, String nombre, String apellido , int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    /**
     * @return
     */
    public String getDni() {
        return this.dni;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

    /**
     * Defino la lógica de comparación de ambos alumnos.
     * Supongamos que tenemos dos alumnos A y B.
     * El método devuelve:
     * -1: A < B (el alumno A es más joven que B) 
     *  0: si ambos alumnos son iguales (tienen la mmisma edad) 
     *  1: A > B (el alumno es mayor que B)
     * 
     * @param b
     * @return
     */
    @Override
    public int compareTo(Alumno b) {

        int resultado;

        if (this.edad == b.edad) {
            resultado = 0;
        } else if (this.edad < b.edad) {
            resultado = -1;
        } else {
            resultado = 1;
        }

        return resultado;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s, edad: %d años", this.dni, this.nombre,this.apellido,this.edad);
    }


}
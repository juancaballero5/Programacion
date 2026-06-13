public class Villano {
    
    private String nombre;
    private String alias;
    private String poder;
    private int maldad;

    /**
     * Contructor de la clase Villano
     * 
     * @param nombre
     * @param alias
     * @param poder
     * @param maldad
     */
    Villano(String nombre, String alias, String poder, int maldad) {

        this.nombre = nombre;
        this.alias = alias;
        this.poder = poder;
        this.maldad = maldad;
    }

    /**
     * Getter del alias del villano
     * 
     * @return
     */
    public String getAlias() {
        return alias;
    }

    
    /**
     * Getter del alias del villano
     * 
     * @return
     */
    public int getMaldad() {
        return maldad;
    }

    /**
     * Getter del nombre del villano
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter del poder del villano
     * 
     * @return
     */
    public String getPoder() {
        return poder;
    }

    /**
     * Setter del alias del villano
     * 
     * @return
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Setter de la maldad del villano
     * 
     * @return
     */
    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    /**
     * Setter del nombre del villano
     * 
     * @return
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter del poder del villano
     * 
     * @return
     */
    public void setPoder(String poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %s | Maldad: %d",this.alias,this.nombre, this.poder,this.maldad);
    }

}
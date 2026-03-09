package Ejercicios.Ejercicio5.clases;

public class Disco {

    private String codigo;
    private String titulo;
    private String artista;
    private String genero;
    private int duracion;

    /** */
    public Disco() {

    }

    /**
     * @param codigo
     * @param titulo
     * @param artista
     * @param genero
     * @param duracion
     */
    public Disco(String codigo, String titulo, String artista, String genero, int duracion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getCodigo() {
        return this.codigo;
    }



    @Override
    public String toString() {

        return String.format("CODIGO: %s \nTITULO: %s\n ARTISTA: %s\nGENERO: %s\nDURACIÓN: minutos %d ",this.codigo,this.titulo,this.artista,this.genero,this.duracion);

    }

}
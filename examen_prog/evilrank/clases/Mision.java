import java.util.ArrayList;

public class Mision {
    
    private String codigo;
    private String titulo;
    private int dificultad;
    private ArrayList<Villano> participantes;
    private boolean completada;

    /**
     * Contructor de las misiones
     * 
     * @param codigo
     * @param titulo
     * @param dificultad
     */
    Mision(String codigo, String titulo, int dificultad) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.dificultad = dificultad;
        this.participantes = new ArrayList<Villano>();
        this.completada = false;

    }

    /**
     * Función que ñade los villanos que participan en una misión
     * 
     * @param villano
     */
    void anadirVillano(Villano villano) {

        this.participantes.add(villano);

    }

    /**
     * Función para mostrar todos los villanos participantes de una misión
     */
    void mostrarParticipantes() {
        
        for(Villano item : this.participantes) {
            System.out.println(item);
        }
    }

    double calcularMediaMaldad() {

        double totalMaldad = 0;
        double totalVillanos = 0;

        for(Villano item : this.participantes) {

            totalMaldad += item.getMaldad();
            totalVillanos++;

        }

        return totalMaldad>0?(totalMaldad / totalVillanos):0;

    }

    void obtenerInformacion() {

        System.out.printf("Codigo : %s \n",getCodigo());
        System.out.printf("Titulo : %s\n",getTitulo());
        System.out.printf("Dificultad : %d\n",getDificultad());
        if (this.completada == true) {
            System.out.println("Estado: Completada");
        } else {
            System.out.println("Estado: Incompleta");
        }
        System.out.println("Participantes:");
        mostrarParticipantes();
        System.out.printf("Media de maldad: %.2f",calcularMediaMaldad());

    }

    public String getCodigo() {
        return codigo;
    }

    public int getDificultad() {
        return dificultad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEstado() {
        
        String resultado = "";

        if (this.completada) {
            resultado = "Completada";
        } else {
            resultado = "Pendiente";
        }

        return resultado;

    }

    public ArrayList<Villano> getParticipantes() {
        return participantes;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | Dificultad: %d | Estado: %s", this.codigo,this.titulo,this.dificultad,this.completada!=true?"Pendiente":"Completada");
    }

}

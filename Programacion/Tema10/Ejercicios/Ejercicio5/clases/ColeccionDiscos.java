package Ejercicios.Ejercicio5.clases;

import java.util.ArrayList;

public class ColeccionDiscos {
    
    private ArrayList<Disco> coleccion;

    /**
     * 
     */
    public ColeccionDiscos(){
        this.coleccion = new ArrayList<>();
    }

    /**
     * @param disco
     */
    public void añadirDisco(Disco disco) {
        this.coleccion.add(disco);
    }

    /**
     * 
     */
    public void mostrarDiscos() {
        for(Disco disco: this.coleccion) {
            System.out.println(disco);
        }
    }

    /**
     * @param codigo
     * @return
     */
    public Disco buscarDisco(String codigo) {

        int i = 0;
        Disco disco = null;

        while ((i < this.coleccion.size()) && (disco!= null)) {
            
            Disco temp = this.coleccion.get(i);
            if (codigo.equals(disco.getCodigo())) {
                disco = temp;
            }
            i++;
        }

        return disco;

    }

    /**
     * @param codigo
     * @return
     */
    public boolean eliminarDisco(String codigo) {

        boolean resultado = false;

        Disco disco = this.buscarDisco(codigo);

        // Si he encontrado el disco se elimina
        if (disco!=null) {
            this.coleccion.remove(disco);
            resultado = true;
        }

        return resultado;

    }

}

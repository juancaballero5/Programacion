package Ejercicios.Ejercicio2.Clases;

public class Caballo {
    
    private String nombre;

    public Caballo (String nombre) {
        this.nombre = nombre;
    }

    public void saludo() {
        System.out.printf("Hola, me llamo %s\n",nombre);
    }

    public void cabalgar() {
        System.out.println("Tocotoc Tocotoc Tocotoc");
    }

    public void graznar() {
        System.out.println("Hiiiiiiiieeeeeee");
    }

}

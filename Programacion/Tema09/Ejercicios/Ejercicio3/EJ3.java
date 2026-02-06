package Ejercicios.Ejercicio3;

import Clases.Sexo;
import Ejercicios.Ejercicio3.Clases.Gato;
import Ejercicios.Ejercicio3.Clases.Canario;
import Ejercicios.Ejercicio3.Clases.Lagarto;
import Ejercicios.Ejercicio3.Clases.Perro;
import Ejercicios.Ejercicio3.Clases.Pinguino;

public class EJ3 {
    public static void main(String[] args) {
        
        Gato nina = new Gato("Nina");
        Perro luna = new Perro("Luna");
        Canario curro = new Canario("Curro");
        Lagarto sisu = new Lagarto("Sisu");
        Pinguino cabo = new Pinguino("Cabo");

        nina.setSexo(Sexo.HEMBRA);
        luna.setSexo(Sexo.HEMBRA);
        curro.setSexo(Sexo.MACHO);
        sisu.setSexo(Sexo.HEMBRA);
        cabo.setSexo(Sexo.MACHO);

        nina.setEdad(10);
        luna.setEdad(5);
        curro.setEdad(6);
        sisu.setEdad(1);
        cabo.setEdad(12);

        luna.setCrias(true);

        curro.setVuela(true);
        cabo.setVuela(false);

        nina.come1("pescado");

        luna.dormir();

        sisu.tomarSol();

        cabo.presentacion();

        curro.cuidarCrias();

        nina.pecho();

        sisu.dormir();

        sisu.come1("insectos");
    }
}

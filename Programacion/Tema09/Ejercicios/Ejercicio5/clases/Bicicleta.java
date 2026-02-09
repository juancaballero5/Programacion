package Ejercicios.Ejercicio5.clases;

import java.util.Scanner;

public class Bicicleta extends Vehiculo {
    
    Scanner entrada = new Scanner(System.in);

    public Bicicleta(){
        
    }

    public void pedalear(int kilometros) {
        System.out.print("¿Cuantos kilometros quiere recorrer?");
        kilometros = entrada.nextInt();

        this.kilometrosRecorridos += kilometros;
        this.kilometrosTotales += kilometros;
    }

    public void caballito() {
        System.out.println("Estoy haciendo el caballito.");
    }

}

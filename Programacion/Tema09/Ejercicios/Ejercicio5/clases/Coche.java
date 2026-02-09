package Ejercicios.Ejercicio5.clases;

import java.util.Scanner;

public class Coche extends Vehiculo {
    
    Scanner entrada = new Scanner(System.in);

    public Coche () {
        
    }

    public void anda(int kilometros) {
        System.out.print("¿Cuantos kilometros quiere recorrer?");
        kilometros = entrada.nextInt();

        this.kilometrosRecorridos += kilometros;
        this.kilometrosTotales += kilometros;
    }

    public void quemarRueda() {
        System.out.println("Estoy quemando ruedas con el coche.");
    }

}

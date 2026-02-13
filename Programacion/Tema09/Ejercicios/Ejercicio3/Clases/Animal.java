package Ejercicios.Ejercicio3.Clases;

import animal.Clases.Sexo;

public class Animal {
    
    protected String nombre;
    private String comida;
    private boolean crias;
    private int edad;

    private Sexo sexo;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }

    public void come1(String comida) {
        System.out.println("Estoy comiendo " + comida);
    }

    public void setCrias(boolean crias) {
        this.crias = crias;
    }

    public void come(String comida){
        System.out.println("Me gusta comer "+ comida + "!!!");
    }

    public void dormir(){
        System.out.println("Zzzzzz");
    }

    public void cuidarCrias(){
        if (crias) {
            System.out.println("Estoy cuidando de mis crias.");
            
        }
    }

}

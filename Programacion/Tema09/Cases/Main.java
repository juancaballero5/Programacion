package Cases;
public class Main {
    public static void main(String[] args) {
        
        Gato garfield = new Gato("Garfield");
        Gato silvestre = new Gato("Silvestre");

        garfield.maulla();
        garfield.ronronea();

        System.out.println(garfield.nombre);
        garfield.come("lasaña");
        garfield.pelea(silvestre);
    }
}

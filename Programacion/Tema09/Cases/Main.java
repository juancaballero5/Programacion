package Cases;
public class Main {
    public static void main(String[] args) {
        
        Gato garfield = new Gato("Garfield");
        Gato silvestre = new Gato("Silvestre");
        Perro pluto = new Perro("Pluto");

        pluto.setCaza(true);

        pluto.caza();

        garfield.maulla();
        garfield.ronronea();

        System.out.println(garfield.getNombre());
        garfield.come("lasaña");
        garfield.pelea(silvestre);

        garfield.setEdad(15);
        garfield.setSexo(Sexo.MACHO);
    }
}

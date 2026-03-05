import java.util.HashMap;
import java.util.Map.Entry;

public class Mapas {
    

    public static void main(String[] args) {
        
        HashMap<Integer, String> mapa = new HashMap<>();
        
        mapa.put(924,"Cindy Nero");
        mapa.put(921,"Amalia Nuñez");
        mapa.put(700,"César Vázquez");
        mapa.put(219,"Víctor Tilla");
        mapa.put(537,"Alan Brito");
        mapa.put(605,"Esteban Quinto");

        // System.out.println(mapa);

        if (mapa.containsKey(605)) {
            System.out.println("Si, el elemento existe.");
        } else {
            System.out.println("No, no existe");
        }

        System.out.println("ELIGE VALOR(keySet())\n========================================");
        for(Integer indice : mapa.keySet()) {
            System.out.printf("%d\n", indice);
        }


        System.out.println("ELIGE VALOR(values())\n========================================");
        for(String valor : mapa.values()) {
            System.out.printf("%s\n",valor);
        }

        // Recuperamos un valor a traves de la llave 
        System.out.println(mapa.get(219));

        System.out.println("ELEMENTOS DEL MAPA\n============================");
        for(Entry item: mapa.entrySet()) {
            System.out.println(item);
        }

    }
}

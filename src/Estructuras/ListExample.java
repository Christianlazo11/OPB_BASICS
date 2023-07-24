package Estructuras;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<String> ();

        nombres.add("Nombre1");
        nombres.add("Nombre2");
        nombres.add("Nombre3");
        nombres.add("Nombre4");
        nombres.add("Nombre5");

        //System.out.println(nombres);

        for(String name: nombres) {
            System.out.println(name);
        }
    }
}

package Estructuras;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("6464617", "Nombre apellido 1");
        personas.put("6464615", "Nombre apellido 2");
        personas.put("6464616", "Nombre apellido 3");
        personas.put("6464614", "Nombre apellido 4");

        System.out.println(personas);

        for(String key: personas.keySet()) {
            System.out.println(key);
        }

        for(String val : personas.values()) {
            System.out.println(val);
        }

        for(Map.Entry<String, String> pair: personas.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}

package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C32", "Josh");
        map.put("A74", "Mike");
        map.put("B28", "Martha");
        map.put("C29", "Chris");
        map.put("B22", "Marina");
        map.put("A11", "Deb");

        System.out.println(map.size());
        System.out.println(map);

        map.put("A11", "Lucy");

        System.out.println(map);





    }
}

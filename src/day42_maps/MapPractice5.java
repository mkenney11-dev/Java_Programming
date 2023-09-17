package day42_maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice5 {

    public static void main(String[] args) {


        Map<String, String> map = new TreeMap<>();
        map.put("C32", "Josh");
        map.put("A74", "Mike");
        map.put("B28", "Martha");
        map.put("C29", "Chris");
        map.put("B22", "Marina");
        map.put("A11", "Deb");


        map.forEach((k,v) -> {
            System.out.println(k + " : " + v); } );







    }
}

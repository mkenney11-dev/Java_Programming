package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class IteratingMap {


    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>();// random order, accept null key and null values
        map.put("Josh", 900000);
        map.put("Mike", 75000);
        map.put("Martha", 15000);
        map.put("Chris", 100000);
        map.put("Jimmy", 99000);
        map.put("Bea", 89000);

        //Iterating map using keys
        for(String eachKey: map.keySet()){
            System.out.println(eachKey);
        }

        //iterating map using key and doubling salary
        for (String eachkey: map.keySet()){
            map.replace(eachkey, map.get(eachkey) * 2);
        }
        System.out.println(map);

        System.out.println("----------------------------------------------");

        //iterating map by values
        for (Integer eachValue: map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("--------------------------------------------");

        //iterating map by entry/pair
        for(Map.Entry<String, Integer> eachEntry : map.entrySet()){
            System.out.println(eachEntry);
        }

        System.out.println("--------------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            eachEntry.setValue(eachValue+ 10000);
            System.out.println(eachKey + " : " + eachValue);
        }

        System.out.println(map);

    }
}

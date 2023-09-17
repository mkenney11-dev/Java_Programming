package day41_maps;

import java.util.*;


public class MapClasses {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();//maintains insertion order
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Sarah", 80000);
        System.out.println(hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();//random order

        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Sarah", 80000);
        linkedHashMap.put(null, null);
        System.out.println(linkedHashMap);
        
        Map<String, Integer> treeMap = new TreeMap<>();// sorted order but does not accept null as key

        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Sarah", 80000);
       // treeMap.put(null, 92000); key cannot be null in treemap
        treeMap.put("Mark", null);// value can be null in treemap
        System.out.println(treeMap);

        Map<String, Integer> hashTable = new Hashtable<>();

        hashTable.put("Daniel", 95000);
        hashTable.put("Emily", 100000);
        hashTable.put("Sarah", 80000);
       // hashTable.put(null, 70000);//value in hashtable cannot be null

        try{
            hashTable.put("Diana", 10000);//key cannot be null
        }catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println(hashTable);




    }



}

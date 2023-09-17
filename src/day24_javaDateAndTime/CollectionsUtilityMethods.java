package day24_javaDateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class CollectionsUtilityMethods {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby"));

        System.out.println(names);

        /*
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){
                names.set(i, "Python");
            }
        }
        */

        Collections.replaceAll(names, "Java", "Python");

        System.out.println(names);

        System.out.println("---------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,60,30,40,30,50,50,50));

        int count = Collections.frequency(list, 50);
        System.out.println(count);
    }
}
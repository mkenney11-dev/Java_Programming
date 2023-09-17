package day40_collections;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {


        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(100);
        collection1.addAll(Arrays.asList(1,2,5,4,300,300,200,400,29,29,30));
        System.out.println(collection1);

        System.out.println( ((ArrayList<Integer>) collection1).get(2)); //casting collection to arraylist collection t ype so that we can use the get method

        System.out.println("--------------------------");

        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(30,40,40,50,60,30,20,20,40,70));
        System.out.println(collection2);

        //System.out.println(((ArrayList) collection2).get(4));

        System.out.println(new ArrayList<>(collection2).get(3) );// this creates an arraylist object to temporarily get the element from the set




    }
}

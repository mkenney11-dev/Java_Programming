package day23_arrayListContinued;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5};

        array[0] = 100;

        System.out.println(array);

        System.out.println("-----------------------------");

        ArrayList <String> groceries = new ArrayList<>();

        groceries.add("eggs");
        groceries.add("milk");
        groceries.add("bread");
        groceries.add("apples");

        System.out.println(groceries);

        groceries.set(3, "oranges");
        System.out.println(groceries);


        System.out.println("-------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

       boolean r1 =  numbers.remove(Integer.valueOf(10));

        System.out.println(numbers);
        System.out.println(r1);

        numbers.clear();
        System.out.println(numbers);

        System.out.println("-------------------------------");


        ArrayList <String> names = new ArrayList<>();
        names.add("Maggie");
        names.add("Dan");
        names.add("Bella");
        names.add("Bella");
        names.add("Pringles");

        System.out.println(names.indexOf("Bella"));
        System.out.println(names.lastIndexOf("Bella"));

        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasDan = names.contains("Dan");

        System.out.println(hasMuhtar);
        System.out.println(hasDan);

        System.out.println("-------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);

        System.out.println(list1.equals(list2));

        System.out.println("-------------------------------");





    }
}

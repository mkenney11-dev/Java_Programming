package day23_arrayListContinued;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {

    public static void main(String[] args) {

        //CONVERTING ARRAY TO LIST
        String[] arr = {"a", "b", "c", "d"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);

        System.out.println("------------------------");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "Python", "C#"));
        String[] languages = list2.toArray(new String [3]);

        System.out.println(Arrays.toString(languages));


        System.out.println("------------------------");

        //CONVERTING ARRAYLIST TO ARRAY
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3,4,5));

        Integer[] n = nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(n));


    }
}

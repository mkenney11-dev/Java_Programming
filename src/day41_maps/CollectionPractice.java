package day41_maps;

import day33_abstraction.employeeTask.Employee;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));


        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11, 12));

        List<List<Integer>> lists = new ArrayList<>();
        lists.addAll(Arrays.asList(list1, list2));

        System.out.println(lists);

        //how do you iterate out to get the number 10 from this list of lists?

        System.out.println(lists.get(1).get(3));
        // this will get the second arraylist object ( this will return list2) AND THEN
        // it will get the element at index 3 which is the number 10


        for (List<Integer> eachList: lists) {
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }


        System.out.println("----------------------------------------");

        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());

        System.out.println(listOfSets);

        listOfSets.get(0).addAll(Arrays.asList(10, 5, 20));
        listOfSets.get(1).addAll(Arrays.asList(25, 30, 15));
        listOfSets.get(2).addAll(Arrays.asList(12, 24,36));


        System.out.println(listOfSets);

        System.out.println("-----------------------------------");

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = { 5, 6, 7, 8, 9};
        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        listOfArrays.get(0)[2]= 35; //this is updating the value of the element at index 2 in the first array to 35

        System.out.println(Arrays.toString(listOfArrays.get(0)));


        //List <List<Employee>> teams = new ArrayList<>();





    }


}

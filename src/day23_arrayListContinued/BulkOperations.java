package day23_arrayListContinued;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new  ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1, numbers);

        System.out.println(list1);


        System.out.println("-------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(50, 60, 70, 80, 90));
        System.out.println(scores);

        System.out.println("-------------------------------");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Odil","Aizat", "Yavuz", "Mehrubon"));
        System.out.println(students);

        students.addAll(2, Arrays.asList("Selim", "Elif"));
        System.out.println(students);

        System.out.println("-------------------------------------");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> l1 = new ArrayList<>( Arrays.asList(nums));

        //l1.addAll(Arrays.asList(nums));
        System.out.println(l1);

        System.out.println("-------------------------------------");

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Karen", "Maggie", "PK", "Chad"));


        System.out.println(employeeList);

        boolean hasKarenPK = employeeList.containsAll(Arrays.asList("Karen", "PK"));
        System.out.println(hasKarenPK);

        boolean hasKarenMaggiePK = employeeList.containsAll(Arrays.asList("Karen", "Maggie", "PK"));
        System.out.println(hasKarenMaggiePK);

        boolean hasKarenMaggiePKAllie = employeeList.containsAll(Arrays.asList("Karen", "Maggie", "PK", "Allie"));
        System.out.println(hasKarenMaggiePKAllie);

        System.out.println("-------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 40));

        list.removeAll(Arrays.asList(10,20));
        System.out.println(list);





    }
}

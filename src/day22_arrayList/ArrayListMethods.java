package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(15);
        list.add(20);
        list.add(30);
        list.add(50);

        list.add(2, 75);
        list.add(2, 25);

        System.out.println(list);


        System.out.println("--------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Odil");
        studentsList.add("Aizat");
        studentsList.add("Yavuz");
        studentsList.add("Mehrubon");
        studentsList.add("Daniela");

        String firstStudent = studentsList.get(0);

        String laststudent = studentsList.get(studentsList.size()-1);

        System.out.println(firstStudent);
        System.out.println(laststudent);


    }
}

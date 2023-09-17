package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(3,35);

        System.out.println(numbers);

        System.out.println("---------------------------");

        for(int i = 0; i < numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        System.out.println("---------------------------");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        System.out.println("---------------------------");

        for (Integer each : numbers) {
            System.out.println(each);
        }

    }
}

package day40_collections;


import java.util.*;

public class IterablePractice1 {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mohammed", "Ahmed", "ahmed", "Yulia", "Chris"));

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String each = it.next();
            if(each.equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println(names);


        System.out.println("----------------------------------");


        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mohammed", "Ahmed", "ahmed", "Yulia", "Chris"));


        names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));

        System.out.println(names2);


        System.out.println("--------------------------------------------");

        List<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5,6 ,7, 8, 9, 10, 2,3 , 5, 6, 7, 45, 3, 5, 6, 7));
        //find nth largest number

        int n = 5; // in our progrma this variable determines which number we are looking for.. the 5th largest number

        for (int i = 0; i < n-1; i++) { // this loop will run 4 times bc n-1 == 5-1 (or 4)
            numbers.removeIf(p-> Collections.max(numbers) ==p); //collections.max(numbers) is finding us teh maximum number
                                                            // and then is removing the number if its the maximum through the loops iterations

        }
        int max = Collections.max(numbers);
        System.out.println(max);






    }


}

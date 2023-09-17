package day40_collections;

import java.util.*;

public class IterableExample {


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9));

        /*
        for (Integer each : list) {
            if( each < 5){
                list.remove(each);
            }
        }      THIS METHOD DOES NOT WORK, because the you need to be able to use remove method
                along side the iterable, which is not visible/useable in the each loop
         */

        /*for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 5){
                list.remove(i);
            }       THIS METHOD DOES NOT WORK because as each element is removed from an index
                    because this list is dynamic the element following hte one which is removed
                    takes its place or moves up in the index. Therefore it gets missed and does
                    not work.
        }

         */

        System.out.println(list);


        System.out.println("--------------------------------------");



        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9));

       Iterator<Integer> it = list2.iterator(); // this assigns list to iterator for use

       while(it.hasNext()){ // this loop will run so long as there is another element to run
           Integer each = it.next(); // iterates each element and assigns to variable 'each'
           if(each < 5){ // condition for removing elements
               it.remove(); // uses the iterator remove method
           }
       }

        System.out.println(list2);


        System.out.println("------------------------------------");


        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext(); ) {// this is a fori loop version
            // initialization = iterator; condition = i.hasNexT(); as long as the iterator returns true you can get an element
            // no increment/decrement is needed here because hasnext() already covers the length of the loop

           Integer each = i.next(); // this is how we get each element from the iterated collection
            if(each < 5){
                i.remove(); // removes the element
            }
        }

        System.out.println(list3);

        System.out.println("--------------------------------------------------");


        List<Integer> list4 = new LinkedList<>();
        list4.addAll(Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9));

        list4.removeIf(p -> p<5); // when the element is less than 5 it will be removed







    }
}

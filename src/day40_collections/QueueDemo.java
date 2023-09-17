package day40_collections;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        //Queue objects

        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90)); //will give random order, does not accept null
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));


        System.out.println(queue1);

        int num1 = queue1.poll(); //gives first in first out order
        // when you print queue1 again it will remove the first element
        // that same element will now be assigned to num1
        System.out.println(queue1);
        System.out.println(num1);

        //every time you use poll method it will remove the head element

        System.out.println("----------------------------------------------");



        Queue<Integer> queue2 = new ArrayDeque<>();
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));


        System.out.println(queue2);

       int num2 =  queue2.poll();
       queue2.poll();
       queue2.poll();
        System.out.println(queue2);
        System.out.println(num2);

        System.out.println("------------------------------------------------===");


        Queue<Integer> queue3 = new LinkedList<>();
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90, null));
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(queue3);

        queue3.poll();
        System.out.println(queue3);


        System.out.println( ((LinkedList) queue3).get(4) ); // you must cast Queue to linkedlist to use get method



        System.out.println("------------------------------------------");
        //Not a queue
        List<Integer> list = new LinkedList<>();




    }
}

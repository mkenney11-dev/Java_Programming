package day40_collections;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar"));

        Iterator<String> it = names.iterator();

        while (it.hasNext()) { //as long as the list has another element, then we can return next() to get the element
            String each = it.next();

            String reverse = "";

            for (int i = each.length() - 1; i >= 0; i--) { //iterating from the character at last index until index 0
                // we need to decrease by one each time because we are reversing (i--)
                reverse += each.charAt(i); // this takes each individual index element and adds it back to 'reverse' backwards
            }

            if (each.equalsIgnoreCase(reverse)) { //if this condition is true it means the string is a palindrome bc variable each
                // from the while loop will be equal to variable reverse in the for loop that is nested
                // into the while loop
                it.remove();
            }
        }


        System.out.println(names);


        System.out.println("----------------------------------------------");


        List<String> names1 = new ArrayList<>();
        names1.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar"));

        names1.removeIf(p -> StringUtility.reverse(p).equalsIgnoreCase(p));// using the reverse method in the Utility class we made
                                            // we can use equalsignorecase to remove teh string if the reversed string equals the string

        System.out.println(names1);









    }


}

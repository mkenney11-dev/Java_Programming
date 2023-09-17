package day42_maps;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


        String str = "bbcccaaaaaa";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) { //split method will turn it to an array and for each loop will iterate each character
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            //the character is represented by 'each' value, and using the frequency of collections method to find the frequency
            //the next step is to add the characters and its frequency back into the map
            map.put(each.charAt(0), frequency);

        }

        System.out.println(map);



    }



}

/*
Write a program that can return the frequency of characters

Note ---> MUST use map

ex: str = "bbbcccaaaaaa"
output:
    {b=2, c=3, a =6}
 */

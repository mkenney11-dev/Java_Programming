package day24_javaDateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaaabbbbbbbccc";//a4b7c3
        String result = "";
        for (String each : str.split("")) {

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            if(!result.contains(each)){
                result += each +frequency;
            }
        }


        System.out.println(result);





    }
}

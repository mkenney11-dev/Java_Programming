package day23_arrayListContinued;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Maggie");
        names.add("Dan");
        names.add("Bella");
        names.add("Bella");
        names.add("Pringles");
        names.add("Pringles");

        ArrayList<String> nonDupes = new ArrayList<>();

        for (String each : names) {
            if(nonDupes.contains(each)){
                continue;
            }
            nonDupes.add(each);
        }

        System.out.println(nonDupes);

        names = nonDupes;
        System.out.println(names);


    }

}

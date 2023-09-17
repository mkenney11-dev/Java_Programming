package day23_arrayListContinued;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Maggie");
        names.add("Dan");
        names.add("Bella");
        names.add("Pringles");
        names.add("Pringles");

        for (String each : names) {
            if(names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
                break;
            }

        }

    }
}

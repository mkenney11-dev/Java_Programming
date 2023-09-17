package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"Maggie", "Odil", "Aizat", "Yavuz"};
        String[] group2 = {"Leela", "Mehrubon", "Daniela"};
        String[] group3 = {"Selim", "Elif", "Aika", "Turgut", "Aaron"};
        String[] group4 = {"Daria", "Osman"};

        String[][] groups = {group1, group2, group3, group4 };


        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }

        }

        System.out.println("---------------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("---------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);

            }

            }

        System.out.println("------------------------------------");

        }

    }




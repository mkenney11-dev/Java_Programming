package day24_javaDateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Mike", 'M', LocalDate.of(1989, 2, 18));
        people[1].setInfo("Steve", 'M', LocalDate.of(1990, 7, 11));
        people[2].setInfo("Christina", 'F', LocalDate.of(1988, 1, 4));
        people[3].setInfo("Megan", 'F', LocalDate.of(1991, 6, 29));
        people[4].setInfo("Jack", 'M', LocalDate.of(1985, 4, 13));


        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));

        //print name and date of birth of each person object

        //remove all the people who are older than 34

    }
}

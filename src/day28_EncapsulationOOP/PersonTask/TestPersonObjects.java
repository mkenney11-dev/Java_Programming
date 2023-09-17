package day28_EncapsulationOOP.PersonTask;

import day28_EncapsulationOOP.PersonTask.Person;

public class TestPersonObjects {


    public static void main(String[] args) {

        Person person1 = new Person("Mike", 38, 'M', "English");
        Person person2 = new Person("Abdul", 14);
        Person person3 = new Person("Dominic");

        person1.drink("Coffee");
        person2.eat("Pizza");
        Person.printPlanetName();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }

}

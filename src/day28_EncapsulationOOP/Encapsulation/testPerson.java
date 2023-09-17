package day28_EncapsulationOOP.Encapsulation;

import java.time.LocalDate;

public class testPerson {
    public static void main(String[] args) {


        Person person1 = new Person("Maggie", 28, 'F', LocalDate.of(2024, 4, 28));

        //person1.setDateOfBirth(LocalDate.of(2023, 4, 28));
        System.out.println(person1);
    }
}

package day24_javaDateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate DateOfBirth;

    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.DateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();

    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DateOfBirth=" + DateOfBirth +
                '}';
    }
}

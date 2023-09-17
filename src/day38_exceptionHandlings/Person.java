package day38_exceptionHandlings;

import java.util.InputMismatchException;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if(!(gender =='M' || gender == 'F')){
            throw new InputMismatchException("Invalid gender: "+ gender);
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age == 0){
            throw new RuntimeException("Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new RuntimeException("Age is invalid: " + age);
        }
            this.age = age;
    }

    public char getGender() {
        return gender;
    }
}

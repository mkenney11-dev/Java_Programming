package day28_EncapsulationOOP.PersonTask;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHeads;

    public Person(String name){
        this.name = name;
    }
    public Person(String name, int age){
        this(name);
        this.age = age;
    }
    public Person(String name, int age, char gender){
        this(name, age);
        this.gender = gender;
    }
    public Person(String name, int age, char gender, String language){
        this(name, age, gender);
        this.language = language;
    }

    static {
            planet = "Earth";
            isHuman = true;
            hasNose = true;
            numberOfWings = 0;
            numberOfHeads = 1;
    }
    public static void printPlanetName(){
        System.out.println("Name of planet: " + planet);
    }
    public void eat(String food){
        System.out.println(name + " is eating: "+ food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking: " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", plant=" + planet + '\'' +
                '}';
    }
}
/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead
			Add a constructor to initialize name
			Add a constructor to initialize name and age
			Add a constructor to initialize name and language
			Add a constructor to initialize name and gender
			Add a constructor to initialize name, age and gender
			Add a constructor to initialize name, age, gender, language
			Add a static block to initialize all the statics
			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */
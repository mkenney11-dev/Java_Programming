package day35_polymorphism;

import day34_abstraction.animalTask.*;

public class PolymorphismIntro {
    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', 4, "Large", "White");

        Cat cat = new Cat("Max", "Husky", 'M', 4, "Large", "White");

        Tiger tiger = new Tiger("Bengal", "Bengal", 'M', 4, "Large" , "Orange");

        Lion lion = null;

        Shark shark = null;

        Parrot parrot = null;


       // Dog[] animals = {dog, cat, tiger, lion, shark, parrot};
        Animal[] animals = {dog, cat, tiger, lion, shark, parrot};







    }
}

package day35_polymorphism;

import day34_abstraction.animalTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Animal tiger = new Tiger("Tony", "Bengal", 'M', 7, "Large", "Orange");
       // tiger.hunt();
        tiger.eat();
        tiger.drink();



        Lion lion = null;
        Parrot parrot = null;
        Shark shark = null;
        Eagle eagle = null;
        Duck duck = null;
        Cat cat = null;

        Flyable[] birds = {duck, eagle, parrot};
        Playable[] friendly = {cat, duck, parrot};


    }
}

package day29_inheritance.animalTask;

import javax.crypto.spec.PSource;

public class Zoo {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("bella", "hound", 'F', 6, "medium", "mixed");
        Cat cat = new Cat();
        cat.setInfo("meeko", "tom cat", 'M', 13, "LARGE", "black and white");
        Tiger tiger = new Tiger();
        tiger.setInfo("Tony","bengal", 'M', 11, "Huge", "orange");


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        dog.eat();
        dog.sleep();
        dog.sleep();
        cat.meow();
        cat.eat();
        tiger.drink();
        tiger.hunt();
    }
}

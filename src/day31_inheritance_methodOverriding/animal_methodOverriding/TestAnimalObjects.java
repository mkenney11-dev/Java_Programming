package day31_inheritance_methodOverriding.animal_methodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {


        Cat cat = new Cat("Sassy", "Tom cat", 'f', 5, "large", "orange");

        Dog dog = new Dog("bella", "hound", 'f', 7, "medium", "white, black, brown");

        Lion lion = new Lion("Simba", "African", 'm', 9, "large", "brown", true);
        Eagle eagle = new Eagle("tweety", "bald", 'm', 11, "huge", "white and brown and yellow");
        System.out.println(cat);
        System.out.println(dog);
       System.out.println(lion);
        System.out.println(eagle);


        System.out.println("----------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

    }
}

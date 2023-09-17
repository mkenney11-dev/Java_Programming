package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritanceContinued.phoneTask.Nokia;
import day30_inheritanceContinued.phoneTask.Phone;

public class ReferenceTypeCasting {


        public static void main(String[] args) {

           // Dog dog = new Dog();

            Animal animal = (Animal) new Dog();//implicit casting

            System.out.println("--------------------------------");

            Animal animal1 = new Dog();
            animal1.setInfo("Max", "husky", 'M', 7, "Large", "White");

            animal1.eat();
            animal1.drink();
            animal1.sleep();

            Dog dog = (Dog)animal1; //MORE REUSEABLE
            dog.bark();

            //OR

           // ( (dog)animal1 ).bark(); THIS TYPE OF CASTING CAN ONLY BE USED ONCE


            //((Cat)animal1).scratch(); == CLASSCASTEXCEPTION bc animal1 is a dog object and cannot be converted to CAt

            System.out.println("-------------------------------------");

            Phone phone = new Nokia("XR20", "Small",  900.00, "Blue");

            phone.call(9383903);
            phone.text(9289999);
            ( (Nokia) phone).selfDefense();


            System.out.println("-------------------------------------");

            






        }

}

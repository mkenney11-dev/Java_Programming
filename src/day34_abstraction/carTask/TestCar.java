package day34_abstraction.carTask;

import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

public class TestCar {

    public static void main(String[] args) {

        Honda honda = new Honda("Civic", "Black", 2008, 30000);

        Audi audi = new Audi("Q6", "Silver", 2022, 90000);

        Tesla tesla = new Tesla("Model y", "White", 2023, 80000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-----------------------------");

        honda.start();
        audi.start();
        tesla.start();

        System.out.println("-----------------------------");
        honda.stop();
        audi.stop();
        tesla.stop();
    }
}

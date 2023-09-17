package day34_abstraction.carTask;

import day34_abstraction.carTask.Car;

public class Honda extends Car {
    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Insert key and turn to start " + getMake()+ " " + getModel());
    }



}

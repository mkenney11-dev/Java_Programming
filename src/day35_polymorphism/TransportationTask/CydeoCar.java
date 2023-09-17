package day35_polymorphism.TransportationTask;

import day34_abstraction.animalTask.Flyable;

public class CydeoCar extends Car implements Electric, Flyable, AutoPilot {
    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void autoPilot() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}

package day35_polymorphism.TransportationTask;

public class Tesla extends Car implements Electric, AutoPilot{

    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void autoPilot() {

    }
}

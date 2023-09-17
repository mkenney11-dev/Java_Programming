package day31_inheritance_methodOverriding.VehicleTask;

public class Airplane extends Vehicle {

    public Airplane(String brand, String model, String color, int year, double price){
        super(brand, model, color, year, price);
    }

    public void fly(){
        System.out.println("Flying" + getBrand() + " "+ getModel());
    }
}

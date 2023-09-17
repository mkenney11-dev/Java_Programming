package day27_accessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car(); // Car object
        obj1.new CarEngine(); //CarEngine object

        new Car.StaticInnerClass();



    }
}

package day32_finalKeyword.carTask;

public class TestCar {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "Blue", 2008, 5000.00 );
        Honda honda = new Honda("Civic", "Black", 2018, 20000.00);
        BMW bmw = new BMW("X6", "White", 2020, 60000);
        Tesla tesla = new Tesla("Model S", "Silver", 2022, 700000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("--------------------------------");
        toyota.start();
        honda.start();
        bmw.start();
        tesla.start();




    }
}

package day26_statics;

public class TestCarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Ford");
        System.out.println(car1);

        Car car2 = new Car("Ford", "Ranger");
        System.out.println(car2);

        Car car3 = new Car("Ford", "Ranger", 2008);
        System.out.println(car3);

        Car car4 = new Car("Ford", "Ranger", 2008, 5700.00);
        System.out.println(car4);

        Car car5 = new Car("ford", "Ranger", 2008, 5700, "black");

        System.out.println(car5);






    }



}

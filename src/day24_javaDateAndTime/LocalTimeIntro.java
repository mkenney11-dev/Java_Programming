package day24_javaDateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {

        LocalTime startingTime = LocalTime.of(10, 20);
        System.out.println(startingTime);

        LocalTime rightNow = LocalTime.now();
        System.out.println(rightNow);
    }
}

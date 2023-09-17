package day24_javaDateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthday = LocalDate.of(1990, 8, 22);
        System.out.println(birthday);

        System.out.println("---------------------------");

        LocalDate graduationDate = LocalDate.of(2024, 6, 15);

       graduationDate = graduationDate.plusYears(2);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);


    }
}

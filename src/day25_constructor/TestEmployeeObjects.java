package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("Karen", 63, 'F', "Dispatcher", 65000, LocalDate.of(2005, 9, 15));


        System.out.println(e1);

    }
}

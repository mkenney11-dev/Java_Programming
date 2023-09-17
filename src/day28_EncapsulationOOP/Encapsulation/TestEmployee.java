package day28_EncapsulationOOP.Encapsulation;

public class TestEmployee {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Chris", 24, "Developer", 100000);

       employee1.setSalary(199999);


        System.out.println(employee1.getSalary());



    }



}

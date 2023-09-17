package day33_abstraction.employeeTask;

public class TestEmployeeObects{

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Sarah", 36, 'F', "A2", "Math teacher", 45000);
            Developer developer = new Developer("Mark", 55, 'M', "k43", "Java developer", 120000, "Java");
            Driver driver = new Driver("Steve", 28, 'M', "k22", "Uber driver", 28000);
            Tester tester = new Tester("Maggie", 29, 'F', "F299", "QA tester", 88000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        teacher.work();
        developer.work();
        driver.work();
        tester.work();


    }
}
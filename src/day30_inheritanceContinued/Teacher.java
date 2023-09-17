package day30_inheritanceContinued;

import java.time.LocalDate;

public class Teacher extends Employee{

    public Teacher(String name, char gender, LocalDate dateOfBirth, String employeeID, String jobTitle, double salary) {
        super(name, gender, dateOfBirth, employeeID, jobTitle, salary);
    }

    public void teach(){
        System.out.println(getName() + " is teaching");
    }
}

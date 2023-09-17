package day30_inheritanceContinued;

import day30_inheritanceContinued.typesOfInheritance.Person;

import java.time.LocalDate;

public class Employee extends Person {

    public Employee(String name, char gender, LocalDate dateOfBirth, String employeeID, String jobTitle, double salary) {
        super(name, gender, dateOfBirth);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    private String employeeID;
    private String jobTitle;
    private double salary;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }



}

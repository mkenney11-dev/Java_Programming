package day38_exceptionHandlings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if(age < 0 || age >150 ) {
            if (age < 0) {
                throw new InputMismatchException("Age of the person should not be negative: " + age);
            }else{
                throw new InputMismatchException("Age of the person should not exceed 150: " + age);
            }
        }
        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }
}
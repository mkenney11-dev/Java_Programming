package day37_exceptions;

import java.lang.Exception;

public class TryCatchBlocks {

    public static void main(String[] args) {


        System.out.println("Program started");


        try {

            System.out.println(9 / 0);
            System.out.println("Try Block");

        }catch(ArithmeticException e){

            System.out.println("Catch Block");
        }
        System.out.println("Program ended");

        System.out.println("-------------------------------");

        String str = null;

        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try Block");
        }catch(RuntimeException e){
            System.out.println("Catch Block ");
        }


        System.out.println("Program2 ended");


    }
}

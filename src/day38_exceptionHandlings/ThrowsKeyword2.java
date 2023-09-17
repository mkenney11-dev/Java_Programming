package day38_exceptionHandlings;

public class ThrowsKeyword2 {
    public static void main(String[] args) {



    }

    public static void pauseFor5Seconds() throws InterruptedException{
        Thread.sleep(5000);
    }


    public static void method1() throws InterruptedException{
        System.out.println("Hello world");
        pauseFor5Seconds();
        System.out.println("Hello Cydeo");
    }

}

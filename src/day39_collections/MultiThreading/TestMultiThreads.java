package day39_collections.MultiThreading;

public class TestMultiThreads {

    public static void main(String[] args) {


        ThreadHelloWorld thread1 = new ThreadHelloWorld(1);
        //parent(reference)         child ===== upcasting
        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);

        thread1.start();
        thread2.start();



    }




}

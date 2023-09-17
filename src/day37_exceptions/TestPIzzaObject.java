package day37_exceptions;

public class TestPIzzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S', 2, 2);
        Pizza pizza2 = new Pizza('S', 2, 2);

        System.out.println(pizza1 == pizza2);


        System.out.println(pizza1.equals(pizza2));

    }
}

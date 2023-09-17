package day31_inheritance_methodOverriding.shape_MethodOverriding;

public class TestShapeObjects {
    public static void main(String[] args) {

        Square square1 = new Square(5);

        System.out.println(square1);


        square1.draw();

        Circle circle1 = new Circle(4);

        System.out.println(circle1);

        circle1.draw();



    }
}

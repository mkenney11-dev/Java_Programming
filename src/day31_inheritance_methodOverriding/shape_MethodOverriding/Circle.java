package day31_inheritance_methodOverriding.shape_MethodOverriding;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius* radius * 3.14;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }


    @Override
    public void draw() {
        System.out.println("Drawing circle");
        //code fragments that can draw a circle
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() + '\'' +
                "radius=" + radius +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}

package day31_inheritance_methodOverriding.shape_MethodOverriding;

public class Triangle extends Shape{

    private double side;

    public Triangle(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}

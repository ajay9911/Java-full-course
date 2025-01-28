package opps.problems;

public class Circle extends Shape {

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius *radius;
    }
}

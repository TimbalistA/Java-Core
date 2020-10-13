package oop;

public class Circle {

    private double radius;

    public void setRadius(final double radius) {
        this.radius = radius;
    }

    public double circleArea() {
        return (Math.PI * radius * radius);
    }

    public double circlePerimeter() {
        return (2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3.4);

        System.out.println("The circle area is: " + circle.circleArea());
        System.out.println("The circle perimeter is: " + circle.circlePerimeter());

    }
}

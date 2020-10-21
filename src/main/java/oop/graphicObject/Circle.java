package oop.graphicObject;

public class Circle extends GraphicObject {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

}

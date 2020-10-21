package oop.graphicObject;

public class Rectangle extends GraphicObject {

    private final int height;

    private final int length;

    public Rectangle(final int length, final int height) {
        this.length = length;
        this.height = height;
    }

    public double area() {
        return length * height;
    }

}

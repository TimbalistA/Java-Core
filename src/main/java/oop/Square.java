package oop;

import static java.lang.String.format;

public class Square {

    private final float sideLength;

    public Square(final float sideLength) {
        this.sideLength = sideLength;
    }

    public float squareArea() {
        return sideLength * sideLength;
    }

    public float squarePerimeter() {
        return sideLength * 4;
    }

    public static void main(String[] args) {
        Square square = new Square(5);

        System.out.println(format("Square area is: %.2f m2", square.squareArea()));
        System.out.println(format("Square perimeter is: %.2f m", square.squarePerimeter()));
    }

}

package oop.point;

public class UsePoint {

    public static void main(String[] args) {
        Point firstPoint = new Point();
        Point secondPoint = new Point(1, 2, 3);
        Point thirdPoint = new Point(2, 3);
        firstPoint.setX(5).setY(2).setZ(4);

        System.out.println("First Point: " + firstPoint);
        System.out.println("Second Point: " + secondPoint);
        System.out.println("Third Point: X = " + thirdPoint.getX() + ", Y = " + thirdPoint.getY());

    }

}

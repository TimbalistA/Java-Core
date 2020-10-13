package oop.graphicObject;

public class UseGraphicObject {

    public static void main(String[] args) {
        GraphicObject circle = new Circle(2);
        GraphicObject rectangle = new Rectangle(5, 3);

        System.out.println("Circle area is: " + circle.area());
        System.out.println("Rectangle area is: " + rectangle.area());
    }

}

import shapes.Circle;
import shapes.Rectangle;

public class ShapeDemo {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
    }
}

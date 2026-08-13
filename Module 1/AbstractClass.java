abstract class Shape {


    abstract void draw();


    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {

    
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Circle obj = new Circle();

        obj.display();
        obj.draw();
    }
}

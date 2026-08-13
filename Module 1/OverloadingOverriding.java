class Calculator {

    
    void add(int a, int b) {
        System.out.println("Integer Sum = " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Double Sum = " + (a + b));
    }
}

class Parent {
    void display() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {

    
    @Override
    void display() {
        System.out.println("Child Method");
    }
}

public class OverloadingOverriding {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.add(6, 24);
        c.add(15.5, 2.5);

        Child obj = new Child();
        obj.display();
    }
}

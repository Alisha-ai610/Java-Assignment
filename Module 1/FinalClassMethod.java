class Parent {

  
    final void display() {
        System.out.println("This is a final method.");
    }
}

final class FinalClass {
    void show() {
        System.out.println("This is a final class.");
    }
}

public class FinalClassMethod {
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        obj1.display();

        FinalClass obj2 = new FinalClass();
        obj2.show();
    }
}

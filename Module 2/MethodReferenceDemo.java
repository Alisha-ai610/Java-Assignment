interface Square {
    int calculate(int number);
}

public class MethodReferenceDemo {

    // Static method
    public static int findSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        // Method reference to the static method
        Square square = MethodReferenceDemo::findSquare;

        int number = 6;
        System.out.println("Square of " + number + " is: "
                + square.calculate(number));
    }
}
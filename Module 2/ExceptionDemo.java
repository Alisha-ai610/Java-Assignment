public class ExceptionDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        // try-catch block
        System.out.println("Using try-catch:");

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        // try-catch-finally block
        System.out.println("\nUsing try-catch-finally:");

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}

public class FactorialExceptionDemo {

    public static long calculateFactorial(int number) throws IllegalArgumentException {

        if (number < 0) {
            throw new IllegalArgumentException(
                "Factorial is not defined for negative numbers."
            );
        }

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        int number = 5;

        try {
            long result = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
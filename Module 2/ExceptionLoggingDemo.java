import java.util.logging.Logger;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionLoggingDemo {

    private static final Logger logger =
            Logger.getLogger(ExceptionLoggingDemo.class.getName());

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {
        int age = 16;

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
            logger.severe("Error: " + e.getMessage());
        }
    }
}

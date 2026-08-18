import utilities.MathUtils;

public class PackageDemo {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();

        int sum = math.add(10, 20);

        System.out.println("Sum = " + sum);
    }
}

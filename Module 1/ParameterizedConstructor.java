public class ParameterizedConstructor {

    int rollNo;
    String name;
    double marks;

    // Parameterized constructor
    ParameterizedConstructor(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No = " + rollNo);
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
    }

    public static void main(String[] args) {
        ParameterizedConstructor student =
                new ParameterizedConstructor(17, "Alisha", 95);

        student.display();
    }
}

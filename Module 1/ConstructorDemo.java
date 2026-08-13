class StudentConstructor {
    String name;
    int age;

    
    StudentConstructor() {
        name = "Unknown";
        age = 0;
    }


    StudentConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        StudentConstructor student1 = new StudentConstructor();
        StudentConstructor student2 = new StudentConstructor("Alisha", 20);

        System.out.println("Default Constructor:");
        student1.display();

        System.out.println("\nParameterized Constructor:");
        student2.display();
    }
}

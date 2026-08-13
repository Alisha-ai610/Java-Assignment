

class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Alisha");
        student.setAge(19);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}

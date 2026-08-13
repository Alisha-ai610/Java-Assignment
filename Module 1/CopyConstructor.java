public class CopyConstructor {

    int id;
    String name;

    
    CopyConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    CopyConstructor(CopyConstructor obj) {
        this.id = obj.id;
        this.name = obj.name;
    }

    void display() {
        System.out.println("ID = " + id + ", Name = " + name);
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(101, "Rahul");

        // Creating a copy of obj1
        CopyConstructor obj2 = new CopyConstructor(obj1);

        System.out.println("Original Object:");
        obj1.display();

        System.out.println("Copied Object:");
        obj2.display();
    }
}

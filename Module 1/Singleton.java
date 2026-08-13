public class Singleton {

    
    private static Singleton instance;

    
    private Singleton() {
        System.out.println("Singleton object created.");
    }

    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    void display() {
        System.out.println("This is a Singleton class.");
    }

    public static void main(String[] args) {

        // Getting the Singleton object
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.display();

        // Checking whether both references point to the same object
        if (obj1 == obj2) {
            System.out.println("Both objects are the same.");
        } else {
            System.out.println("Objects are different.");
        }
    }
}

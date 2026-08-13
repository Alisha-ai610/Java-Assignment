class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritancePolymorphism {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.sound();

    
        Animal animal = new Dog();
        animal.sound();
    }
}

interface Vehicle {
    void start();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
    }
}

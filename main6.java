class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    public void drive_car() {
        System.out.println("Driving a car");
    }
}

class Bike extends Vehicle {
    public void drive_bike() {
        System.out.println("Driving a bike");
    }
}

public class main6 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.drive();
        Car c = new Car();
        c.drive_car();
        Bike b = new Bike();
        b.drive_bike();
    }
}   
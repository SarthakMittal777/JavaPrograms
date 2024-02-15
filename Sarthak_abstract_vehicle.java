
    //WAP to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.

abstract class Vehicle {
    public abstract void start();
    public abstract void stop();
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine started");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle engine stopped");
    }
}
public class Sarthak_abstract_vehicle {
public static void main(String[] args) {
    Car car = new Car();
    car.start();
    car.stop();

    Motorcycle motorcycle = new Motorcycle();
    motorcycle.start();
    motorcycle.stop();
}
}


  
    

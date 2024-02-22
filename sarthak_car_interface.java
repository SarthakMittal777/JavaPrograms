interface Servicing {
    int getServiceTime();
}

class Car implements Servicing {

    public int getServiceTime() {
        return 2; //
    }
}

class Bike implements Servicing {

    public int getServiceTime() {
        return 3;
    }
}

public class sarthak_car_interface {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        System.out.println("Car service time: " + car.getServiceTime() + " hours");
        System.out.println("Bike service time: " + bike.getServiceTime() + " hours");
    }
}

interface IVehicle {
    // indicate how much a basic tune-up costs
    public double tuneUpCost();
    // determine whether vehicle can hold given num of passengers
    public boolean canCarry(int numPassengers);
}

class Car implements IVehicle {
    int mileage;
    int year;
    int numDoors;

    public Car(int mileage, int year, int numDoors) {
        this.mileage = mileage;
        this.year = year;
        this.numDoors = numDoors;
    }

    // indicate whether car was built before given year
    boolean builtBefore(int otherYear) {
        return this.year < otherYear;
    }

    public double tuneUpCost() {
        // Example implementation for tune-up cost
        // This is just a placeholder value, you should replace it with your actual implementation
        return 100.0;
    }

    public boolean canCarry(int numPassengers) {
        // Example implementation for can carry passengers
        // This is just a placeholder value, you should replace it with your actual implementation
        return numPassengers <= 5; // Assuming the car can carry up to 5 passengers
    }
}

class Bicycle implements IVehicle {
    int mileage;
    int numGears;

    public Bicycle(int mileage, int numGears) {
        this.mileage = mileage;
        this.numGears = numGears;
    }

    // Constructor for Bicycle class goes here

    public double tuneUpCost() {
        // Example implementation for tune-up cost
        // This is just a placeholder value, you should replace it with your actual implementation
        return 50.0;
    }

    public boolean canCarry(int numPassengers) {
        // Example implementation for can carry passengers
        // This is just a placeholder value, you should replace it with your actual implementation
        return numPassengers == 1; // Assuming a bicycle can carry only 1 passenger
    }
}

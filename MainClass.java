class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.makeSound(); // Output: Dog barks (Method Override)
        dog2.makeSound(); // Output: Dog barks (Method Override)
    }
}

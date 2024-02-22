class Animal {
    final void display() {
        System.out.println("This is the Animal class");
    }
    void display1() {
        System.out.println("This is the  class 2");
    }
}

class Dog extends Animal {
    // void display() {
    //     System.out.println("This is the Dog class");
    // }
    @Override
    void display1() {
        System.out.println("This is the  class dog");
    }

}
public class sarthak_animal_interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display(); 
        dog.display1(); 
    }
}

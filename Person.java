public class Person {
    String name;
    private int age;

    // Default constructor
    public Person() {
        // Initialize default values
        this.name = "John Doe";
        this.age = 25;
    }

    // Copy constructor
    public Person(Person otherPerson) {
        // Copy values from the otherPerson object
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Person john = new Person();

        // Creating a new object using the copy constructor
        Person jane = new Person(john);

        // Modifying the fields of the original object
        john.setName("John Smith");
        john.setAge(30);

        // Displaying information about both objects
        System.out.println("John's Information:");
        System.out.println("Name: " + john.getName());
        System.out.println("Age: " + john.getAge());

        System.out.println("\nJane's Information (Copied from John):");
        System.out.println("Name: " + jane.getName());
        System.out.println("Age: " + jane.getAge());
    }
}

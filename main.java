class Person {
    String name;
    int age;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    public void display_Emp() {
        display();
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    public void display_Manager() {
        display_Emp();
        System.out.println("Department: " + department);
    }
}

public class main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 25;
        person.display();

        Employee employee = new Employee();
        employee.name = "Jane";
        employee.age = 30;
        employee.salary = 5000;
        employee.display_Emp();

        Manager manager = new Manager();
        manager.name = "Mike";
        manager.age = 35;
        manager.salary = 10000;
        manager.department = "IT";
        manager.display_Manager();
    }
}

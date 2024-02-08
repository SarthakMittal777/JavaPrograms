class Person {
    public void speak() {
        System.out.println("The person is speaking");
    }
}

class Student extends Person {
    public void speak() {
        System.out.println("The student is asking a question");
    }
}

class Teacher extends Person {
    public void speak() {
        System.out.println("The teacher is giving a lecture");
    }
}
public class main5 {
    public static void main(String[] args) {
        Person p = new Person();
        p.speak();
        Student s = new Student();
        s.speak();
        Teacher t = new Teacher();
        t.speak();
    }
}

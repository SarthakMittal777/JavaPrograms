public class OOPS_concept {
    public static void main(String[] args) {
        Student sarthak= new Student();
        System.out.println(sarthak.name);
        sarthak.greeting('s');

    }
}
class Student
{
    String name;
    int rno;
    void greeting(char Sd)
    {
        System.out.println("hello "+Sd);
    }
    Student(){
        this.name="kunals";
        this.rno=12;

    }
}


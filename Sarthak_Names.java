import java.util.Scanner;
public class Sarthak_Names {
    public String name;
    public Sarthak_Names() { // non parameterized constructor
        this.name = "Unknown";
    }

    public Sarthak_Names(String name) { // parameterized constructor
        this.name = name;
    }
    public void 

    public void printName() {
        System.out.println("Stu Name: " + name);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Sarthak_Names obj1=new Sarthak_Names();
        Sarthak_Names obj2=new Sarthak_Names(sc);
        obj1.printName();
        obj2.printName();
    }
   //Write a program to print the names of students by creating a Student class. If no name is
//passed while creating an object of Student class, then the name should be &quot;Unknown&quot;,
//otherwise the name should be equal to the String value passed while creating object of
//Student class.

    
}

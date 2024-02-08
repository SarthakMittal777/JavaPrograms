// Parent class
class Circle {
    public double r;
    public String c;
    public Circle(double r) {
        this.r = r;
        this.c = "red"; 
    }

    // Constructor with two parameters
    public Circle(double r, String c) {
        this.r = r;
        this.c = c;
    }

   
    public double a() {
        return Math.PI * r * r;
    }
    //overied toString method
    public String toString() {
        return "Circle's radius: " + r + " and color: " + c;
    }
}
class Cylinder extends Circle {
    private double h;
    public Cylinder(double r, String c, double h) {
        super(r, c);
        this.h = h;
    }

    public double a() {
        return 2 * Math.PI * r * (r + h);
    }

    public String toString() {
        return "This is a Cylinder";
    }
}

public class main3 {
    public static void main(String[] args) {
    
        Circle c1 = new Circle(3.5);
        Circle c2 = new Circle(2.0, "blue");
        Cylinder cy1 = new Cylinder(2.0, "green", 5.0);
        System.out.println("info of Circle 1: " + c1.toString());
        System.out.println("Area of Circle 1: " + c1.a());
        System.out.println("info of Circle 2: " + c2.toString());
        System.out.println("Area of Circle 2: " + c2.a());
        System.out.println("info of Cylinder 1: " + cy1.toString());
        System.out.println("Area of Cylinder 1: " + cy1.a());
    }
}

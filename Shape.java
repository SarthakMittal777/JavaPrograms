public interface IShape {
    public boolean fitsText(String message);
}

class Circle implements IShape {
    int radius;
    String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public boolean fitsText(String message) {
        return message.length() < (2 * this.radius);
    }
}

class Rectangle implements IShape {
    int length;
    int width;
    String color;

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public boolean fitsText(String message) {
        return message.length() < this.width;
    }
}

public class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red");
        Rectangle rectangle = new Rectangle(10, 5, "Blue");

        System.out.println("Circle fits text 'Hello': " + circle.fitsText("Hello"));
        System.out.println("Rectangle fits text 'Hello': " + rectangle.fitsText("Hello"));
    }
}

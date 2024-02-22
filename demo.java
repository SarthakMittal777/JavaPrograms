// parent interface
interface Line {
    void drawLine();
}

// child interface Rectangle
interface Rectangle extends Line {
    void drawRectangle();
}

// child interface Triangle
interface Triangle extends Line {
    void drawTriangle();
}

// class Shape1 implements interfaces Rectangle, Triangle
class Shape1 implements Rectangle, Triangle {
    public void drawLine() {
        System.out.println("Line drawn for shape1");
    }

    public void drawRectangle() {
        System.out.println("Rectangle drawn for shape1");
    }

    public void drawTriangle() {
        System.out.println("Triangle drawn for shape1");
    }
}

// class Shape2 implements interfaces Rectangle, Triangle
class Shape2 implements Rectangle, Triangle {
    public void drawLine() {
        System.out.println("Line drawn for shape2");
    }

    public void drawRectangle() {
        System.out.println("Rectangle drawn for shape2");
    }

    public void drawTriangle() {
        System.out.println("Triangle drawn for shape2");
    }
}


public class demo {
    public static void main(String[] args) {
        Shape1 shape1 = new Shape1();
        Shape2 shape2 = new Shape2();

        shape1.drawLine();
        shape1.drawRectangle();
        shape1.drawTriangle();

        shape2.drawLine();
        shape2.drawRectangle();
        shape2.drawTriangle();
    }
}

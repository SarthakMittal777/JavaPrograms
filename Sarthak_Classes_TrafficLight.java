public class Sarthak_Classes_TrafficLight {
    //Write a Java program to create class called &quot;TrafficLight&quot; with attributes for color and
//duration, and methods to change the color and check for red or green and set the default
//colors using constructor.
    private String color;
    private int duration;

    public Sarthak_Classes_TrafficLight() {
        color = "Red";
        duration = 60;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("Red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("Green");
    }
    public static void main(String args[])
    {
        Sarthak_Classes_TrafficLight obj1=new Sarthak_Classes_TrafficLight();
        Sarthak_Classes_TrafficLight obj2=new Sarthak_Classes_TrafficLight();
        obj1.changeColor("Green");
        obj2.changeColor("Red");
        System.out.println(obj1.isRed());
        System.out.println(obj1.isGreen());
        System.out.println(obj2.isRed());
        System.out.println(obj2.isGreen());
    }
}

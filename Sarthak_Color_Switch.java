import java.util.Scanner;
public class Sarthak_Color_Switch {

    public static void main(String[] args) {
      
        System.out.println("red");
        System.out.println("blue");
        System.out.println("green");
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the color");
        String color=sc.nextLine();
        switch(color)
        {
            case "red":
                System.out.println("available");
                break;
            case "blue":
                System.out.println("available");
                break;
            case "green":
                System.out.println("available");
                break;
        
            default:
                System.out.println("invalid color");
        }

    }
    
}

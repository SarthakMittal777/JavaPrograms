import java.util.Scanner;
public class Sarthak_pract {
    public void Sarthak(int a, int b , int c)
    {
        if (a==b && b==c&& c==a)
        {
            System.out.println("Equilateral triangle");
        }
        else if (a==b || b==c || c==a)
        {
            System.out.println("Isosceles triangle");
        }
        else
        {
            System.out.println("Scalene triangle");
        }
    }
  public static void main(String[] args) {
    Sarthak_pract a =new Sarthak_pract(); //cons
    a.Sarthak(10,10,10); // function

    
  }
}

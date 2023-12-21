import java.util.Scanner;
public class Sarthak_Compare_Nos {
    public static void main (String[] args)
    {
        //compare two number 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        if (a>b)
        {
            System.out.println("First is greater than the second");
        }
        else if (a<b)
        {
            System.out.println("not like that");
        }
        else
        {
            System.out.println("equal");
        }

    }
    
}

import java.util.Scanner;
public class Sarthaks_Characters {
    public static void main(String[] args)
    {
        //WAP for Accepting single character, int, float, string and double value from the keyboard.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter char");
        char ch=sc.next().charAt(0);
        System.out.println("Enter int");
        int a=sc.nextInt();
        System.out.println("Enter float");
        float b=sc.nextFloat();
        System.out.println("Enter str");
        String str=sc.next();
        System.out.println("Enter double");
        double d=sc.nextDouble();
        System.out.println("The character is "+ch);
        System.out.println("The integer is "+a);
        System.out.println("The float is "+b);
        System.out.println("The string is "+str);
        System.out.println("The double is "+d);


    }
    
}

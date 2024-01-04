import java.util.Scanner;
public class Sarthak_Max_Min {
    //WAP to accept 3 nos. From command line arguments and print maximum, minimum and total of all three nos. 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a;
        int min=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        if(b<min)
        {
            min=b;
        }
        if(c<min)
        {
            min=c;
        }
        System.out.println("The maximum is "+max);
        System.out.println("The minimum  is "+min);
        System.out.println("total "+(a+b+c));
    }
   
}

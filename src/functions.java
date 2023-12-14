import java.util.Scanner;

public class functions {
    //known as methord
    public static void main(String[] args) {
        sum();


    }
    static void sum ()
    {  Scanner in=new Scanner(System.in);
        int d = in.nextInt();
        int c= in.nextInt();
        int sum = d+c;
        System.out.println("the sum of numbers is " + sum);
    }
}


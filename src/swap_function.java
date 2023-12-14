import java.util.Scanner;

public class swap_function {
    public static void main(String[] args) {
        swap();
    }
    static void swap()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number ");
        int d = in.nextInt();
        int e = in.nextInt();
        System.out.println(d);
        System.out.println(e);
        int temp =0;
        temp = d;
        d=e;
        e=temp;
        System.out.println(d);
        System.out.println(e);
    }
}

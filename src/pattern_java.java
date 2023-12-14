import java.util.Scanner;

public class pattern_java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i=0;
        int j=0;
        for (i=0; i<n; i++)
        {
            for (j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

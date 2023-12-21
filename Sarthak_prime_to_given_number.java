import java.util.Scanner;
public class Sarthak_prime_to_given_number {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();


        int i;
        int j;
        for (i=0;i<=n;i++)
        {
            for (j=2;j<i;j++)
            {
                if (i%j==0)
                {
                    break;
                }
            }
            if (i==j)
            {
                System.out.println(i);
            }
        }
    }
    
}

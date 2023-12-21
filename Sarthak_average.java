public class Sarthak_average {
    public static void main(String[] args)
    {
        //WAP to find average of consecutive N Odd numbers and even numbers.
        int i;  
        int sum=0;
        int osum=0;
        int n=10;
        for (i=0;i<=n;i++)
        {
            if (i%2==0)
            {
                sum=sum+i;
            }
            else
            {
                osum=osum+i;
            }
        }
        System.out.println(sum/n);
        System.out.println(osum/n);

    }
    
}

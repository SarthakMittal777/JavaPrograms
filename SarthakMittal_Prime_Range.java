public class SarthakMittal_Prime_Range {
    //WAP to check whether given number belongs to Fibonacci series or not in specified range. For example, 34 belongs to Fibonacci series whereas 51 doesn’t belongs to Fibonacci series.
    public static void main(String[] args)
    {
        int a=2;
        int b=100;
        int i,j;
        for(i=a;i<=b;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(i==j)
            {
                for(j=2;j<i-2;j++)
                {
                    if((i-2)%j==0)
                    {
                        break;
                    }
                }
                if(i-2==j)
                {
                    System.out.println("("+i+","+(i-2)+")");
                }
            }
        }
    }
    
}

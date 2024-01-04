public class Sarthak_Mittal_TwinPrime {
    //WAP to find the pair of twin prime number between the specific range. Hint: twin prime number means the difference between prime numbers is equal to 2.
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

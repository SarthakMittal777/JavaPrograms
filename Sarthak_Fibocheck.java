public class Sarthak_Fibocheck {
    //WAP to check whether given number belongs to Fibonacci series or not in specified range. For example, 34 belongs to Fibonacci series whereas 51 doesn’t belongs to Fibonacci series. 
    public static void main(String[] args)
    {
        int n=34;
        int a=0;
        int b=1;
        int c=0;
        while(c<n)
        {
            c=a+b;
            a=b;
            b=c;
        }
        if(c==n)
        {
            System.out.println("Fibonacci Number");
        }
        else
        {
            System.out.println("Not a Fibonacci Number");
        }
}
}

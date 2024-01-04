public class Sarthak_Harshad_Number {
    //WAP to check the whether a given number is Harshad number or given number or not. If a number which is divisible by the sum of its digits is known as Harshad number. For example, 21 is a Harshad number because 21 is divisible by the sum of its digits (2+1=3)
    public static void main(String[] args)
    {
        int n=21;
        int sum=0;
        int temp=n;
        while(temp>0)
        {
            int rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        if(n%sum==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not a Harshad Number");
        }
    }
}

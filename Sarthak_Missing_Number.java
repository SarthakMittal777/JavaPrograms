public class Sarthak_Missing_Number {
    //WAP that If ‘n‘ is the positive number and ‘a‘ is an array of integers of length ‘n-1’ containing elements from 1 to n. Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element is only once. For example, If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. For example {1, 4, 5, 3, 7, 8, 6}. One number will be missing in ‘a’ (2 in this case). You have to find out that missing number.
public static void main (String[] args)
{
    int n=8;
    int a[]={1,4,5,3,7,8,6};
    int sum=0;
    int i;
    for(i=0;i<n-1;i++)
    {
        sum=sum+a[i];
    }
    int sum1=0;
    for(i=1;i<=n;i++)
    {
        sum1=sum1+i;
    }
    System.out.println(sum1-sum);
}
}

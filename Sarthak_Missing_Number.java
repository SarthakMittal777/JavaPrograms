import java.util.Scanner;
public class Sarthak_Missing_Number {
    //WAP that If ‘n‘ is the positive number and ‘a‘ is an array of integers of length ‘n-1’ containing elements from 1 to n. Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element is only once. For example, If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. For example {1, 4, 5, 3, 7, 8, 6}. One number will be missing in ‘a’ (2 in this case). You have to find out that missing number.
public static void main (String[] args)
{
    int arr[];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    arr=new int[n];
    System.out.println("Enter the elements of array");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n-1;i++)
    {
        sum=sum+arr[i];
    }
    int sum1=0;
    for(int i=1;i<=n;i++)
    {
        sum1=sum1+i;
    }
    System.out.println("The missing number is "+(sum1-sum));
}
}
    
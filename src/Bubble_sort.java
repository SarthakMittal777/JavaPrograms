import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = new int[34];
        Scanner s = new Scanner(System.in);
        int i , temp, j ;
        int n = s.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]= s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if (arr[i]<arr[i+1])
            {
                temp= arr[i];
                arr[i]=arr[i+1];
                arr[i+i]= temp;
            }
        }
        for (i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}

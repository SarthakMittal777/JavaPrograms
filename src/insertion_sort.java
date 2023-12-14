import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        int i,j;
     int [] arr = new int[34];

        Scanner me = new Scanner(System.in);
        int n=me.nextInt(); // inputing the values
        int temp=0;
        for(i=0;i<n;i++)
        {
            arr[i]=me.nextInt();
        }

        for(i=0;i<n;i++)
        {
            temp= arr[i];
            for(j=i-1;j>=0;j--)
            {
                if(arr[j]>temp)
                {
                    arr[j+1]=arr[j];
                }
                else
                {
                    break;
                }
            }
            arr[j+1]=temp;
        }

        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
//sorted
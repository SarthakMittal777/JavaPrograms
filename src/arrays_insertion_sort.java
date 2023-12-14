import java.util.Arrays;
import java.util.Scanner;
public class arrays_insertion_sort {
    public static void main(String[] args) {
        int[] arr= {5,6,2,4,3};
        int i,j,temp;
        for(i=1;i<arr.length;i++)
        {
            temp=arr[i];
            j=i;
            while(j>0 && arr[j-1]>temp)
            {
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
        for (i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

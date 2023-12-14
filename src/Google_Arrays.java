import java.util.Arrays;
public class Google_Arrays {
    public static void main(String[] args) {
        //createing an array in formats of 2M+1
        int[] arr = {12,12,34,22,22};
        unique(arr,6);
    }
    static void unique(int[] arr,int n)
    {
        int count=0;
        int ans=0;
        int i;
        for(i=0;i<n;i++)
        {
            ans= ans ^ arr[i];
            count++;
        }
        System.out.println(ans);
        System.out.println(count);
    }
    }

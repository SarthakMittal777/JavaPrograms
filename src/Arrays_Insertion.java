import java.util.Arrays;
public class Arrays_Insertion {
    public static void main(String[] args) {
        int pos = 2;
        int element =78;
        int i;
        int [] arr = {10,20,30,40,50};
        for(i= (arr.length)-1;i>pos;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]= 78;
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

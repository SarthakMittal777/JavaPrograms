import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class array_operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= {1,2,3,4,4};
        System.out.println(arr.length);
        // inserting elemeny=t in beginninf
        arr[0]= 34;
        System.out.println(arr);

        // at the end
        arr[(arr.length)-1]=32;

        //at the given location
        System.out.println("where to add");
        int n = in.nextInt();
        arr[n]= 45;

        // sorted arrays
        System.out.println(Arrays.stream(arr).sorted());
        int i;
        for( i=0;i<arr.length;i++ )
        {
            System.out.print(arr[i]);
        }
        // merging an arrays

        int[] a = { 10, 20, 30, 40 };
        int[] b = { 50, 60, 70, 80 };
        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;
        int[] c = new int[c1];
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
        System.out.println(Arrays.toString(c));


        // removing arrays
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        arrList.remove(4);


        // inserting at the mid
        int[] arp = {1,3,4,5,6,3};
        if(arp.length%2==0)
        {
            System.out.println("enter the value you want to add");
            int s = in.nextInt();
            arp[arp.length/2]=s;
        }

        // inserting and shifinting elements
        int[] inse=new int[23];

    }
}

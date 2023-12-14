import java.util.Arrays;

public class arrays_import {
    public static void main(String[] args) {
        int[] arr= {1,232,121,12};
        Arrays.sort(arr);
        for(int i: arr)
        {
            System.out.println(i+" ");
        }

        System.out.println(arr);

    }

}



//    Time Complexity: O(nlog(n)) as it complexity of arrays.sort()
//        Auxiliary Space : O(1)



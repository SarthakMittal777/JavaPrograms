public class Deletion_Arrays {
    public static void main(String[] args) {
        int del= 30;
        int i,j;
        int[] arr = {10,20,30,40,50};
        for(i=0;i< arr.length;i++)
        {
            if (del==arr[i])
            {
                for(j=0;j<arr.length;j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }

        }
        for (i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

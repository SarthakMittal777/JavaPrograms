public class array_max_min {
    public static void main(String[] args) {
        int[] arr={1,22,33,2,3};
        arrays(arr, 4);
    }
    static void arrays(int [] arr,int n)
    {
        int i,temp=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]<arr[i+1])
            {
                 temp = arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;


            }
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[i]);
            System.out.println(arr[i]);
            System.out.println(arr[i]);

        }
    }
}

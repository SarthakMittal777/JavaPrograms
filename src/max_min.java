public class max_min {
    public static void main(String[] args) {
        int[] arr= {1,24,21,3,2};
        int i =0,max=0;
        for (i=0;i<5;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

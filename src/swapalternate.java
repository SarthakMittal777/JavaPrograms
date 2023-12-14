public class swapalternate {
    public static void main(String[] args) {
        int [] arr = {1,232,332,34,2};
        sa(arr,5);

    }
    static void sa(int[] arr, int n){
        int i=0;
        int temp=0;
        for(i=0;i<n;i=i+2)
        {
            if(i+1<n)
            {
                temp= arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        for(i=0;i<n;i=i+1)
        {
            System.out.println(arr[i]);
        }

    }
}

public class Arrays_Insertion_string {
    public static void main(String[] args) {
        int  pos = 4;
        char what = 's';
        char[] arr = {'f','r','i','e','n','d'};
        int i;
        for (i= (arr.length)-1;i>pos;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]= what;
        for (i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

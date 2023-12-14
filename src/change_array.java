public class change_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,5};
        System.out.println(arr[0]);
        arrays(arr);
    }
    static void arrays(int [] arr)
    {
        arr[1]= 23;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}

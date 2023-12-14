import java.util.Scanner;

public class Array_deletion {
    public static void main(String[] args) {
        int[] arr = new int[34];
        System.out.println("which elements to delete");
        int i;
        Scanner in = new Scanner(System.in);

        for (i=0;i<5;i++)
        {
            arr[i] = in.nextInt();
        }
        for (i=0;i<5;i++)
        {
            System.out.print(arr[i]+ ' ');

        }



    }
}

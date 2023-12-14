import java.util.Scanner;

public class arrayinput {
    // String[] Names = new String[6];
    // String[] arr = new String[34]
    // Stack<Integer> stack = new Stack<> ();
    public static void main(String[] args) {
        int i;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr=new int[23];
        for(i=0;i<n;i++)
        {
             arr[i]=s.nextInt();
        }
    }
}

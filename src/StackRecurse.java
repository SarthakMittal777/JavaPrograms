import java.util.Stack;
import java.util.Scanner;
public class StackRecurse {
    public static void main(String[] args) {
        int i;
        Stack stack = new Stack<>();
        int[] arr = new  int[89];
        Scanner me = new Scanner(System.in);
        for(i=0;i<9;i++)
        {
          arr[i]= me.nextInt();
        }
        for (i=0;i<arr.length;i++)
        {
            stack.push(arr[i]);
        }
        stacking(4,stack);


        //putting recurisons


    }
    static int stacking(int n,Stack stack)
    {
//        Stack stack=new Stack<>();
        System.out.println(stack.pop());
        return stacking(n-1,stack);
    }
}

import java.util.Stack;
public class Stacks {
    //develoupme
    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.capacity());
        System.out.println(stack.size());
        stack.push(23);
        for (int i =0; i<88775545;i++)
        {
            stack.push(i); // stack overflow
        }

    }
}

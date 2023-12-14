import java.util.Stack;
public class Stack_Push_Pop {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);stack.push(23);stack.push(23);stack.push(23);stack.push(23);
        System.out.println(stack.peek());
        System.out.println(stack.search(22));

         int k =1000000000;
//        System.out.println(stack.elements());
//        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.indexOf(23));
        System.out.println(stack.indexOf(23));
        System.out.println(stack.indexOf(23));
        System.out.println(stack.indexOf(23));
        System.out.println(stack.indexOf(23));
        System.out.println(stack.indexOf(23));
        System.out.println(stack.indexOf(23));
//        for(int i=0;i<k;i++)
//        {
//            stack.push(23);
//        }
        System.out.println(stack.capacity());

    }
}

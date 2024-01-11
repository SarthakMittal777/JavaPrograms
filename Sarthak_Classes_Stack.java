public class Sarthak_Classes_Stack {
    //Write a JAVA program to implement stack operations using the constructor and methods.
    private int[] stack;
    private int top;
    private int size;
    public Sarthak_Classes_Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }
    public void push(int element) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            stack[top] = element;
        }
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int element = stack[top];
            top--;
            return element;
        }
    }
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        Sarthak_Classes_Stack stack = new Sarthak_Classes_Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        System.out.println( stack.pop());
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.peek());
    }

}

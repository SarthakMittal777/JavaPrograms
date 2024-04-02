public class sarthak_collections_stack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        
        System.out.println("Stack: " + stack);
        
        int topElement = stack.peek();
        System.out.println("Top ele: " + topElement);
        
        int poppedElement = stack.pop();
        System.out.println("Popped ele: " + poppedElement);
        
        System.out.println("Stack after pop: " + stack);
        
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is emty " + isEmpty);
    }
}

class Stack {
    private int[] elements;
    private int top;
    
    public Stack() {
        elements = new int[10];
        top = -1;
    }
    
    public void push(int element) {
        if (top == elements.length - 1) {
            System.out.println("Stack full");
            return;
        }
        elements[++top] = element;
    }
    
    public int pop() {
        if (top == -1) {
            System.out.println("Stack e,py.");
            return -1;
        }
        return elements[top--];
    }
    
    public int peek() {
        if (top == -1) {
            System.out.println(" peek element.");
            return -1;
        }
        return elements[top];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]);
            if (i != top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
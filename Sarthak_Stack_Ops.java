public class Sarthak_Stack_Ops {
    //To write a program to implement stack operations
    public static void main(String[] args)
    {
        int[] stack=new int[5];
        int top=-1;
        int choice=0;
        int element=0;
        while(choice!=4)
        {
            System.out.println("Push");
            System.out.println("Pop");
            System.out.println("Display");
            System.out.println("Exit");
            System.out.println("Enter your choice");
            java.util.Scanner sc=new java.util.Scanner(System.in);
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    if(top==4)
                    {
                        System.out.println("Stack Overflow");
                    }
                    else
                    {
                        System.out.println("Enter the element to be pushed");
                        element=sc.nextInt();
                        top=top+1;
                        stack[top]=element;
                    }
                    break;
                }
                case 2:
                {
                    if(top==-1)
                    {
                        System.out.println("Stack Underflow");
                    }
                    else
                    {
                        element=stack[top];
                        top=top-1;
                        System.out.println("Popped element is "+element);
                    }
                    break;
                }
                case 3:
                {
                    if(top==-1)
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        System.out.println("Stack elements are");
                        for(int i=top;i>=0;i--)
                        {
                            System.out.println(stack[i]);
                        }
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Exiting");
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}

public class Sarthak_Queue {
    //To write a program to implement the Queue operations.
public static void main(String[] args)
{
    int[] queue=new int[5];
    int front=-1;
    int rear=-1;
    int choice=0;
    int element=0;
    while(choice!=4)
    {
        System.out.println("Insert");
        System.out.println("Delete");
        System.out.println("Display");
        System.out.println("Exit");
        System.out.println("Enter your choice");
        java.util.Scanner sc=new java.util.Scanner(System.in);
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                if(rear==4)
                {
                    System.out.println("Queue Overflow");
                }
                else
                {
                    System.out.println("Enter the element to be inserted");
                    element=sc.nextInt();
                    rear=rear+1;
                    queue[rear]=element;
                    if(front==-1)
                    {
                        front=0;
                    }
                }
                break;
            }
            case 2:
            {
                if(front==-1)
                {
                    System.out.println("Queue Underflow");
                }
                else
                {
                    element=queue[front];
                    front=front+1;
                    System.out.println("Deleted element is "+element);
                    if(front>rear)
                    {
                        front=-1;
                        rear=-1;
                    }
                }
                break;
            }
            case 3:
            {
                if(front==-1)
                {
                    System.out.println("Queue ept");
                }
                else
                {
                    System.out.println("Queue elements are");
                    for(int i=front;i<=rear;i++)
                    {
                        System.out.println(queue[i]);
                    }
                }
                break;
            }
            case 4:
            {
                System.out.println("Exit");
                break;
            }
            default:
            {
                System.out.println("Invalid");
            }
        }
    }
}
}

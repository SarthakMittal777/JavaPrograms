import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ListIterator;

public class sarthak_collection2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Add elements to the linked list
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter element to add: ");
            int element = scanner.nextInt();
            linkedList.add(element);
        }

        // Add element at a specific position
        System.out.print("Enter position to add element: ");
        int position = scanner.nextInt();
        System.out.print("Enter element to add: ");
        int element = scanner.nextInt();
        linkedList.add(position, element);

        // Add element at the beginning of the linked list
        System.out.print("Enter element to add at the beginning: ");
        element = scanner.nextInt();
        linkedList.addFirst(element);

      
        System.out.print("Enter element to add at the end: ");
        element = scanner.nextInt();
        linkedList.addLast(element);


        linkedList.removeFirst();


        linkedList.removeLast();

        System.out.print("Enter position to remove element: ");
        position = scanner.nextInt();
        linkedList.remove(position);

  
        System.out.print("Enter position to get element: ");
        position = scanner.nextInt();
        int retrievedElement = linkedList.get(position);
        System.out.println("Element at position " + position + ": " + retrievedElement);


        int firstElement = linkedList.getFirst();
        System.out.println("First element: " + firstElement);

        int lastElement = linkedList.getLast();
        System.out.println("Last element: " + lastElement);

        System.out.print("Enter position to set element: ");
        position = scanner.nextInt();
        System.out.print("Enter element to set: ");
        element = scanner.nextInt();
        linkedList.set(position, element);

        System.out.println("Traversing the linked list using for-each loop:");
        for (int num : linkedList) {
            System.out.println(num);
        }


        System.out.println("Traversing the linked list using iterator:");
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("Traversing the linked list using list iterator:");
        ListIterator<Integer> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class sarthak_collections1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

 
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element: ");
            int element = scanner.nextInt();
            list.add(element);
        }

        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter element: ");
            int element = scanner.nextInt();
            tempList.add(element);
        }
        list.addAll(tempList);

    
        System.out.println("Elements of list:");
        for (int element : list) {
            System.out.println(element);
        }

        System.out.print("Enter new element: ");
        int newElement = scanner.nextInt();
        list.set(3, newElement);


        System.out.print("Enter element to add at 5th position: ");
        int elementToAdd = scanner.nextInt();
        list.add(4, elementToAdd);

        System.out.println("Elements retrieved using Iterator:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Size of collection: " + list.size());

     
        System.out.print("Enter element to find its last occurrence: ");
        int elementToFind = scanner.nextInt();
        int lastIndex = list.lastIndexOf(elementToFind);
        System.out.println("Last occurrence index: " + lastIndex);

        System.out.print("Enter index of element to remove: ");
        int indexToRemove = scanner.nextInt();
        list.remove(indexToRemove);

        System.out.print("Enter element to remove: ");
        int elementToRemove = scanner.nextInt();
        list.remove(Integer.valueOf(elementToRemove));

        System.out.println("Traversing the list using ListIterator:");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        scanner.close();
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class sarthak_collections_queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

      
        queue.add(10);
        queue.add(20);
        queue.add(30);


        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

    
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);


        boolean isEmpty = queue.isEmpty();
        System.out.println("Is empty? " + isEmpty);

        int size = queue.size();
        System.out.println("Size queue: " + size);
    }
}

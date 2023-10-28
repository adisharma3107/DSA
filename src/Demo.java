import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class Demo {
//    how to find out the recent updated element in a queue  linked list java and update the the least used element
//    LRU ()
//     1, 2, 3, 1, 4, 5
        public static void main(String[] args) {
            LinkedList<Integer> queue = new LinkedList<>();

            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(1);
            // Get the most recently used element
            int recent = queue.peek();

            System.out.println(recent);
            // Update the least recently used element
            queue.removeLast();
            queue.add(4);

            // Print the queue
            System.out.println(queue);
        }
    }
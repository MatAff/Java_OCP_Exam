package Chapter03;

import java.util.*;

public class QueueExp {

    public static void main(String... args) {

        // Initialize double ended queue
        Deque q = new ArrayDeque();

        // Offer (Should do same as add)
        q.offer(0);

        // Add elements
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
 
        // Peek
        System.out.println(q.peek());
        System.out.println(q.peek());
 
        // Element (same as peek)
        System.out.println("Element " + q.element()); 

        // Poll
        System.out.println("Poll " + q.poll());
        System.out.println("Poll " + q.poll());
      
        // Remove (should do the same as poll)
        System.out.println("Remove " + q.remove());

        // Pop only for Stack!!!

        // Push
        q.push(999);
        System.out.println(q.poll());
        
    }

}

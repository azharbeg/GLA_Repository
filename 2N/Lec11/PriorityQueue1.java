
import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args) {
        // Default: Min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(10);
        minHeap.offer(5);
        minHeap.offer(20);

        System.out.println("Smallest element is = " + minHeap.peek());  // 5 (smallest element)

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll()); // 5 10 20
        }
    }
 }


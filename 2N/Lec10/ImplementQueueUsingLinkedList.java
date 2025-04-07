 
    // Node class for the linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue class using linked list
class ImplementQueueUsingLinkedList {
    private Node front, rear;

    public ImplementQueueUsingLinkedList() {
        this.front = this.rear = null;
    }

    // Enqueue operation
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue operation
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = front.data;
        front = front.next;

        // If front becomes null, then set rear to null as well
        if (front == null) {
            rear = null;
        }

        return value;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Peek at the front element
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }
}

public class Main {
    public static void main(String[] args) {
        ImplementQueueUsingLinkedList queue = new ImplementQueueUsingLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek()); // 10
        System.out.println("Dequeued: " + queue.dequeue());   // 10
        System.out.println("Dequeued: " + queue.dequeue());   // 20
        System.out.println("Is queue empty? " + queue.isEmpty()); // false
        System.out.println("Dequeued: " + queue.dequeue());   // 30
        System.out.println("Is queue empty? " + queue.isEmpty()); // true
    }
}

 // Node class for the linked list
 class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue implementation using Linked List
class Queue {
    private Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    // Enqueue (Insert element at rear)
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) { // If queue is empty
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue (Remove element from front)
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    // Peek (Get front element)
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

    public class ImplementQueueUsingLinkedList {
        public static void main(String[] args) {
        Queue q = new Queue();
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); // Output: 10 <- 20 <- 30 <- NULL
        
        System.out.println("Dequeued: " + q.dequeue()); // Output: Dequeued: 10
        q.display(); // Output: 20 <- 30 <- NULL

        System.out.println("Front element: " + q.peek()); // Output: Front element: 20
    }
}
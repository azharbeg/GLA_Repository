 

public class QueueUsingArray {
    int[] arr;      // Array to store queue elements
    int front;      // Points to the front element
    int rear;       // Points to the rear element
    int size;       // Maximum size of the queue

    // Constructor
    public QueueUsingArray(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;  // Initially empty
        rear = -1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Enqueue: Add an element to the rear
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }
        if (isEmpty()) {
            front = 0;  // First element added
        }
        arr[++rear] = data;
        System.out.println("Enqueued: " + data);
    }

    // Dequeue: Remove an element from the front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removedElement = arr[front];
        System.out.println("Dequeued: " + removedElement);
        if (front == rear) {
            // Reset if only one element was present
            front = rear = -1;
        } else {
            front++;
        }
        return removedElement;
    }

    // Peek: Get the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return -1;
        }
        return arr[front];
    }

    // Display Queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main Method to Test
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Front Element: " + queue.peek());

        queue.dequeue();
        queue.display();

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.display();

        queue.dequeue();
        queue.display();
    }
}

        
   // Circular Queue Implementation (Fixed Size)

  class MyCircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyCircularQueue(int k) {
        capacity = k;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    public boolean enQueue(int value) {
        if (isFull()) return false;

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }

    // Dequeue
    public boolean deQueue() {
        if (isEmpty()) return false;

        front = (front + 1) % capacity;
        size--;
        return true;
    }

    // Get Front
    public int Front() {
        if (isEmpty()) return -1;
        return queue[front];
    }

    // Get Rear
    public int Rear() {
        if (isEmpty()) return -1;
        return queue[rear];
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if full
    public boolean isFull() {
        return size == capacity;
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        MyCircularQueue cq = new MyCircularQueue(3);

        System.out.println(cq.enQueue(10)); // true
        System.out.println(cq.enQueue(20)); // true
        System.out.println(cq.enQueue(30)); // true
        System.out.println(cq.enQueue(40)); // false, full

        System.out.println(cq.Rear());      // 30
        System.out.println(cq.isFull());    // true

        System.out.println(cq.deQueue());   // true
        System.out.println(cq.enQueue(40)); // true
        System.out.println(cq.Rear());      // 40
    }
}



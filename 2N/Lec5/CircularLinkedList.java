 
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class CircularLinkedList {

    Node head;

    // Insert at the end of the circular linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head; // Circular connection
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Traverse the circular linked list
    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Delete node at a specific position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        Node temp = head;

        // If head needs to be removed
        if (position == 1) {
            if (head.next == head) {
                head = null; // Only one node
            } else {
                // Find the last node
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next; // Bypass head
                head = head.next; // Update head
            }
            return;
        }

        // Traverse to the previous node of the position to be deleted
        for (int i = 1; temp.next != head && i < position - 1; i++) {
            temp = temp.next;
        }

        // If position is invalid
        if (temp.next == head) {
            System.out.println("Invalid position.");
            return;
        }

        // Delete the node by adjusting the links
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        
        // Inserting elements
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        
        System.out.println("Original Circular Linked List:");
        cll.traverse();
        
        // Deleting nodes
        cll.deleteAtPosition(2);
        System.out.println("After deleting node at position 2:");
        cll.traverse();
        
        cll.deleteAtPosition(1);
        System.out.println("After deleting node at position 1 (head):");
        cll.traverse();
    }
}

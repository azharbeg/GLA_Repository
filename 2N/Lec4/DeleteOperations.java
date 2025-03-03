public class DeleteOperations {

    // Delete from the beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

     // Delete from the end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete from a specific position (1-based index)
    public void deleteFromPosition(int position) {
        if (head == null || position < 1) {
            System.out.println("Invalid position or list is empty");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        temp.next = temp.next.next;
    }
}

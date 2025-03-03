import java.lang.classfile.components.ClassPrinter.ListNode;

public class MiddleElement {

    public ListNode middleNode(ListNode head) {
     
        ListNode slow = head;
        ListNode fast = head;

         while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
         }
         return slow;
    }
}

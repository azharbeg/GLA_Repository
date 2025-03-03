import java.lang.classfile.components.ClassPrinter.ListNode;

public class Palindrome {

    ListNode slow = head;
    ListNode fast = head;
    ListNode prev = null;
    while(fast!=null && fast.next!=null){
        fast = fast.next.next;
        ListNode nextN = slow.next;
        slow.next = prev;
        prev = slow;
        slow = nextN;
    }
    if(fast!=null){
        slow = slow.next;
    }
    while(slow!=null){
        if(prev.val!=slow.val){
            return false;
        }
        prev = prev.next;
        slow = slow.next;
    }
    return true;
}

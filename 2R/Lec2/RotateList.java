package 2R.Lec2;

public class RotateList {

    public ListNode findNthNode(ListNode temp, int k){
        int cnt = 1;
        while(temp != null){
            if(cnt == k) return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null) return head;
        ListNode tail = head;
        int length = 1;
        
        while(tail.next != null){
            tail = tail.next;
            length++;
        }
        // length and tail found
        if(k % length == 0) return head; 
        k = k % length;
       
        tail.next = head;  // 1 step

        ListNode newLastNode = findNthNode(head, length - k);

        head = newLastNode.next;
        newLastNode.next = null;       

        return head;   
    }
}

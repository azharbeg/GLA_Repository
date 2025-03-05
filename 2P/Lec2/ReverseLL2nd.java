package 2P.Lec3;

public class ReverseLL2nd {

    // base case
    if(head == null || head.next == null || left == right ){
        return head;
    }
    ListNode curr = head;
    ListNode prev = null;
    int i = 1;
    
    // hum left tak jayenge
    while(curr != null && i != left){

        prev = curr;
        curr = curr.next;
        i++;
    }
    // later LL ko link krne ke liye
    ListNode pointerToStart = prev;  // left se phle link
    ListNode start = curr;   // right ke baad ka link
    prev = null;

    // ab given window ko reverse krenge
    while(curr != null && i != right + 1){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        i++;
    }
    start.next = curr;  // right + 1
    if(pointerToStart != null){
        pointerToStart.next = prev;
    }else{
        return prev;   // if left index is 0 then it will become new head
    }
    return head;


  }
}

package 2P.Lec4;

public class ImplementQueueUsingStack {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 =  new Stack<>();
   public MyQueue() {
       
   }
   
   public void push(int x) {
       while(!st1.isEmpty()){
           int data = st1.pop();
           st2.push(data);
       }
       st1.push(x);
       while(!st2.isEmpty()){
           int data = st2.pop();
           st1.push(data);
       }        
   }
   
   public int pop() {
       if(empty()) return -1;
       return st1.pop();
        
   }  
   public int peek() {
       if(empty()) return -1;
       return st1.peek();
         
   } 
   public boolean empty() {
       return st1.isEmpty();
    }
}

package 2Q.Lec3;

public class MinStack {

    int min = Integer.MAX_VALUE;
    Stack<Integer> stackobj = new Stack<Integer>();

    public MinStack() {
       // Stack<Integer> stackobj = new Stack<Integer>();
    }
    
    public void push(int val) {
        
        if(val <= min){
            stackobj.push(min);
            min = val;
        }
        stackobj.push(val);
    }
    
    public void pop() {
        if(stackobj.pop() == min) min = stackobj.pop();
    }
    
    public int top() {
        return stackobj.peek();
    }
    
    public int getMin() {
        return min;
    }
}

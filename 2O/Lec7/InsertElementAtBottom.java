package 2O.Lec7;

public class InsertElementAtBottom {

    public static void insertAtBottom(Stack<Integer> stack, int x) {
        // Base case: If the stack is empty, push the element
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }

        // Remove the top element and store it
        int temp = stack.pop();

        // Recursive call to insert the element at bottom
        insertAtBottom(stack, x);

        // Push the stored element back to the stack
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Original Stack: " + stack);
        
        insertAtBottom(stack, 5);

        System.out.println("Stack After Inserting 5 at Bottom: " + stack);
    }
}

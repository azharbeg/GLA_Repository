package 2N.Lec6;

public class ReverseStackUsingExtraStack {

    public static void reverseStack(Stack<Integer> stack) {
        // Create an extra stack
        Stack<Integer> extraStack = new Stack<>();

        // Pop elements from original stack and push to extraStack
        while (!stack.isEmpty()) {
            extraStack.push(stack.pop());
        }

        // Copy elements back to the original stack
        while (!extraStack.isEmpty()) {
            stack.push(extraStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}

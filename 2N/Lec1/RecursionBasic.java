public class RecursionBasic {

    // Sum on n natural number
    public static int sumOfNatural(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }
        // Recursive case
        return n + sumOfNatural(n - 1);
    }

    // Recursive function to calculate factorial
    public static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }

    // Recursive function to find the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Recursive function to check if a string is palindrome
    public static boolean isPalindrome(String str, int left, int right) {
       
        // Base case
        if (left >= right) return true;
        
        // If characters at left and right indices don't match, not a palindrome
        if (str.charAt(left) != str.charAt(right)) return false;
        
        // Recursive call
        return isPalindrome(str, left + 1, right - 1);
    }
}

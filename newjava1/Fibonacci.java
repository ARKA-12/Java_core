public class Fibonacci {

    // Iterative method to find the nth Fibonacci number
    public static int fibonacciIterative(int n) {
        if(n ==0) return 1;
        if (n == 1) return n;
        
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 1; // Example: Find the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is " + fibonacciIterative(n));
    }
}
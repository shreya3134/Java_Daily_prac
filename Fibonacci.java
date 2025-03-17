
public class Fibonacci{

    // Recursive method to return the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0; // F(0)
        } else if (n == 1) {
            return 1; // F(1)
        }
        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Print first 10 Fibonacci numbers
        System.out.println("First " + n + " Fibonacci numbers:");
        
        // Print Fibonacci numbers from F(0) to F(n-1)
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}


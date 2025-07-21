package tcandalgo;

public class FibonacciPerformance {

    public static long fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static long fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] fibonacciNValues = {10, 30, 45}; // 50 is truly unfeasible for standard recursion

        for (int N : fibonacciNValues) {
            long startTime, endTime;

            System.out.println("Fibonacci (N): " + N);

            // Recursive
            if (N <= 45) { // Adjust limit based on your system's performance
                startTime = System.nanoTime();
                fibonacciRecursive(N);
                endTime = System.nanoTime();
                System.out.println("Recursive (O(2^n)): " + (endTime - startTime) / 1_000_000 + "ms");
            } else {
                System.out.println("Recursive (O(2^n)): Unfeasible (>1hr)");
            }

            // Iterative
            startTime = System.nanoTime();
            fibonacciIterative(N);
            endTime = System.nanoTime();
            System.out.println("Iterative (O(N)): " + (endTime - startTime) / 1_000_000 + "ms");
            System.out.println("--------------------");
        }
    }
}

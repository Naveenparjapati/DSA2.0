package Sir_Program;

public class Print_Fibonacci_series_as_a_string {

    public static void main(String[] args) {
        int n = 10;  // Number of terms in the Fibonacci series
        String fibonacciString = generateFibonacciAsString(n);
        System.out.println("Fibonacci series as a string: " + fibonacciString);
    }

    // Function to generate Fibonacci series as a string
    public static String generateFibonacciAsString(int n) {
        if (n <= 0) {
            return "";  // Return an empty string if n is less than or equal to 0
        }

        StringBuilder fibonacciString = new StringBuilder();

        // First two Fibonacci numbers
        int first = 0, second = 1;

        // Special case for n = 1
        if (n == 1) {
            fibonacciString.append(first);
            return fibonacciString.toString();
        }

        // Append the first two Fibonacci numbers
        fibonacciString.append(first).append(" ").append(second);

        // Generate and append the rest of the Fibonacci numbers
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            fibonacciString.append(" ").append(next);
            first = second;
            second = next;
        }

        return fibonacciString.toString();
    }
}
